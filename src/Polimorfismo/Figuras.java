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
public class Figuras {

    private int x;
    private int y;

    public Figuras() {
    }

   
    public Figuras(int x, int y) {
        
        this.x = x;
        this.y = y;
        System.out.println("Imprimiendo constructor clase Papa figuras");
    }

    public String formula() {
        String formula = "";

        return formula;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Figuras{" + "x=" + x + ", y=" + y + '}';
    }

}
