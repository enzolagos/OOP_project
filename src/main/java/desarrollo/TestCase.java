package desarrollo;

public class TestCase {

    public enum EstadosDelTest{
        PASSED,FAILED,BLOCKED;
    }
    public enum Prioridad{
        HIGH,MEDIUM,LOW
    }
    private String title;
    private String description;
    private Owner creador;
    private Pasos pasos;
    private Prioridad priority;


    public TestCase(String title, Prioridad priority, Pasos pasos, Owner creador) {
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

    public Prioridad getPriority() {
        return priority;
    }

    public void setPriority(Prioridad priority) {
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

    public TestCaseEjecutado ejecutar(String build,Issues issueAsociado, TestCase.EstadosDelTest estado){
        TestCaseEjecutado testEjecutado = new TestCaseEjecutado(this.title,this.priority,this.pasos,this.creador);
        testEjecutado.setBuild(build);
        testEjecutado.setIssueAsociado(issueAsociado);
        testEjecutado.setEstado(estado);
        return testEjecutado;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", description='" + description + '\'' +
                ", creador=" + creador +
                ", pasos=" + pasos +
                '}'+"\n";
    }




    public Owner getCreador() {
        return creador;
    }

    public void setCreador(Owner creador) {
        this.creador = creador;
    }

}
