package desarrollo;

import java.util.List;

//importo prioridades
import static desarrollo.TestCase.Prioridad.HIGH;
import static desarrollo.TestCase.Prioridad.LOW;
import static desarrollo.TestCase.Prioridad.MEDIUM;
//importo severidades
import static desarrollo.Issues.Severidad.BLOQUEADORA;
import static desarrollo.Issues.Severidad.ALTA;
import static desarrollo.Issues.Severidad.MEDIA;
import static desarrollo.Issues.Severidad.BAJA;
import static desarrollo.Issues.Severidad.TRIVIAL;
//importo estados del test
import static desarrollo.TestCase.EstadosDelTest.PASSED;
import static desarrollo.TestCase.EstadosDelTest.BLOCKED;
import static desarrollo.TestCase.EstadosDelTest.FAILED;





public class newClient {
    public static void main(String[] args) {
        //se crean los OWNERS
        QA qa1 = new QA("Enzo","Lagos");
        QA qa2 = new QA("Julian", "Barbieri");
        QA qa3 = new QA("Agustin","Spitale");
        QA qa4 = new QA("Federico", "Padin");
        QA qa5 = new QA("Federico", "Roman");
        QA qa6 = new QA("Emanuel", "Ditzel");

        DEV dev1 = new DEV("Pedro", "Nalga");
        DEV dev2 = new DEV("Carlos", "Paleta");

        //creo unos pasos para testear
        Pasos pasos = new Pasos(new String[]{"1) Click en el boton [LOGIN]","2) Completar campo EMAIL con 'enzo.lagos@gmail.com'","3)Completar campo CONTRASENA con '123456'","4)Click en LOGUEARSE"});

        //se crean los test
        TestCase tc1 = new TestCase("Inspeccion de boton [LOGIN]", HIGH,pasos,qa1);
        TestCase tc2 = new TestCase("Inspeccion de boton [REGISTER]", HIGH,pasos,qa2);
        TestCase tc3 = new TestCase("Inspeccion de boton [RECUPERAR CONTRASENA]", HIGH, pasos,qa3);
        TestCase tc4 = new TestCase("Login con mail invalido y contrasena valida", HIGH, pasos,qa5);
        TestCase tc5 = new TestCase("Login con mail valido y contrasena valida", HIGH, pasos,qa4);
        TestCase tc6 = new TestCase("Login con mail valido y contrasena invalida", HIGH,pasos,qa4);
        TestCase tc7 = new TestCase("Login con campos en blanco", HIGH, pasos,qa6);
        TestCase tc8 = new TestCase("Inspeccion de boton [LOGOUT]", MEDIUM, pasos,qa1);
        TestCase tc9 = new TestCase("Creacion de cuenta", LOW,pasos,qa2);
        TestCase tc10 = new TestCase("Recuperacion de contrasena", LOW,pasos,qa5);

        //se crean bugs y enhancements
        Bug bug1 = new Bug("Error de login","No funciona cuando apreto el boton",HIGH,pasos, BLOQUEADORA,"Aparece error 505","Deberia ya estar logueado");
        bug1.setDevAsiganado(dev1);
        Bug bug2 = new Bug("Error de Logout","No aparece el boton",HIGH,pasos, ALTA,"Aparece error 505","Deberia poderse salir");
        bug2.setDevAsiganado(dev2);
        Enhancement enh1 = new Enhancement("Cambiar color boton Login","El color no contrasta con el fondo",LOW,pasos,BAJA,"El boton esta azul","El boton deberia ser blanco");
        enh1.setDevAsiganado(dev2);

        //se crea el testsuite y se agregan los tests sin ejecutar
        TestSuite testSuite1 = new TestSuite("Login/Register","4");
        testSuite1.setTestPorEjecutar(List.of(new TestCase[]{tc1, tc2, tc3, tc4, tc5, tc6, tc7, tc8, tc9, tc10}));

        //se ejecutan los test y se agregan al testSuite
        testSuite1.agregarATestCasesEjecutados(tc1.ejecutar("11/10",bug1, FAILED));
        testSuite1.agregarATestCasesEjecutados(tc2.ejecutar("11/10",null, PASSED));
        testSuite1.agregarATestCasesEjecutados(tc3.ejecutar("11/10",null, PASSED));
        testSuite1.agregarATestCasesEjecutados(tc4.ejecutar("11/10",null, PASSED));
        testSuite1.agregarATestCasesEjecutados(tc5.ejecutar("11/10",bug2, BLOCKED));
        testSuite1.agregarATestCasesEjecutados(tc6.ejecutar("11/10",bug1, PASSED));
        testSuite1.agregarATestCasesEjecutados(tc7.ejecutar("11/10",null, PASSED));
        testSuite1.agregarATestCasesEjecutados(tc8.ejecutar("11/10",null, PASSED));
        testSuite1.agregarATestCasesEjecutados(tc9.ejecutar("11/10",enh1, PASSED));
        testSuite1.agregarATestCasesEjecutados(tc10.ejecutar("11/10",bug2, BLOCKED));

        //muestro TC creados por un qa
        System.out.println("*** test cases creados por: "+qa4.toString()+" ***");
        testSuite1.mostrarTests(testSuite1.obtenerTestCasesCreadosPorUnQA(qa4));

        //muestro bugs asignados a un dev
        System.out.println("*** bugs asignados a:"+dev2.toString()+" ***");
        testSuite1.mostrarBugs(testSuite1.obtenerBugsAsociadosAlDev(dev2));

        //muestro tc por prioridad
        System.out.println("*** TC con prioridad HIGH");
        testSuite1.mostrarTests(testSuite1.obtenerTestCasesPorPrioridad(TestCase.Prioridad.HIGH));

        //muestro bugs con severidad especifica
        System.out.println("*** Bugs con severidad ALTA ***");
        testSuite1.mostrarBugs(testSuite1.obtenerBugsPorSeveridad(Issues.Severidad.ALTA));

        //muestro estados de los test
        System.out.println("*** Estados de los test ejecutados ***");
        testSuite1.mostrarEstadoDeTests();




    }
}
