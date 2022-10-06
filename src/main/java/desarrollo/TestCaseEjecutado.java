package desarrollo;

public class TestCaseEjecutado extends TestCase{
    private String build;
    private Owner owner;
    private Issues issueAssosiated;
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

    public Issues getIssueAssosiated() {
        return issueAssosiated;
    }

    public void setIssueAssosiated(Issues issueAssosiated) {
        this.issueAssosiated = issueAssosiated;
    }

    @Override
    public String toString() {
        return "TestCaseEjecutado{" +
                "build='" + build + '\'' +
                ", owner=" + owner +
                ", issueAssosiated=" + issueAssosiated +
                ", estado=" + estado +
                '}';
    }
}
