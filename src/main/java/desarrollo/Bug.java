package desarrollo;

public class Bug extends Issues{

    private String expectedResult;



    public Bug() {}
    public Bug(String titulo, String descripcion, TestCase.Prioridad prioridad, Pasos pasos, Severidad severidad, String actualResult, String expectedResult){
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

    @Override
    public String toString() {
        return String.format("Bug: %s \nDescripcion: %s\nPrioridad: %s\nPasos: %s\nSeveridad: %s\nResultado actual: %s\nResultado esperado: %s\n",super.getTitulo(),super.getDescripcion(),super.getPrioridad(),super.getPasos(),super.getSeveridad(),super.getActualResult(),expectedResult);
    }
}
