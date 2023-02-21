/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_television;

/**
 *
 * @author Fabian b
 */
public class Television {
    //Atributos : Estado
    private boolean power;
    private int volumen;
    private int canal;
    
   // metodos : Comportamiento 
    
    
    // Constructor:
    
   public Television(){// Constructor default 
       power = false;// Apagado 
       volumen = 0;
       canal = 5;
       
       
       
   }
   public void cambiarPower(){
       if (power == false){//apagado
           power = true; // encendemos la tv
           System.out.println("Television Encendida");
       }
       else{
           power = false;
           System.out.println("Television Apagada");
       }
           
   }    
   public void subirVolumen(){
       if (power == true){
       volumen=volumen + 5;
       System.out.println("volumen"+volumen);
       }
   }
   public  void bajarVolumen(){
       if (power == true )
       volumen= volumen-5;
       System.out.println("volumen"+volumen);
       
   }
    
    
   
      
}
