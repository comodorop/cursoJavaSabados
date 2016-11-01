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
public class Secretaria extends Humano implements X{

    @Override
    public void guardar() {
        System.out.println("Guardar en archivos");
    }

    @Override
    public void generarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
