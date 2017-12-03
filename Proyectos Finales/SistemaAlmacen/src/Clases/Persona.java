/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Persona {

    String NombrePersona, NumeroCuenta, Identificacion;

    public Persona(String NombrePersona, String NumeroCuenta, String Identificacion) {
        this.NombrePersona = NombrePersona;
        this.NumeroCuenta = NumeroCuenta;
        this.Identificacion = Identificacion;
    }

    public Persona() {
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

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

}
