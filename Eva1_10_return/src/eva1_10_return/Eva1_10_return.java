/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_10_return;

/**
 *
 * @author Fabian b
 */
public class Eva1_10_return {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        square(10);//llamada funcion no procesa resultado 
        int resu;
        resu = square(3);// llama a la funcion y guarda resultado 
        System.out.println(resu);
        System.out.println(square(5));//llama la funcion para println
    }
        public static int square(int num){
            return num*num;
        }
                
    }
    

