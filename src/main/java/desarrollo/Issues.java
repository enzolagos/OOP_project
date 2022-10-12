package desarrollo;

public abstract class Issues {
    public enum Severidad{
        BLOQUEADORA, ALTA, MEDIA, BAJA, TRIVIAL
    }

    private String titulo;
    private String descripcion;
    private TestCase.Prioridad prioridad;
    private Pasos pasos;
    private Severidad severidad;
    private String actualResult;
    private QA reporta_QA;
    private DEV devAsiganado;


    public QA getReporta_QA() {
        return reporta_QA;
    }

    public void setReporta_QA(QA reporta_QA) {
        this.reporta_QA = reporta_QA;
    }

    public DEV getDevAsiganado() {
        return devAsiganado;
    }

    public void setDevAsiganado(DEV devAsiganado) {
        this.devAsiganado = devAsiganado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TestCase.Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(TestCase.Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public Pasos getPasos() {
        return pasos;
    }

    public void setPasos(Pasos pasos) {
        this.pasos = pasos;
    }

    public Severidad getSeveridad() {
        return severidad;
    }

    public void setSeveridad(Severidad severidad) {
        this.severidad = severidad;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }
}
