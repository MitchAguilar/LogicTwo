/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class Factura {
   String FcNumero;
   Persona Usuario;
   Producto Producto[];

    public Factura(String FcNumero, Persona Usuario, Producto[] Producto) {
        this.FcNumero = FcNumero;
        this.Usuario = Usuario;
        this.Producto = Producto;
    }

    public Factura() {
    }

    public String getFcNumero() {
        return FcNumero;
    }

    public void setFcNumero(String FcNumero) {
        this.FcNumero = FcNumero;
    }

    public Persona getUsuario() {
        return Usuario;
    }

    public void setUsuario(Persona Usuario) {
        this.Usuario = Usuario;
    }

    public Producto[] getProducto() {
        return Producto;
    }

    public void setProducto(Producto[] Producto) {
        this.Producto = Producto;
    }
}
