package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        QA qa1 = new QA("Enzo","Lagos");
        QA qa2 = new QA("Julian", "Barbieri");
        QA qa3 = new QA("Agustin","Spitale");
        QA qa4 = new QA("Federico", "Padin");
        QA qa5 = new QA("Federico", "Roman");
        QA qa6 = new QA("Emanuel", "Ditzel");

        List <QA> listaDeQAs = new ArrayList<>();
        listaDeQAs.addAll(List.of(new QA[]{qa1,qa2,qa3,qa4,qa5,qa6}));

        System.out.println(IngresoDeDatos.elegirPrioridad());
    }
}
