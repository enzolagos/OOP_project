package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class DEV extends Owner{

    private List<Bug> bugAsignados = new ArrayList<>();

    public DEV(String nombre, String apellido) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setRol("DEV");
    }

    public List<Bug> getBugAsignados() {
        return bugAsignados;
    }

    public void setBugAsignados(List<Bug> bugAsignados) {
        this.bugAsignados = bugAsignados;
    }

    @Override
    public String toString() {
        return "DEV: " + super.getNombre();
    }
}
