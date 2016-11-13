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
public class Persona implements Movimientos{

    private String nombre;
    private double peso;
    private double estatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void saludar(){
        System.out.println("Hola como estas");
    }
    
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", peso=" + peso + ", estatura=" + estatura + '}';
    }

    @Override
    public void movimiento() {
        System.out.println("Caminando 2 pies");
    }

}
