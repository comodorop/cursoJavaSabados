/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos;

/**
 *
 * @author pablo temporal
 */
public class TestArreglos {

    public static void main(String[] args) {
        int[] listaCalificaciones = new int[5];
        listaCalificaciones[0] = 4;
        listaCalificaciones[1] = 1;
        listaCalificaciones[2] = 445;
        listaCalificaciones[3] = 41;
        listaCalificaciones[4] = 2;
        int listaClif[] = {4, 1, 445, 41, 2};

        int pares = 0;
        int impares = 0;
        int sumaPares = 0;
        String numerosPares = "";
        for (int i = 0; i < listaCalificaciones.length; i++) {
            if (listaCalificaciones[i] % 2 == 0) {
                sumaPares += listaCalificaciones[i];
                pares++;
                numerosPares += listaCalificaciones[i] + ",";
            } else {
                impares++;
                listaCalificaciones[i] = 10;
            }
        }
        System.out.println("Numeros pares encontrados son " + pares);

        System.out.println("Numeros impares encontrados son " + impares);
        System.out.println("Numeros pares son " + numerosPares);
        System.out.println("La suma de los pares son " + sumaPares);
        for (int cali : listaCalificaciones) {
            System.out.println(cali);
        }
    }
}
