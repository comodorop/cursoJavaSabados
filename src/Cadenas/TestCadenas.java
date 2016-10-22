/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadenas;

import Herencia.Animal;

/**
 *
 * @author pablo temporal
 */
public class TestCadenas {

    public static void main(String[] args) {
        Animal a = new Animal();
        String saludo  = new String("hola mundo");
        String saludo2  = new String("hola mundo");
        
        System.out.println(saludo == saludo2);
        System.out.println(saludo.equals(saludo2));
        
        
        
    }
}
