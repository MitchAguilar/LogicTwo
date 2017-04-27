package poo_4;

public class Teatro {
    String nombre, direccion;
    Funciones funci1= new Funciones();
    Funciones funci2= new Funciones();
    Funciones funci3= new Funciones();
    Funciones funci4= new Funciones();

    public Teatro() {
        this.nombre = "Daniela Es Hermosa";
        this.direccion = "calle 5 # 3b";
    }
    public Teatro(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String estadoTeatro(){
        String dev="";
        dev+="*********"+nombre+"*********\n"
                + "Dirección: "+direccion+"\n\n"
                + funci1.getNombre()+" --- "+funci1.getPrecio()+"\n"
                + funci2.getNombre()+" --- "+funci2.getPrecio()+"\n"
                + funci3.getNombre()+" --- "+funci3.getPrecio()+"\n"
                + funci4.getNombre()+" --- "+funci4.getPrecio()+"\n";
        return dev;
    }
}
