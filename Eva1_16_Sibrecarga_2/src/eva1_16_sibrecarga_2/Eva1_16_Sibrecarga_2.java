/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_16_sibrecarga_2;

/**
 *
 * @author Fabian b
 */
public class Eva1_16_Sibrecarga_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // TODO code application logic here
        
        System.out.println("suma :"+suma(4, 9));
        System.out.println("suma :"+suma(4.0, 9.0));
          System.out.println("suma :"+suma("Hola ", "Mundo"));
        suma();
        
    }
    
    // suma de dos metodos 
    public static int suma(int val1,int val2){
        // suma(int ,int)
        return val1 + val2 ;
        
    }
    public static double suma(double val1,double val2){
        // suma(double, double)
        return val1 + val2 ;
        
    }
    public static String suma(String val1,String val2){
        // suma(String)
        return val1 + val2 ;
        
    }
    public static void suma(){
        // suma()
        System.out.println("Suma: Sin Argumentos ");
        
    }
  
}
