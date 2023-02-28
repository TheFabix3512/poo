/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pakete1;

import pakete2.ClaseE;

/**
 *
 * @author Fabian b
 */
public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    
    public void prueba(){
        // Todas estas clases enstan en el mismo paquete 
        // mismo pakete public y default son visibles 
        ClaseB objB = new ClaseB();
       // objB.defaultB;
      //  objB.publicB;
        ClaseC objC = new ClaseC();
      //  objC.publicC;
      //  objC.defaultC;
        ClaseD objD = new ClaseD();
      //  objD.defaultD;
      //  objD.publicD;
        
        // Clases del pakete 2
        // todo lo que sea default es invisible 
        
        ClaseE objE = new ClaseE();
      //  objE.publicE;
     //   Clase F Es default y no es visible desde la clase a 
      //  ClaseF obJF = new ClaseF();
        
    }
}
class ClaseB{
     public int publicB;
    int defaultB;
    private int privateB;
    
    
    public void prueba(){
        // Todas estas clases enstan en el mismo paquete 
        // mismo pakete public y default son visibles 
        ClaseB objB = new ClaseB();
       // objB.defaultB;
      //  objB.publicB;
        ClaseC objC = new ClaseC();
      //  objC.publicC;
      //  objC.defaultC;
        ClaseD objD = new ClaseD();
      //  objD.defaultD;
      //  objD.publicD;
        
        // Clases del pakete 2
        // todo lo que sea default es invisible 
        
        ClaseE objE = new ClaseE();
      //  objE.publicE;
     //   Clase F Es default y no es visible desde la clase a 
      //  ClaseF obJF = new ClaseF();
        
}
}