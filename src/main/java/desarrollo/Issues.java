package desarrollo;

public abstract class Issues {

    private String titulo;
    private String descripcion;
    private String prioridad;
    private Pasos pasos;
    private String severidad;
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

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Pasos getPasos() {
        return pasos;
    }

    public void setPasos(Pasos pasos) {
        this.pasos = pasos;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }
}
