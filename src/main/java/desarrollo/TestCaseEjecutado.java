package desarrollo;

public class TestCaseEjecutado extends TestCase{
    private String build;
    private Owner owner;
    private Issues issueAsociado;
    private EstadosDelTest estado;


    public TestCaseEjecutado(String title, Prioridad priority, Pasos pasos, Owner creador ) {
        super(title, priority, pasos, creador);

    }

    public EstadosDelTest getEstado() {
        return estado;
    }

    public void setEstado(EstadosDelTest estado) {
        this.estado = estado;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Issues getIssueAsociado() {
        return issueAsociado;
    }

    public void setIssueAsociado(Issues issueAsociado) {
        this.issueAsociado = issueAsociado;
    }

    @Override
    public String toString() {
        return String.format("Test ejecutado: %s \nPrioridad: %s\nPasos: %s\nCreado por: %s\nBuild: %s\nOwner: %s\nIssue asociad: %s\nEstado: %s\n*****************",this.getTitle(),this.getPriority(),this.getPasos(),this.getCreador(),build,owner,issueAsociado,estado);
    }

}
