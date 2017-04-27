 
package factura;

 
public class producto {
    String codigo;
    int precio;

    public producto(String codigo, int precio) {
        this.codigo = codigo;
        this.precio = precio;
    }
    
    public producto() {
        this.codigo = "c1";
        this.precio = 24;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
