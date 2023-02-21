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
public class Automovil {
    private String marca;
    private String modelo;
    private String placas ;
    private int año; 
   private String dueño;
   
   
  // constructor con argumentos 
   public Automovil(String mARCA, String mODELO , String pLACAS, int aÑO, String dUEÑO){
       mARCA = marca;
       mODELO = modelo;
       pLACAS = placas;
       aÑO = año;
       dUEÑO = dueño;
       
   }
   // constructor default
    public Automovil(){
       marca = "null";
       modelo = "null";
       placas = "null";
       año = 0000;
       dueño = "null";       
   }
   // get 
    public String getMarca(){
        return  marca;
    }
    public String getModelo (){
        return modelo;
    }      
    public String getPlacas (){
        return placas;
    }      
    public int getAño (){
        return año;
    }      
    public String getDueño (){
        return dueño;
    }      
    
    // set 
    public void setMarca (String valor){
        marca = valor;
    }
     public void setModelo(String valor){
         modelo = valor;
     }
     public void setPlacas(String valor){
         placas = valor;
     }
     public void setAño(int valor){
         año = valor;
     }
     public void setDueño(String valor){
         dueño = valor;
     }
   
    public void CalcularAdeudo(){
        if(año<2000){
            System.out.println("Aduedo ="+1500);
            
        }else if(año<2005 && año>2001){
            System.out.println("Adeudo ="+2000);
        }else if(año>2006 && año<2010 ){
            System.out.println("Adeudo="+2500);
        }else if (año >2011 && año<2015 ){
            System.out.println("Adeudo = " + 3000);
        }else if (año>2015 && año < 2023){
            System.out.println("Adeudo = "+4000);
        }
        
    }
    
}
