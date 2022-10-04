package desarrollo;

public class TestCase {
    private String title;
    private String priority;
    private String description;
    private Pasos pasos;
    private String status;

    public TestCase(String title, String priority, Pasos pasos, String status) {
        this.title = title;
        this.priority = priority;
        this.pasos = pasos;
        this.status = status;
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


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
