package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
    public static void main(String[] args) {
        Item item1 = new Item();

        System.out.println("----------------------ITEM1 PRUEBA---------------------");
        System.out.println("VALORES INICIALES");
        item1.setNombre("Item1");
        item1.setProductosActuales(30);
        item1.imprimir();
        System.out.println("***************************");

        System.out.println("***************************");
        System.out.println("VALORES APLICANDO METODO VENDER");
        item1.getProductosActuales();
        item1.vender(5);
        item1.imprimir();
        System.out.println("***************************");

        System.out.println("***************************");
        System.out.println("VALORES APLICANDO METODO DEVOLVER");
        item1.getProductosActuales();
        item1.devolver(2);
        item1.imprimir();
        System.out.println("***************************");


        Item item2 = new Item();

        System.out.println("----------------------ITEM2 PRUEBA---------------------");
        System.out.println("VALORES INICIALES");
        item2.setNombre("Item2");
        item2.setProductosActuales(150);
        item2.imprimir();
        System.out.println("***************************");

        System.out.println("***************************");
        System.out.println("VALORES APLICANDO METODO VENDER");
        item2.getProductosActuales();
        item2.vender(73);
        item2.imprimir();
        System.out.println("***************************");

        System.out.println("***************************");
        System.out.println("VALORES APLICANDO METODO DEVOLVER");
        item2.getProductosActuales();
        item2.devolver(17);
        item2.imprimir();
        System.out.println("***************************");


    }
}
