package desarrollo;

import java.util.List;
import java.util.Scanner;


public class IngresoDeDatos {
    public static Scanner sc = new Scanner(System.in);

    public static QA elegirQA(List<QA> listaDeQAs){
        System.out.println("Elija por favor un QA por indice:");
        for (int i=0;i<listaDeQAs.size();i++){
            System.out.println(String.format("%s %s",i,listaDeQAs.get(i).toString()));
        }
        int indice = sc.nextInt();
        return listaDeQAs.get(indice);
    }

    public static DEV elegirDEV(List<DEV> listaDeDEVs){
        System.out.println("Elija por favor un DEV por indice:");
        for (int i=0;i<listaDeDEVs.size();i++){
            System.out.println(String.format("%s %s",i,listaDeDEVs.get(i).toString()));
        }
        int indice = sc.nextInt();
        return listaDeDEVs.get(indice);
    }
    public static TestCase.Prioridad elegirPrioridad(){
        System.out.println("Por favor elija la prioridad de los TC que desea encontrar:");
        System.out.println(String.format("%s HIGH\n%s MEDIUM\n%s LOW",0,1,2));
        int opcion = sc.nextInt();
        switch (opcion){
            case 0:
                return TestCase.Prioridad.HIGH;
            case 1:
                return TestCase.Prioridad.MEDIUM;
            case 2:
                return TestCase.Prioridad.LOW;
            default:
                System.out.println("Opcion no valida, se mostraran los de prioridad HIGH");
                return TestCase.Prioridad.HIGH;
        }
    }
    public static Issues.Severidad elegirSeveridad(){

        System.out.println("Por favor elija la severidad del bug que desea encontrar:");
        System.out.println(String.format("%s BLOQUEADORA\n%s ALTA\n%s MEDIA\n%s BAJA\n%s TRIVIAL",0,1,2,3,4));
        int opcion = sc.nextInt();

        switch (opcion){
            case 0:
                return Issues.Severidad.BLOQUEADORA;
            case 1:
                return Issues.Severidad.ALTA;
            case 2:
                return Issues.Severidad.MEDIA;
            case 3:
                return Issues.Severidad.BAJA;
            case 4:
                return Issues.Severidad.TRIVIAL;
            default:
                System.out.println("Opcion no valida, se mostraran los de severidad BLOQUEADORA");
                return Issues.Severidad.BLOQUEADORA;
        }
    }
    public static TestCase.EstadosDelTest elegirEstado(){
        System.out.println("Elija estado para asignar al test:\n1. PASSED\n2. FAILED\n3. BLOCKED");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                return TestCase.EstadosDelTest.PASSED;
            case 2:
                return TestCase.EstadosDelTest.FAILED;
            case 3:
                return TestCase.EstadosDelTest.BLOCKED;
            default:
                System.out.println("La opcion no es valida, se asignara FAILED");
                return TestCase.EstadosDelTest.FAILED;
        }
    }
    public static Issues elegirIssue(List<Issues> issues){
        System.out.println("Por favor ingrese el indice del issue a asociar u otro para asignar null:");
        for (int i=0;i<issues.size();i++){
            System.out.println(String.format("%s %s",i,issues.get(i).getTitulo().toString()));
        }
        int indice = sc.nextInt();
        if (indice<issues.size()){
            return issues.get(indice);
        }
        return null;
    }
}
