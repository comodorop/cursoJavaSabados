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
public class Trailer extends Automovil {

    public void asignarLLantas() {
        this.setNumLlantas(8);
        System.out.println("El numero de llantas del trailes es " + this.getNumLlantas());
    }
}
