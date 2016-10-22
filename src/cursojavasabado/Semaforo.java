/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavasabado;

/**
 *
 * @author pablo temporal
 */
public class Semaforo {

    String color1 = "Verde";
    private String color2 = "Amarillo";
    private String color3 = "Rojo";

    public String getColor1() {
        return color1;
    }

//    public void setColor1(String color1) {
//        this.color1 = color1;
//    }
    public String getColor2() {
        return color2;
    }

//    public void setColor2(String color2) {
//        this.color2 = color2;
//    }
    public String getColor3() {
        return color3;
    }
//
//    public void setColor3(String color3) {
//        this.color3 = color3;
//    }

    public void avanzar() {
        if (color1.equals("verde")) {
            System.out.println("Avanzar");
        }
    }

}
