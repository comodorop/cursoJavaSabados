/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaEjercicio;

/**
 *
 * @author PabloJavier
 */
public class TipoAnimalFrutas {

    private String tipo;
    private String descripcion;
    private int tipoF;
    

    public TipoAnimalFrutas() {
//        logica de negocios
    }

    public TipoAnimalFrutas(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TipoAnimalFrutas{" + "tipo=" + tipo + ", descripcion=" + descripcion + '}';
    }

    public int getTipoF() {
        return tipoF;
    }

    public void setTipoF(int tipoF) {
        this.tipoF = tipoF;
    }

}
