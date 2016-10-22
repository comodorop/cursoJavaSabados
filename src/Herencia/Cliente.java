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
public class Cliente extends Persona {

    private int numCliente;
    private String nombre;
    private boolean deudor;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDeudor() {
        return deudor;
    }

    public void setDeudor(boolean deudor) {
        this.deudor = deudor;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numCliente=" + numCliente + ", nombre=" + nombre + ", deudor=" + deudor + '}';
    }

}
