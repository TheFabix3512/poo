/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_automovil;

/**
 *
 * @author Fabian b
 */
public class Eva1_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil Auto1 = new Automovil("Nissan","Sentra","jbl 100 s",2011,"Mario Sylva");
        
      System.out.println("Dueño:"+Auto1.getDueño());
        System.out.println("Marca:"+Auto1.getMarca());
        System.out.println("Modelo:"+Auto1.getModelo());
        System.out.println("Placas:"+Auto1.getPlacas());
        System.out.println("Año ="+Auto1.getAño());
        
        Auto1.CalcularAdeudo();
        
        
     
          
        
        
        
        
    }
    
}
