package desarrollo;

public class ClientEnzo {
    public static void main(String[] args) {
        QA qa1 = new QA("Enzo", "Lagos", "el facha");
        Pasos pasos1 = new Pasos("pasoss");
        TestCase test1 = new TestCase("Error", "Alta",pasos1,qa1);
        qa1.agregarTestCasesAsociados(test1);
        qa1.mostrarTestCasesAsociados();

    }
}
