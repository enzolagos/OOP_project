package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class ClientEnzo {
    public static void main(String[] args) {
        //lista test ejecutado
        List<TestCaseEjecutado> testCasesEjecutado = new ArrayList<>();

        //creo un owner String nombre, String apellido, String rol
        Owner owner1 = new Owner("Juan","perz", "Scrum master");

        //creo dev
        DEV dev1 = new DEV("juli", "barbi","po");

        //creo test
        TestCase testcase1 = new TestCase("Test case 1", "Medium", new Pasos("pasoss"), owner1);

        //creo bugs
        Bug bug1 = new Bug();
        bug1.setDevAsiganado(dev1);
        bug1.setTitulo("ERROR N°1");
        Bug bug2 = new Bug();
        bug2.setDevAsiganado(dev1);
        bug2.setTitulo("ERROR N°2");

        //ejecuto test case
        TestCaseEjecutado testCaseEjecutado2 = testcase1.ejecutar("15.61", bug1, TestCase.EstadosDelTest.FAILED);
        TestCaseEjecutado testCaseEjecutado3 = testcase1.ejecutar("6.18", bug2, TestCase.EstadosDelTest.FAILED);

        //agrego a la lista de ejecutados
        TestSuite testSuite = new TestSuite("Tests", "4");
        testSuite.agregarATestCasesEjecutados(testCaseEjecutado2);
        testSuite.agregarATestCasesEjecutados(testCaseEjecutado3);

        //muestro bugs segun el dev asociado

        System.out.println("*** BUGS ASOCIADOS AL: "+dev1.toString()+" ***");
        System.out.println(String.valueOf(testSuite.bugsAsociadosDev(dev1)));

        System.out.println("*************");

        QA qa1 = new QA("Enzo", "Lagos", "el facha");
        Pasos pasos1 = new Pasos("pasoss");
        Bug bug = new Bug("Error", "blabla", "alta", pasos1,"Alta","actual", "expected");
        TestCase test1 = new TestCase("Error", "Alta",pasos1,qa1);
        System.out.println(test1.toString());

        TestCaseEjecutado testEjecutado = test1.ejecutar("version 1.0",bug, TestCase.EstadosDelTest.PASSED);

        System.out.println(testEjecutado.getTitle());
        System.out.println(testEjecutado.toString());







    }
}
