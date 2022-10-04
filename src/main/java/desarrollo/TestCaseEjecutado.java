package desarrollo;

public class TestCaseEjecutado extends TestCase{
    private String build;
    private Owner owner;
    private Bug bugAssosiated;

    public TestCaseEjecutado(String title, String priority, Pasos pasos, String status) {
        super(title, priority, pasos, status);
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
}
