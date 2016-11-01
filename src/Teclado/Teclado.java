/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

import java.util.Scanner;

/**
 *
 * @author pablo temporal
 */
public class Teclado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu edad");
        int edad = sc.nextInt();
        System.out.println("La informacion es esta");
        System.out.println(nombre);
        System.out.println(edad);
    }
}
