package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jonathan");
        estudiante1.calificar(7.5);

        Estudiante estudiante2 = new Estudiante("Nataly");
        estudiante2.calificar(10);

        System.out.println("*******NOTAS*******");
        System.out.println(estudiante1.getNombre() +": " + estudiante1.getNota() + " (" + estudiante1.getResultado() + ")");
        System.out.println(estudiante2.getNombre() + ": " + estudiante2.getNota() + " (" + estudiante2.getResultado() + ")");


    }
}
