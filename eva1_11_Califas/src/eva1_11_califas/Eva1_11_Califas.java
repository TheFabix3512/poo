/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_califas;

/**
 *
 * @author Fabian b
 */
public class Eva1_11_Califas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calif(100);
        String resu;
        resu = Calif(80);
        System.out.println(resu);
        System.out.println(Calif(90));
        System.out.println(Calif(40));
        System.out.println(Calif(100));
        
        
    }
    public static String Calif(int cali){
        String A,B,C,D,invalid;
        A="A";
        B = "B";
        C = "C";
        D = "D";
        invalid = "valor invalido";
                if(cali<=70 ){
                    
            return D;
        }else if (cali<=80 && cali>=71){
                   
            return C;
        }else if(cali<=90 && cali>=81){
            return B;
        
        }else if (cali<=100 && cali>= 91){
            return A;
        }else 
            return invalid;
            
        
    }
}
