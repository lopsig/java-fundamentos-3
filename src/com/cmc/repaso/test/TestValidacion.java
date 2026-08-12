package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {
    public static void main(String[] args) {
        Validacion validacion = new Validacion();

        boolean v1  = validacion.validarMonto(32.5);
        boolean v2 = validacion.validarMonto(0);
        boolean v3 = validacion.validarMonto(-6);
        boolean v4 = validacion.validarMonto(0.5);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);
    }
}
