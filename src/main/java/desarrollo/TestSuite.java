package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private String titulo;
    private String sprint;
    private List<TestCaseEjecutado> testsEjecutados = new ArrayList<>();
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
        testPorEjecutar.add(testCase);

    public List<TestCaseEjecutado> getTestCases() {
        return testCasesEjecutados;
    }
    public void agregarATestCasesEjecutados(TestCaseEjecutado testCaseEjecutado){
        testsEjecutados.add(testCaseEjecutado);
    }
    public List<Issues> bugsAsociadosDev(DEV dev){

        List<Issues> bugsAsociados = new ArrayList<>();
        for (TestCaseEjecutado test: testsEjecutados) {

            //si es del dev agregarlo a la lista
            if(test.getIssueAsociado().getDevAsiganado().equals(dev)){
                bugsAsociados.add(test.getIssueAsociado());
            }
        }
        return bugsAsociados;
    }


    public List<Issues> bugsAsociadosDev(DEV dev){

        List<Issues> bugsAsociados = new ArrayList<>();
        for (TestCaseEjecutado test: testCasesEjecutados) {

            //si es del dev agregarlo a la lista
            if(test.getIssueAssosiated().getDevAsiganado().equals(dev)){
                bugsAsociados.add(test.getIssueAssosiated());
            }
        }
        return bugsAsociados;
    }

    public List<TestCase> mostrarTestCasesCreados(QA qa){
        List<TestCase> testcasesCreados = new ArrayList<>();

        for (TestCase testCase: testCases) {
            if(testCase.getCreador().equals(qa)){
                testcasesCreados.add(testCase);
            }
        }

        return testcasesCreados;
    }
}
