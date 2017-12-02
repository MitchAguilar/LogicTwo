/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Scanner;

public class SistemaFacturación {
    Factura factura;
    Producto productos[];

    public SistemaFacturación(Factura factura, Producto[] productos) {
        this.factura = factura;
        this.productos = productos;
    }

    public SistemaFacturación() {
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
    
}
