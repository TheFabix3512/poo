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
class Persona {
      String Nombre;
    String Apellidos;
    int Edad;
    char Genero;

      public String getNombre(){
            return Nombre;
    }
    public void setNombre(String Valor){// set 
            Nombre = Valor;

    }
    public int getEdad(){
        return Edad;
    }
    public void setEdad(int valor){
        Edad = valor;
    }
     public String getApellidos(){
            return Apellidos;
    }
    public void setApellidos(String Valor){// set 
           Apellidos = Valor;

    }
     public char getGenero(){
        return Genero;
    }
    public void setGenero(char Valor){
        Genero = Valor;
        
    }
public void imprimirDatos(){
    System.out.println("Nombre :"+Nombre+" "+Apellidos);
    System.out.println("Edad :"+Edad);

if(Genero =='H'){
            System.out.println("Hombre");
    
}else if(Genero=='M'){
            System.out.println("Mujer");
}else if(Genero=='L'){
    System.out.println("Lesvian");
    
}else {
    System.out.println("genero no reconocido");
    
}

}

    
}
