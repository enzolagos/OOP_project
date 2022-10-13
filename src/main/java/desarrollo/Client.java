package desarrollo;

import java.util.ArrayList;
import java.util.List;

//importo prioridades
import static desarrollo.Issues.Severidad.*;
import static desarrollo.TestCase.Prioridad.HIGH;
import static desarrollo.TestCase.Prioridad.LOW;
import static desarrollo.TestCase.Prioridad.MEDIUM;
//importo severidades

//importo estados del test


public class Client {
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
        Pasos pasosTC1 = new Pasos(new String[]{"1) Click en el boton [LOGIN]","2) Completar campo EMAIL con 'enzo.lagos@gmail.com'","3)Completar campo CONTRASENA con '123456'","4)Click en LOGUEARSE"});
        TestCase tc1 = new TestCase("Inspeccion de boton [LOGIN]", HIGH,pasosTC1,qa1);
        tc1.setDescription("El siguiente test es para verificar si el boton de login funciona correctamente");

        Pasos pasosTC2 = new Pasos(new String[]{"1) Click en el boton [REGISTER]"});
        TestCase tc2 = new TestCase("Inspeccion de boton [REGISTER]", MEDIUM,pasosTC2,qa2);
        tc2.setDescription("Se verifica si el boton register funciona al hacerle click");

        Pasos pasosTC3 = new Pasos(new String[]{});
        TestCase tc3 = new TestCase("Inspeccion de boton [RECUPERAR CONTRASENA]", LOW, pasosTC3,qa3);
        tc3.setDescription("Se verifica si el boton recuperar contraseña funciona");

        Pasos pasosTC4 = new Pasos(new String[]{"1)Click en el campo email","2)Escribir su mail","3)Click en el campo contrasena","4)Completar contrasena","5) Click en crear cuenta"});
        TestCase tc4 = new TestCase("Login con mail invalido y contrasena valida", HIGH, pasosTC4,qa5);
        tc4.setDescription("Se verifica si el usuario puede crear una cuenta");

        Pasos pasosTC5 = new Pasos(new String[]{"1)Click en el boton [INGRESAR]","2)Sin soltar, arrastrar hacia afuera del boton"});
        TestCase tc5 = new TestCase("Login con mail valido y contrasena valida", HIGH, pasosTC5,qa4);
        tc5.setDescription("Se verifica que el boton ingresar no funciona si el usuario lo arrastra");

        Pasos pasosTC6 = new Pasos(new String[]{"1)Click en el boton registrar","2)Escribir mail","3)Escribir contrasena"});
        TestCase tc6 = new TestCase("Registrarse con mail valido y contrasena valida", LOW, pasosTC6,qa1);
        tc6.setDescription("Se verifica si el usuario puede registrarse");

        Pasos pasosTC7 = new Pasos(new String[]{"1)Click en el boton registrar","2)Escribir su mail","3)Escribir contrasena"});
        TestCase tc7 = new TestCase("Login con mail invalido y contrasena valida", MEDIUM, pasosTC7,qa2);
        tc7.setDescription("Se verifica si el usuario NO puede registrarse con datos invalidos");

        Pasos pasosTC8 = new Pasos(new String[]{"1)Click en el boton registrar","2)Escribir su mail","3)Click en el campo contrasena"});
        TestCase tc8 = new TestCase("Login con mail invalido y contrasena invalida", HIGH, pasosTC8,qa5);
        tc8.setDescription("Se verifica si el usuario NO puede registrarse con datos invalidos");

        Pasos pasosTC9 = new Pasos(new String[]{"1)Click en el campo contraseña vieja","2)Escribir contraseña vieja","3)Click en el campo contrasena nueva","4)ingresar contrasena nueva","5) Click en cambiar contraseña"});
        TestCase tc9 = new TestCase("Contraseña nueva con datos validos y contraseña vieja con datos validos", HIGH, pasosTC9,qa4);
        tc9.setDescription("Se verifica si el usuario puede cambiar contraseña");

        Pasos pasosTC10 = new Pasos(new String[]{"1)Click en el campo contraseña vieja","2)Escribir contraseña vieja","3)Click en el campo contrasena nueva","4)ingresar contrasena nueva","5) Click en cambiar contraseña"});
        TestCase tc10 = new TestCase("Contraseña nueva con datos invalidos y contraseña vieja con datos validos", LOW, pasosTC10,qa5);
        tc10.setDescription("Se verifica que el usuario NO pueda cambiarse de contraseña con datos invalidos");


        //se crean bugs y enhancements y se asocian a un dev
        Bug bug1 = new Bug("Error de login","No funciona cuando apreto el boton",HIGH,pasosTC1, BLOQUEADORA,"Aparece error 505","Deberia ya estar logueado");
        dev1.getBugAsignados().add(bug1);
        Bug bug2 = new Bug("Error de Logout","No aparece el boton",HIGH,pasosTC1, ALTA,"Aparece error 505","Deberia poderse salir");
        dev2.getBugAsignados().add(bug2);
        Bug bug3 = new Bug("Error de Register","No pasa nada cuando el usuario se quiere registrar",HIGH,pasosTC1, BAJA,"Aparece error 505","Deberia poder registrarse");
        dev2.getBugAsignados().add(bug3);
        Bug bug4 = new Bug("Error de carga de pagina","No aparece el boton",HIGH,pasosTC1, MEDIA,"La pagina se cierra inesperadamente","Deberia cargar");
        dev1.getBugAsignados().add(bug4);

        Enhancement enh1 = new Enhancement("Cambiar color boton Login","El color no contrasta con el fondo",LOW,pasosTC1,BAJA,"El boton esta azul","El boton deberia ser blanco");
        enh1.setDevAsiganado(dev2);

        List <Issues> listaDeIssues = new ArrayList<>();
        listaDeIssues.addAll(List.of(new Issues[]{bug1,bug2,bug3,bug4,enh1}));


        //se crea el testsuite y se agregan los tests sin ejecutar
        TestSuite testSuite1 = new TestSuite("Login/Register","4");
        testSuite1.setTestPorEjecutar(List.of(new TestCase[]{tc1,tc2,tc3,tc4,tc5})); //agregar mas tc de ser necesario
        testSuite1.setIssuesAsociados(listaDeIssues);

        //se ejecutan los test y se agregan al testSuite
        System.out.println("************SE EJECUTAN LOS TESTS************");
        testSuite1.ejecutarTestCases(listaDeIssues);

        System.out.println("************SE EJECUTAN METODOS************");

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
