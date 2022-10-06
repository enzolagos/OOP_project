package desarrollo;

import static desarrollo.TestCase.EstadosDelTest.PASSED;

public class ClientEnzo {
    public static void main(String[] args) {
        QA qa1 = new QA("Enzo", "Lagos", "el facha");

        Pasos pasos1 = new Pasos("pasos");
        String [] p = {"Paso1: Click en el boton","Paso2: Cerrar ventana"};
        pasos1.setPasos(p);
        pasos1.setResultado("CORRIDO");

        Bug bug = new Bug("Error", "blabla", "alta", pasos1,"Alta","actual", "expected");
        Enhancement enhancement = new Enhancement();

        TestCase test1 = new TestCase("Error", "Alta",pasos1,qa1);


        TestCaseEjecutado testEjecutado = test1.ejecutar("version 1.0",bug, PASSED);
        System.out.println(testEjecutado.getTitle());
        System.out.println(testEjecutado);



    }
}
