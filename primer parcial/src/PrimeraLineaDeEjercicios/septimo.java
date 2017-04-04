package PrimeraLineaDeEjercicios;

public class septimo {

    public static void main(String[] args) {
        /*
        Codificar un programa que determine si un año es bisiesto; esto se presenta cuando es múltiplo de 4, por ejemplo, 1984; sin embargo, los años que son múltiplos de 100 sólo son bisiestos cuando también son múltiplos de 400; por ejemplo, 1800 no es bisiesto, mientras que 2000, sí lo es.
         */
        int a = 2000;
        if (a % 4 == 0) {
            if (a % 100 == 0 && a % 400 == 0) {
                System.out.println("Año bisiesto");
            }else{
                System.out.println("Año no bisiesto");
            }
        } else {
            System.out.println("Año no bisiesto");
        }
    }

}
