/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author pablo temporal
 */
public class Pez extends Animal{
    
  @Override
  public void movimiento(){
      System.out.println("Nadando");
  }
  public void nombrarPez(){
  this.setNombre("Nemo");
  }
  
  
    
}
