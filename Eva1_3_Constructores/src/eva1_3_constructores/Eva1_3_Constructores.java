/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author FABIANARMANDOBUSTILL
 */
public class Eva1_3_Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CuentaBancaria cuenta1 = new CuentaBancaria("22550344", 50000, "Fabian Bustillos");
        
      /* cuenta1.setnomCliente("Fabian bustillos");
        cuenta1.setsaldo(1200);
        cuenta1.setnoCuenta("100");*/
        
        System.out.println("Datos del cliente");
        System.out.println(cuenta1.getnomCuenta());
        System.out.println(cuenta1.getsaldo());
        System.out.println(cuenta1.getnoCuenta());
            
        CuentaBancaria cuenta2 = new CuentaBancaria();
        
          System.out.println("Datos del cliente");
        System.out.println(cuenta2.getnomCuenta());
        System.out.println(cuenta2.getsaldo());
        System.out.println(cuenta2.getnoCuenta());
        
        CuentaBancaria cuenta3 = new CuentaBancaria("5194324", 58914, "Palomino Romero ");
          System.out.println("Datos del cliente");
        System.out.println(cuenta3.getnomCuenta());
        System.out.println(cuenta3.getsaldo());
        System.out.println(cuenta3.getnoCuenta());
        
        
    }
    
}
