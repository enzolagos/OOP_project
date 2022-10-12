package desarrollo;

import java.util.Arrays;
import java.util.Scanner;

public class Pasos {

    private String titulo;
    private String[] pasos;
    private String resultado;

    public Pasos(String[] pasos) {
        this.pasos = pasos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String[] getPasos() {
        return pasos;
    }

    public void setPasos(String[] pasos) {
        this.pasos = pasos;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return Arrays.toString(pasos);
    }


}
