package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class ClientEnzo {
    public static void main(String[] args) {/*
        //lista test ejecutado
        List<TestCaseEjecutado> testCasesEjecutado = new ArrayList<>();

        //creo un owner String nombre, String apellido, String rol


        //creo dev
        DEV dev1 = new DEV("juli", "barbi");

        //creo test
        TestCase testcase1 = new TestCase("Test case 1", TestCase.Prioridad.MEDIUM, new Pasos(new String[]{"pasoss"}), );


        //creo bugs
        Bug bug1 = new Bug();
        bug1.setDevAsiganado(dev1);
        bug1.setTitulo("ERROR N°1");
        bug1.setSeveridad(Issues.Severidad.ALTA);
        Bug bug2 = new Bug();
        bug2.setDevAsiganado(dev1);
        bug2.setTitulo("ERROR N°2");
        bug2.setSeveridad(Issues.Severidad.ALTA);

        //ejecuto test case
        TestCaseEjecutado testCaseEjecutado2 = testcase1.ejecutar("15.61", bug1, TestCase.EstadosDelTest.FAILED);
        TestCaseEjecutado testCaseEjecutado3 = testcase1.ejecutar("6.18", bug2, TestCase.EstadosDelTest.FAILED);

        //agrego a la lista de ejecutados
        TestSuite testSuite = new TestSuite("Tests", "4");
        testSuite.agregarATestCasesEjecutados(testCaseEjecutado2);
        testSuite.agregarATestCasesEjecutados(testCaseEjecutado3);

        //muestro bugs segun el dev asociado

        System.out.println("*** BUGS ASOCIADOS AL: "+dev1.toString()+" ***");
        testSuite.mostrarBugs(testSuite.obtenerBugsAsociadosAlDev(dev1));

        System.out.println("*************");


        //Se desea tener un método donde me muestre los test cases creados por un específico QA

        //creo QA
        QA qa1 = new QA("Enzo", "Lagos");

        //creo test cases

        TestCase test1 = new TestCase("Error 1", TestCase.Prioridad.HIGH,new Pasos(new String[]{"pasoss"}),qa1);
        TestCase test2 = new TestCase("Error 2", TestCase.Prioridad.MEDIUM,new Pasos(new String[]{"pasos 2"}),qa1);

        //agrego test case a tc comun y ejecutados
        testSuite.agregarATestCasesPorEjecutar(test1);
        //testSuite.agregarATestCasesEjecutados(test1.ejecutar("random",bug1, TestCase.EstadosDelTest.PASSED));
        testSuite.agregarATestCasesPorEjecutar(test2);
        //testSuite.agregarATestCasesEjecutados(test2.ejecutar("aaaaa",bug2, TestCase.EstadosDelTest.BLOCKED));


        //Mostrar test cases creados por QA

        System.out.println("*** test cases creados por: "+qa1.toString()+" ***");
        testSuite.mostrarTests(testSuite.obtenerTestCasesCreadosPorUnQA(qa1));

        //Muestro estados
        System.out.println("******************************************");
        testSuite.mostrarEstadoDeTests();

        //Mostrar test case por prioridad
        System.out.println("******************************************");
        testSuite.mostrarTests(testSuite.obtenerTestCasesPorPrioridad(TestCase.Prioridad.HIGH));

        //mostrar por severidad
        System.out.println("******************************************");
        testSuite.mostrarBugs(testSuite.obtenerBugsPorSeveridad(Issues.Severidad.ALTA));


*/




    }
}
