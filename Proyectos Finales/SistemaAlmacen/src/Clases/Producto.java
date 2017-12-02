/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Producto {
    private String PrNombre,PrCodigo,PrPrecio;

    public Producto(String PrNombre, String PrCodigo, String PrPrecio) {
        this.PrNombre = PrNombre;
        this.PrCodigo = PrCodigo;
        this.PrPrecio = PrPrecio;
    }

    public Producto() {
    }

    public String getPrNombre() {
        return PrNombre;
    }

    public void setPrNombre(String PrNombre) {
        this.PrNombre = PrNombre;
    }

    public String getPrCodigo() {
        return PrCodigo;
    }

    public void setPrCodigo(String PrCodigo) {
        this.PrCodigo = PrCodigo;
    }

    public String getPrPrecio() {
        return PrPrecio;
    }

    public void setPrPrecio(String PrPrecio) {
        this.PrPrecio = PrPrecio;
    }
    
}
