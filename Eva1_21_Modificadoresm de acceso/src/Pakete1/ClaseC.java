/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pakete1;

/**
 *
 * @author Fabian b
 */
public class ClaseC {
     public int publicC;
    int defaultC;
    private int privateC;
    
    public void Prueba(){
        // clase del mismo pakete
        
        ClaseB objB = new ClaseB();
        
      //  objB.publicB;
      //  objB.defaultB;
        
        // clase pakete 2
       // ClaseE objE = new Clase();
       //  objE.default;
        
        
    }
    
}
class ClaseD{
     public int publicD;
    int defaultD;
    private int privateD;
}