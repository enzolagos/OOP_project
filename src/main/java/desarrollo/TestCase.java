package desarrollo;

public class TestCase {
    private String title;
    private String priority;
    private String description;
    private Owner creador;
    private Pasos pasos;
    private boolean ejecutado;

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


    public boolean getStatus() {
        return ejecutado;
    }

    public void setStatus(boolean ejecutado) {
        this.ejecutado = ejecutado;
    }

    @Override
    public String toString() {
        return "TestCase{" +
                "title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", description='" + description + '\'' +
                ", creador=" + creador +
                ", pasos=" + pasos +
                ", ejecutado=" + ejecutado +
                '}';
    }
}
