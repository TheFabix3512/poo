/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_estatic2;

/**
 *
 * @author Fabian b
 */
public class Eva1_19_Estatic2 {
int x = 100;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  System.out.println(x);
      //  mensajeNoEstatico();
        Eva1_19_Estatic2 obj = new Eva1_19_Estatic2();
        System.out.println(obj.x);
        obj.mensajeNoEstatico();
        // mensajes estaticos 
        
        mensajeEstatico();
    
    }
    
    public void mensajeNoEstatico(){// NO ESXIXTE 
        System.out.println("Mensaje no estatico ");
    }
    
    public  static void mensajeEstatico(){// en cuanto inicia 
        System.out.println("Mensaje  estatico ");
    }
    
    
}
