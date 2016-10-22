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
public class Triangulo extends Figuras {

    private int base;
    private int altura;

    
    
    
    
    
    

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void posicionamiento() {
        this.setX(192);
        this.setY(200);
        this.setAltura(12);
    }

    @Override
    public String formula() {
        String formula = "La formula del triangulo es : (b * h)/2 ";
        return formula;
    }

}
