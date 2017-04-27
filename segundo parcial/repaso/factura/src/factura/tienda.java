package factura;

public class tienda {

    producto codigo = new producto();
    producto precio = new producto();
    String factura;
    String producto;

    public tienda(String factura, String producto) {
        this.factura = factura;
        this.producto = producto;
    }

    public tienda() {
        this.factura = "factura 1";
        this.producto = "producto 3";
    }

    public String estadofactura() {
        String pr;
        pr = "+*******" + factura + "***********"
                + "********" + producto + "*********"
                + codigo.getCodigo()+
                   precio.getPrecio();
        return pr;
    }
}
