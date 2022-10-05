package desarrollo;

import java.util.ArrayList;
import java.util.List;

public class QA extends Owner{
    private List<TestCase> testCasesAsociados = new ArrayList<>();
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
    public void agregarTestCasesAsociados(TestCase test){
        testCasesAsociados.add(test);
    }

    public void mostrarTestCasesAsociados(){
        System.out.println("Test cases asociados:");
        for (TestCase test: testCasesAsociados
             ) {
            System.out.println(test.toString());
        }
    }

}
