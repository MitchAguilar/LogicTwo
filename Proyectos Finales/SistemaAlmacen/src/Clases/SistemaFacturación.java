/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

public class SistemaFacturación {

    Factura factura[];
    
    public SistemaFacturación(Factura[] factura) {
        this.factura = factura;
    }

    public SistemaFacturación() {
        this.factura = new Factura[10];
    }

    public Factura[] getFactura() {
        return factura;
    }
    
    public void setFactura(Factura[] factura) {
        this.factura = factura;
    }

    public void IngresarFacturas(Persona Pe, Factura fc) {
        
    }
    public String VerFacturas(){
        String dev="";
        for (int i = 0; i < factura.length; i++) {
            if(factura[i]!=null){
                dev+="\tFactura # "+(i+1)+" Existe\n";
            }else{
                dev+="\tFactura # "+(i+1)+" No existe\n";
            }
        }
        return dev;
    }

    @Override
    public String toString() {
        return "SistemaFacturaci\u00f3n{" + "factura=" + factura + '}';
    }
}
