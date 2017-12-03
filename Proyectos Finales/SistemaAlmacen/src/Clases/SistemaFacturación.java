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

    public String IngresarFacturas(Factura fc) {
        String dev = "Factura No Ingresada, por  falta de espacio";
        for (int i = 0; i < factura.length; i++) {
            if (factura[i] == null) {
                factura[i] = fc;
                dev = "Factura ingresada en la posición " + (i + 1);
                break;
            }
        }
        return dev;
    }

    public String VerFacturas() {
        String dev = "";
        for (int i = 0; i < factura.length; i++) {
            if (factura[i] != null) {
                dev += "\tFactura # " + (i + 1) + " Existe\n";
            } else {
                dev += "\tFactura # " + (i + 1) + " No existe\n";
            }
        }
        return dev;
    }

    public String BuscarFactura(String Codigo) {
        String dev = "No hemos encontrado su factura.";
        for (int i = 0; i < factura.length; i++) {
            if (factura[i] != null) {
                if (factura[i].getFcNumero().equals(Codigo)) {
                    dev = "Factura existe, en la posición " + (i + 1);
                }
            }
        }
        return dev;
    }

    public String EliminarFactura(String code) {
        String dev = "No hemos encontrado su factura.";
        for (int i = 0; i < factura.length; i++) {
            if (factura[i] != null) {
                if (factura[i].getFcNumero().equals(code)) {
                    factura[i]=null;
                    dev = "Factura eliminada, de la posición " + (i + 1);
                }
            }
        }
        return dev;
    }
    public String EditarFactura(String code,Factura fc){
        String dev = "No hemos encontrado su factura.";
        for (int i = 0; i < factura.length; i++) {
            if (factura[i] != null) {
                if (factura[i].getFcNumero().equals(code)) {
                    factura[i]=fc;
                    dev = "Factura Editada, en la posición " + (i + 1);
                }
            }
        }
        return dev;
    }
    @Override
    public String toString() {
        return "SistemaFacturaci\u00f3n{" + "factura=" + factura + '}';
    }
}
