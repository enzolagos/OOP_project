package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private String titulo;
    private String sprint;
    private List<TestCaseEjecutado> testCasesEjecutados = new ArrayList<>();
    private List <TestCase> testPorEjecutar = new ArrayList<>();

    public TestSuite(String titulo, String sprint) {
        this.titulo = titulo;
        this.sprint = sprint;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }


    public void agregarATestCases(TestCase testCase){
        testPorEjecutar.add(testCase);}

    public List<TestCaseEjecutado> getTestCases() {
        return testCasesEjecutados;
    }
    public void agregarATestCasesEjecutados(TestCaseEjecutado testCaseEjecutado){
        testCasesEjecutados.add(testCaseEjecutado);
    }
    public List<Issues> bugsAsociadosDev(DEV dev){

        List<Issues> bugsAsociados = new ArrayList<>();
        for (TestCaseEjecutado test: testCasesEjecutados) {

            //si es del dev agregarlo a la lista
            if(test.getIssueAsociado().getDevAsiganado().equals(dev)){
                bugsAsociados.add(test.getIssueAsociado());
            }
        }
        return bugsAsociados;
    }

    public List<TestCase> mostrarTestCasesCreados(QA qa){
        List<TestCase> testcasesCreados = new ArrayList<>();

        for (TestCase testCase: testPorEjecutar) {
            if(testCase.getCreador().equals(qa)){
                testcasesCreados.add(testCase);
            }
        }

        return testcasesCreados;
    }
    public void mostrarEstadoDeTests(){
        int[] contFailedPassedBlocked = {0,0,0};

        for(TestCaseEjecutado test: testCasesEjecutados){
            if (test.getEstado() == TestCase.EstadosDelTest.FAILED){
                contFailedPassedBlocked[0]++;
            } else if (test.getEstado() == TestCase.EstadosDelTest.PASSED) {
                contFailedPassedBlocked[1]++;
            } else {
                contFailedPassedBlocked[2]++;
            }
        }
        System.out.println("TEST FAILED: "+contFailedPassedBlocked[0]);
        System.out.println("TEST PASSED: "+contFailedPassedBlocked[1]);
        System.out.println("TEST BLOCKED: "+contFailedPassedBlocked[2]);
    }
    public List<TestCase> mostrarTestCasesPrioridad(TestCase.Prioridad prioridad){
        List<TestCase> testcasesPrioridad = new ArrayList<>();
        for (TestCase testcase : testPorEjecutar) {
            if(testcase.getPriority().equals(prioridad)){
                testcasesPrioridad.add(testcase);
            }
        }
        return testcasesPrioridad;
    }

    public List<Issues> obtenerBugsPorSeveridad(Issues.Severidad severidad){
        List<Issues> bugs = new ArrayList<>();
        for (TestCaseEjecutado test: testCasesEjecutados
             ) {
            if (test.getIssueAsociado().getSeveridad().equals(severidad) && test.getIssueAsociado() instanceof Bug){
                bugs.add(test.getIssueAsociado());
            }
        }
        return bugs;
    }
}
