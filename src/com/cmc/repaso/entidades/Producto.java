package com.cmc.repaso.entidades;

public class Producto {
    //ATRIBUTOS
    private String nombre;
    private double precio;

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }

    // CONSTRUCTOR
    public Producto (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //METODO
    public void setPrecio(double precio) {
        if (precio > 0) {
            System.out.println("Precio actual: " + precio);
        }  else if (precio < 0) {
            this.precio = precio * -1;
            System.out.println("El precio no puede ser negativo, talvez intentaste decir: " + getPrecio());
        }
    }

    public double calcularPrecioPromo(double descuento) {
        double precioDescuento = precio - (precio * (descuento/100));
        return precioDescuento;
    }
}
