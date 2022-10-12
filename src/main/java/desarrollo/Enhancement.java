package desarrollo;

public class Enhancement extends Issues{
    private String resultadoSugerencia;

    public Enhancement() {}
    public Enhancement(String titulo, String descripcion, TestCase.Prioridad prioridad, Pasos pasos, Severidad severidad, String actualResult, String expectedResult){
        this.setTitulo(titulo);
        this.setDescripcion(descripcion);
        this.setPrioridad(prioridad);
        this.setPasos(pasos);
        this.setSeveridad(severidad);
        this.setActualResult(actualResult);
        this.setResultadoSugerencia(expectedResult);
    }


    public String getResultadoSugerencia() {
        return resultadoSugerencia;
    }

    public void setResultadoSugerencia(String resultadoSugerencia) {
        this.resultadoSugerencia = resultadoSugerencia;
    }
}
