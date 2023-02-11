/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases;

/**
 *
 * @author FABIANARMANDOBUSTILL
 */
public class Eva1_2_Clases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // Instanciacion 
        // instanciar --> Dar memoria 
        //Nombre de la clase 
        // Palabra reservada New + Constructor de la clase


        Persona Perso1 = new Persona(); // persona es el contructor 



        Perso1.Nombre = "Fabián ";
        Perso1.Apellidos = "Bustillos";

        System.out.print( Perso1.Nombre+ ""+ Perso1.Apellidos);
        Perso1.setNombre("Fabian");
       
        System.out.println(Perso1);
        Perso1.setApellidos(" Bustillos");
        Perso1.setEdad(18);
        Perso1.setGenero('H');
        /*System.out.println(Perso1.getNombre());
        System.out.println(Perso1.getApellidos());
        System.out.println(Perso1.getEdad());
        System.out.println(Perso1.getGenero());*/
        
        Persona Perso2 = new Persona();
        Perso2.setNombre("Armando");
        Perso2.setApellidos("vitela");
        Perso2.setEdad(20);
        Perso2.setGenero('L');
    }
    
}
