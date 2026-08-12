package com.cmc.repaso.entidades;

public class Item {
    //ATRIBUTOS
    private String nombre;
    private int productosActuales;
    private int productosDevueltos;
    private int productosVendidos;

    //GETTERS, SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getProductosActuales() {
        return productosActuales;
    }
    public void setProductosActuales(int productosActuales) {
        this.productosActuales = productosActuales;
    }


    // METODOS
    public void imprimir (){
        System.out.println("Nombre: " + nombre);
        System.out.println("Productos Actuales: " + productosActuales);
        System.out.println("Productos Devueltos: " + productosDevueltos);
        System.out.println("Productos Vendidos: " + productosVendidos);
    }

    public void vender (int vendidos) {
        productosActuales = productosActuales - vendidos;
        productosVendidos = productosVendidos + vendidos;
    }

    public void devolver ( int devueltos) {
        productosActuales = productosActuales + devueltos;
        productosVendidos = productosVendidos - devueltos;
        productosDevueltos = productosDevueltos + devueltos;
    }

}
