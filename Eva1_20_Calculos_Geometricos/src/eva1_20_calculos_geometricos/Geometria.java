/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_calculos_geometricos;

/**
 *
 * @author Fabian b
 */
public class Geometria {
    
    // constantes
    public static final double PI = 3.1416;
    // final un significado para las clases y tiene otro para variables "Solo se puede Asignar el valor una vez "
    
    // Calcular area, perimetro
    
    
    // perímetro
    public static double PerimetroCirculo(double radio){
        return PI*(radio*2);
        
        
    }
    public static double areaCirculo(double radio){
        return PI*(radio*radio);
        
    }
    public static double volumenEsfera(double radio){
        return (4.0/3.0)*(PI*(radio*radio*radio));
    }
}
