package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    private String titulo;
    private String sprint;
    private List<TestCaseEjecutado> testCases = new ArrayList<>();

    private boolean ejecutado;

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

    public List<TestCaseEjecutado> getTestCases() {
        return testCases;
    }

    public void agregarTestCase(TestCaseEjecutado test){
        this.testCases.add(test);
    }
}
