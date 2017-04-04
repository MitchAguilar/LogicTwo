
package PrimeraLineaDeEjercicios;
public class sexto {

    public static void main(String[] args) {
        /*
        Crear una sentencia if-then-else que clasifique un entero x en una de las siguientes categorías x<0; 0<x<100; x>100 y que escriba un mensaje adecuado para mostrar la salida.
        */
        int a=1;
        if(a<0){
            System.out.println("Categoria: x<0");
        }else if(a>0 && a<100){
            System.out.println("Categoria: 0<x<100");
        }else if(a>100){
            System.out.println("Categoria: x>100");
        }
    }
    
}
