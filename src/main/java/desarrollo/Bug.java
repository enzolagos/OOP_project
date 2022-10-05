package desarrollo;

public class Bug extends Issues{

    private String expectedResult;


    public Bug() {
        this.expectedResult = expectedResult;
    }
    public Bug(String titulo, String descripcion, String prioridad, Pasos pasos, String severidad, String actualResult, String expectedResult){
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.setPrioridad(prioridad);
        this.setPasos(pasos);
        this.setSeveridad(severidad);
        this.setActualResult(actualResult);
        this.setExpectedResult(expectedResult);
    }

    public String getExpectedResult() {
        return expectedResult;
    }

    public void setExpectedResult(String expectedResult) {
        this.expectedResult = expectedResult;
    }


}
