/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Cuenta {

    String NombrePersona, NumeroCuenta;
    int ValorCuenta;

    public Cuenta(String NombrePersona, String NumeroCuenta, int ValorCuenta) {
        this.NombrePersona = NombrePersona;
        this.NumeroCuenta = NumeroCuenta;
        this.ValorCuenta = ValorCuenta;
    }

    public Cuenta() {
    }

    public String getNombrePersona() {
        return NombrePersona;
    }

    public void setNombrePersona(String NombrePersona) {
        this.NombrePersona = NombrePersona;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String NumeroCuenta) {
        this.NumeroCuenta = NumeroCuenta;
    }

    public int getValorCuenta() {
        return ValorCuenta;
    }

    public void setValorCuenta(int ValorCuenta) {
        this.ValorCuenta = ValorCuenta;
    }
    
    
}
