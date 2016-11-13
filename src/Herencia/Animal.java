/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Herencia.Movimientos;

/**
 *
 * @author pablo temporal
 */
public abstract  class Animal implements Movimientos {

    private String tipo;
    private String raza;
    private boolean vuela;
    private String nombre;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + tipo + ", raza=" + raza + ", vuela=" + vuela + '}';
    }

    public void saludar() {
        System.out.println("saludando");
    }

    @Override
    public void movimiento() {
        System.out.println("Caminando 4 patas");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
