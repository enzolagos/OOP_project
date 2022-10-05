package desarrollo;

public class TestCaseEjecutado extends TestCase{
    private String build;
    private Owner owner;
    private Bug bugAssosiated;
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

    public Bug getBugAssosiated() {
        return bugAssosiated;
    }

    public void setBugAssosiated(Bug bugAssosiated) {
        this.bugAssosiated = bugAssosiated;
    }

    @Override
    public String toString() {
        return "TestCaseEjecutado{" +
                "build='" + build + '\'' +
                ", owner=" + owner +
                ", bugAssosiated=" + bugAssosiated +
                ", estado=" + estado +
                '}';
    }
}
