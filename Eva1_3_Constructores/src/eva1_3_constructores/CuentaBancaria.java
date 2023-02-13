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
public class CuentaBancaria {
    
    private double saldo;
    private String noCuenta;
    private String nomCliente;
    
    // metodos get y set 
    // constructores 
    //reglas de consreuctores en java 
    //modificador de acceso(Argumentos );
    public CuentaBancaria(){
        // constructor default
        
        noCuenta="null";
        saldo = 1000000;
        nomCliente="null";
                  
    }
    public CuentaBancaria(String nCuenta, double coin, String nCliente){
        noCuenta=nCuenta ;
        saldo = coin ;
        nomCliente=nCliente;
    }
    public String getnoCuenta(){
        return noCuenta;
    }
    public double getsaldo(){
        return saldo;
        
    }
    public String getnomCuenta(){
        return nomCliente;
        
    }
    public void setnoCuenta(String valor){
        noCuenta = valor;
    }
    public void setsaldo(double valor){
        saldo= valor;
        
    }
    public void setnomCliente(String valor){
        nomCliente = valor;
        
        
        
        
        
        
    }
    
    
}
