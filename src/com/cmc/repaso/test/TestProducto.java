package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Articulo 1", 99.99);
        Producto producto2 = new Producto("Articulo 2", -30);

        System.out.println("VERIFICACION SETPRECIO");
        producto1.setPrecio(producto1.getPrecio());
        producto2.setPrecio(producto2.getPrecio());
        System.out.println("*****************************");

        double descuento1 =  producto1.calcularPrecioPromo(10);
        double descuento2 =  producto2.calcularPrecioPromo(2);

        System.out.println("*****************************");
        System.out.println("VERIFICACION CALCULAR PRECIO PROMO");
        System.out.println("Nombre: " + producto1.getNombre());
        System.out.println("Precio Normal: " + producto1.getPrecio());
        System.out.println("Precio Promo: " + descuento1);
        System.out.println("*****************************");
        System.out.println("Nombre: " + producto2.getNombre());
        System.out.println("Precio Normal: " + producto2.getPrecio());
        System.out.println("Precio Promo: " + descuento2);

    }
}
