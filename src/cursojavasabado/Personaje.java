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
public class Personaje {

    private String nombre;
    private int edad;
    private boolean policia = false;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isPolicia() {
        return policia;
    }

    public void setPolicia(boolean policia) {
        this.policia = policia;
    }

}
