/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecarga_areas;

/**
 *
 * @author Fabian b
 */
public class Eva1_17_Sobrecarga_Areas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(calcularArea(5));
        System.out.println(calcularArea(5, 5));
        System.out.println(calcularArea(5, 5, 5));
        calcularArea();
        
    }
    public static double calcularArea( double radio ){
        return Math.PI*(radio*radio);
        
    }
    public static double calcularArea(double base,double altura){
            return base*altura/2.0;
    }
    public static double calcularArea(double Altura, double baseMayor, double baseMenor){
        return (Altura*(baseMayor + baseMenor))/2.0;
        
    }
    public static void calcularArea(){
        System.out.println("Datos interpretados");
    }
}
