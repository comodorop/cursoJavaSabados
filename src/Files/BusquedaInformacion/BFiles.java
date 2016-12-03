/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Files.BusquedaInformacion;

import Files.modelo.Archivos;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author PabloJavier
 */
public class BFiles {

    public ArrayList<Archivos> obtenerInformacion(String ruta) {
        File f = new File(ruta);
        ArrayList<Archivos> lst = new ArrayList<>();
        for (File file : f.listFiles()) {
            Archivos a2 = new Archivos();
            a2.setNombre(file.getName());
            a2.setPeso(file.length());
            a2.setRuta(file.getAbsolutePath());
            lst.add(a2);
        }
        return lst;
    }

}
