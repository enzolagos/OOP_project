package desarrollo;

public class TestCaseEjecutado extends TestCase{
    private String build;
    private Owner owner;
    private Issues issueAsociado;
    private EstadosDelTest estado;


    public TestCaseEjecutado(String title, String priority, Pasos pasos, Owner creador ) {
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
        return "TestCaseEjecutado{" +
                "title='" + this.getTitle() + '\'' +
                "priority='" + this.getPriority() + '\'' +
                "pasos='" + this.getPasos() + '\'' +
                "owner='" + this.getOwner() + '\'' +
                "build='" + build + '\'' +
                ", owner=" + owner +
                ", issueAsociado=" + issueAsociado +
                ", estado=" + estado +
                '}';
    }
}
