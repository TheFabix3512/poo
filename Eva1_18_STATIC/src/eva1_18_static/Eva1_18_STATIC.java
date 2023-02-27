/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_static;

/**
 *
 * @author Fabian b
 */
public class Eva1_18_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Prueva obj = new Prueva();
       obj.mensaje();
        Prueva.mensajeestatico();
        System.out.println("pi ;"+Math.PI);
        Math.
        
    }
    // Estatic ;
    /*Al iniciar el rpograma 
    se crea todo lo estatico
    lo que no es estatico no extista hasta utilizar un objeto 
    */
}
class Prueva{
    public void mensaje(){// solo al crear objetos 
        System.out.println("Hola");
    }
    public static void mensajeestatico(){//Directamente de la clase 
        System.out.println("Hola (Estatico)");
    }
}
class Otra{
    
}