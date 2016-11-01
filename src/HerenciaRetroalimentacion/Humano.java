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
public class Humano extends Animal {

    private String ojos;
    private String colorCabello;

    public String getOjos() {
        return ojos;
    }

    public void setOjos(String ojos) {
        this.ojos = ojos;
    }

    public String getColorCabello() {
        return colorCabello;
    }

    public void setColorCabello(String colorCabello) {
        this.colorCabello = colorCabello;
    }

//    public void caminarHumano(){
//        System.out.println("Camino con dos patas");
//    }
    
    @Override
    public void mover() {
        System.out.println("Caminando con 2 patas");
    }

}
