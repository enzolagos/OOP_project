package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private String titulo;
    private String sprint;
    private List<TestCaseEjecutado> testCasesEjecutados = new ArrayList<>();
    private List<TestCase> testCases = new ArrayList<>();


    private boolean ejecutado;

    public TestSuite(String titulo, String sprint) {
        this.titulo = titulo;
        this.sprint = sprint;
    }

    public void agregarATestCases(TestCase testCase){
        testCases.add(testCase);
    }
    public void agregarATestCasesEjecutados(TestCaseEjecutado testCaseEjecutado){
        testCasesEjecutados.add(testCaseEjecutado);
    }


    //agregar a test suite
    public void agregarTestSuite(){

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

    public List<TestCaseEjecutado> getTestCases() {
        return testCasesEjecutados;
    }

    public void agregarTestCase(TestCaseEjecutado test){
        this.testCases.add(test);
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

    //

    public List<TestCase> mostrarTestCasesPrioridad(String prioridad){
        List<TestCase> testcasesPrioridad = new ArrayList<>();
        for (TestCase testcase : testCases) {
            if(testcase.getPriority().equals(prioridad)){
                testcasesPrioridad.add(testcase);
            }
        }
        return testcasesPrioridad;
    }
}
