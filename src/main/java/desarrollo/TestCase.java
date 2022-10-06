package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class TestCase {

    //private List<TestCaseEjecutado> testCasesEjecutados = new ArrayList<>();
    private String title;
    private String priority;
    private String description;
    private Owner creador;
    private Pasos pasos;
    public enum EstadosDelTest{
        PASSED,FAILED,BLOCKED;
    }

    public TestCase(String title, String priority, Pasos pasos, Owner creador) {
        this.title = title;
        this.priority = priority;
        this.pasos = pasos;
        this.creador = creador;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pasos getPasos() {
        return pasos;
    }

    public void setPasos(Pasos pasos) {
        this.pasos = pasos;
    }


    @Override
    public String toString() {
        return "TestCase{" +
                "title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", description='" + description + '\'' +
                ", creador=" + creador +
                ", pasos=" + pasos +
                '}';
    }


    /*public List<TestCaseEjecutado> getTestCasesEjecutados() {
        return testCasesEjecutados;
    }

    public void setTestCasesEjecutados(List<TestCaseEjecutado> testCasesEjecutados) {
        this.testCasesEjecutados = testCasesEjecutados;
    }*/

    public Owner getCreador() {
        return creador;
    }

    public void setCreador(Owner creador) {
        this.creador = creador;
    }

    public TestCaseEjecutado ejecutar(String build, Issues issueAsociado, EstadosDelTest estado){
        TestCaseEjecutado testEjecutado = new TestCaseEjecutado(this.title,this.priority,this.pasos,this.creador);
        testEjecutado.setBuild(build);
        testEjecutado.setIssueAssosiated(issueAsociado);
        testEjecutado.setEstado(estado);

        //agrego a una lista de test cases
        //testCasesEjecutados.add(testEjecutado);
        return testEjecutado;

    }
}
