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
    public List<TestCase> getTestPorEjecutar() {
        return testPorEjecutar;
    }

    public void setTestPorEjecutar(List<TestCase> testPorEjecutar) {
        this.testPorEjecutar = testPorEjecutar;
    }

    public List<TestCaseEjecutado> getTestCasesEjecutados() {
        return testCasesEjecutados;
    }

    public void setTestCasesEjecutados(List<TestCaseEjecutado> testCasesEjecutados) {
        this.testCasesEjecutados = testCasesEjecutados;
    }

    public void agregarATestCasesPorEjecutar(TestCase testCase){
        testPorEjecutar.add(testCase);}

    public void agregarATestCasesEjecutados(TestCaseEjecutado testCaseEjecutado){
        testCasesEjecutados.add(testCaseEjecutado);
    }

    public List<Bug> obtenerBugsAsociadosAlDev(DEV dev){ //&& test.getIssueAsociado() instanceof Bug
        List<Bug> bugsAsociados = new ArrayList<>();
        for (TestCaseEjecutado test: testCasesEjecutados) {

            //si es del dev agregarlo a la lista
            if(test.getIssueAsociado().getDevAsiganado().equals(dev) && test.getIssueAsociado() instanceof Bug){
                bugsAsociados.add((Bug) test.getIssueAsociado());
            }
        }
        return bugsAsociados;
    }


    public List<TestCase> obtenerTestCasesCreadosPorUnQA(QA qa){
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
    public List<TestCase> obtenerTestCasesPorPrioridad(TestCase.Prioridad prioridad){
        List<TestCase> testcasesPrioridad = new ArrayList<>();
        for (TestCase testcase : testPorEjecutar) {
            if(testcase.getPriority().equals(prioridad)){
                testcasesPrioridad.add(testcase);
            }
        }
        return testcasesPrioridad;
    }

    public List<Bug> obtenerBugsPorSeveridad(Issues.Severidad severidad){
        List<Bug> bugs = new ArrayList<>();
        for (TestCaseEjecutado test: testCasesEjecutados
             ) {
            if (test.getIssueAsociado().getSeveridad().equals(severidad) && test.getIssueAsociado() instanceof Bug){
                bugs.add((Bug) test.getIssueAsociado());
            }
        }
        return bugs;
    }

    public void mostrarBugs(List <Bug> listaBugs){
        for (Bug bug: listaBugs
        ) {
            System.out.println(bug.toString());
        }
    }
    public void mostrarTests(List <TestCase> testsCases){
        for (TestCase test: testsCases
        ) {
            System.out.println(test.toString());
        }
    }
    public void mostrarTestsEjecutados(List <TestCaseEjecutado> testsCasesEj){
        for (TestCase test: testsCasesEj
        ) {
            System.out.println(test.toString());
        }
    }
}
