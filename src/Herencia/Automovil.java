/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author PabloJavier
 */
public abstract class Automovil implements Movimientos{
private int numLlantas = 4;

    @Override
    public void movimiento() {
        System.out.println("Movimiento con 4 ruedas");
    }

    public int getNumLlantas() {
        return numLlantas;
    }

    public void setNumLlantas(int numLlantas) {
        this.numLlantas = numLlantas;
    }
    
    
    
    
}
