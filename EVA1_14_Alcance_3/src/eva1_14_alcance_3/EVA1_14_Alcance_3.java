/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_alcance_3;

/**
 *
 * @author Fabian b
 */
public class EVA1_14_Alcance_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        } 
        int x= 100;
        System.out.println(x);// visible para todo el main
        for (int i = 0; i < 10; i++) {
            int x = 100;//no se puede ya esta declarada en el metodo main 
            
            System.out.println(i);
            System.out.println(x);// visible para todo el main
            if (i == 5){
                System.out.println(x);// visible para todo el main
            }
        }
        
        
    }
    public static void Algo(int x){
        
    }
    public static void Algo2(int x){
        
    }
    
}
