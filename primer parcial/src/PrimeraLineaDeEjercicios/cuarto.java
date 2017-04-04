
package PrimeraLineaDeEjercicios;

import java.util.Scanner;

public class cuarto {
    public static void main(String[] args) {
        /*
        Escribir un programa que lea tres enteros y que emita un mensaje que indique si están o no en orden numérico.
        */
        Scanner a= new Scanner(System.in);
        int b=a.nextInt();
        int c=a.nextInt();
        int d=a.nextInt();
        
        if(b<c&&c<d){
            System.out.println("Orden numerico");
        }else{
            System.out.println("No están en orden numerico");
        }
    }
    
}
