package desarrollo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List <QA> listaDeQAs = new ArrayList<>();
        listaDeQAs.addAll(List.of(new QA[]{qa1,qa2,qa3,qa4,qa5,qa6}));

        DEV dev1 = new DEV("Pedro", "Nalga");
        DEV dev2 = new DEV("Carlos", "Paleta");
        List <DEV> listaDeDEVs = new ArrayList<>();
        listaDeDEVs.addAll(List.of(new DEV[]{dev1,dev2}));


        //se crean los test
        Pasos pasos = new Pasos(new String[]{"1) Click en el boton [LOGIN]","2) Completar campo EMAIL con 'enzo.lagos@gmail.com'","3)Completar campo CONTRASENA con '123456'","4)Click en LOGUEARSE"});
        TestCase tc1 = new TestCase("Inspeccion de boton [LOGIN]", HIGH,pasos,qa1);
        tc1.setDescription("El siguiente test es para verificar si el boton de login funciona correctamente");

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

        List <Issues> listaDeIssues = new ArrayList<>();
        listaDeIssues.addAll(List.of(new Issues[]{bug1,bug2,enh1}));


        //se crea el testsuite y se agregan los tests sin ejecutar
        TestSuite testSuite1 = new TestSuite("Login/Register","4");
        testSuite1.setTestPorEjecutar(List.of(new TestCase[]{tc1, tc2, tc3, tc4, tc5, tc6, tc7, tc8, tc9, tc10}));

        //se ejecutan los test y se agregan al testSuite
        testSuite1.ejecutarTestCases(listaDeIssues);


        //muestro TC creados por un qa
        System.out.println("****** test cases creados por un QA especifico ******");
        testSuite1.mostrarTests(testSuite1.obtenerTestCasesCreadosPorUnQA(IngresoDeDatos.elegirQA(listaDeQAs)));

        //muestro bugs asignados a un dev
        System.out.println("****** bugs asignados a un DEV especifico ******");
        testSuite1.mostrarBugs(testSuite1.obtenerBugsAsociadosAlDev(IngresoDeDatos.elegirDEV(listaDeDEVs)));

        //muestro tc por prioridad
        System.out.println("*** TC por prioridad especifica");
        testSuite1.mostrarTests(testSuite1.obtenerTestCasesPorPrioridad(IngresoDeDatos.elegirPrioridad()));

        //muestro bugs con severidad especifica
        System.out.println("*** Bugs con severidad especifica ***");
        testSuite1.mostrarBugs(testSuite1.obtenerBugsPorSeveridad(IngresoDeDatos.elegirSeveridad()));

        //muestro estados de los test
        System.out.println("*** Estados de los test ejecutados ***");
        testSuite1.mostrarEstadoDeTests();




    }
}
