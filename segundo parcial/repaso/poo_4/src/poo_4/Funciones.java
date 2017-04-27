 
package poo_4;
 
public class Funciones {
    String nombre;
    int precio;
    public Funciones(){
        nombre="Función";
        precio=1000;
    }
    public Funciones(String name,int pre){
        nombre=name;
        precio=pre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
