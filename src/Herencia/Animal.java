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
public class Animal {

    private String tipo;
    private String raza;
    private boolean vuela;

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

    public void caminar() {
        System.out.println("Caminando en tierra");
    }
    
    public void saludar(){
        System.out.println("saludando");
    }

}
