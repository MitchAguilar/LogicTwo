
public class SistemasNumericos {

    String Num1;
    String Num2;

    public SistemasNumericos(String num1, String num2) {
        this.Num1 = num1;
        this.Num2 = num2;
    }

    //operaciones
    public String Suma() {
        String suma = "";
        //operación de suma
        
        
        
        
        Procesos(1);
        return suma;
    }

    public String Resta() {
        String Resta = "";

        Procesos(2);
        return Resta;
    }

    public String Multiplicacion() {
        String Multiplicacion = "";

        Procesos(3);
        return Multiplicacion;
    }

    public String Divicion() {
        String Divicion = "";

        Procesos(4);
        return Divicion;
    }

    //procesos
    public String Procesos(int tipo) {
        String Opera = "";
        switch (tipo) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return Opera;
    }
}
