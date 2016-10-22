/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresAritmeticos;

/**
 *
 * @author pablo temporal
 */
public class Operaciones {

    public void sumar(int[] calificaciones) {
        int suma = 0;
        for (int calificacione : calificaciones) {
            suma = suma + calificacione;
        }
        System.out.println("La suma total es " + suma);
    }

    public void numeroMayor(int[] listaDeCalificaciones) {
        int numeroMayor = listaDeCalificaciones[0];
        for (int calificaicone : listaDeCalificaciones) {
            if (calificaicone > numeroMayor) {
                numeroMayor = calificaicone;
            }
        }
        System.out.println("El numero mayor es " + numeroMayor);
    }
     public void numeroMenor(int[] listaCalificaciones) {
        int numeroMenor = listaCalificaciones[0];
        for (int calificaicone : listaCalificaciones) {
            if (calificaicone < numeroMenor) {
                numeroMenor = calificaicone;
            }
        }
        System.out.println("El numero menor es " + numeroMenor);
    }

}
