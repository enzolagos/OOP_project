package desarrollo;

public class DEV extends Owner{
    Bug bugAsignado;
    public DEV(String nombre, String apellido, String rol) {
        super(nombre, apellido, rol);
    }

    public Bug getBugAsignado() {
        return bugAsignado;
    }

    public void setBugAsignado(Bug bugAsignado) {
        this.bugAsignado = bugAsignado;
    }
}
