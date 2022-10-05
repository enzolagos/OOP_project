package desarrollo;

public class ClientEnzo {
    public static void main(String[] args) {
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
