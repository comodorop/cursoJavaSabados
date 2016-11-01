/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaRetroalimentacion;

/**
 *
 * @author pablo temporal
 */
public class Animal implements Movimiento{

    private int patas;
    private boolean cola;
    private String sonido;

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public void mover() {
        System.out.println("Mover en 4 patas");
    }

    @Override
    public void saludar() {
       
    }

    @Override
    public void x() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
