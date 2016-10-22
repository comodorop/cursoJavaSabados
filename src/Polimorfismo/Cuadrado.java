/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author pablo temporal
 */
public class Cuadrado extends Figuras {

    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado, int x, int y) {
        super(x, y);
        this.lado = lado;
        System.out.println("Imprimiendo constructor clase cuadrado");
    }

    
    
    
    
    
    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String formula() {
        String formula = "La formula es : L * L";
//        System.out.println("");
        return formula;
    }

}
