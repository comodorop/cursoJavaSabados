/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author pablo temporal
 */
public class TestHerencia {
    public static void main(String[] args) {
//        Cliente cl = new Cliente();
//        cl.setNombre("Jorge");
//        cl.setNumCliente(123456);
//        cl.setPeso(12);
//        cl.saludar();
        Programador pr =  new Programador();
        pr.saludar();
        Perro perro = new Perro();
        perro.caminar();
        perro.saludar();
    }
}
