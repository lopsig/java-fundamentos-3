package com.cmc.repaso.entidades;

public class Estudiante {
    //ATRIBUTOS
    private String nombre;
    private double nota;
    private String resultado;

    // GETTERS, SETTERS
    public String getNombre() {
        return nombre;
    }
    public double getNota() {
        return nota;
    }

    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    //CONSTRUCTOR
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    //METODO
    public void calificar (double nota) {
        this.nota = nota;
        if (nota < 8) {
            setResultado("F");
        }  else if (nota >= 8) {
            setResultado("A");
        }
    }
}
