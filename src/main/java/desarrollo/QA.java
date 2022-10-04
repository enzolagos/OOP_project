package desarrollo;

public class QA extends Owner{
    private Bug bugReportado;
    public QA(String nombre, String apellido, String rol) {
        super(nombre, apellido, rol);
    }
    public Bug getBugReportado() {
        return bugReportado;
    }

    public void setBugReportado(Bug bugReportado) {
        this.bugReportado = bugReportado;
    }
}
