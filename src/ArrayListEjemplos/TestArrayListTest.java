/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayListEjemplos;

import java.util.ArrayList;

/**
 *
 * @author pablo temporal
 */
public class TestArrayListTest {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(5);
        String[] lista = new String[4];
        try {
            lista[0] = "info";
            lista[4] = "sd";
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existe la asignacion del valor en el arreglo");
        } catch (Exception e) {
            System.out.println("Entro a un exception");
        }
        list.add("info");

        for (String i : lista) {
            System.out.println(i);
        }

        for (String i : list) {
            System.out.println(i);
        }

    }

    public void recorrerInformacion(ArrayList<String> list, int[] lista) {
        for (int x : lista) {

        }

        for (String i : list) {

        }

    }

}
