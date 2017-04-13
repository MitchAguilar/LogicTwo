
package PrimeraLineaDeEjercicios;

import java.util.Scanner;

public class tercero {
    public static void main(String[] args) {
        /*
        Construir un programa que indique si un número introducido por teclado es positivo, igual a cero, o negativo.
        */
        Scanner a= new Scanner(System.in);
        int b= a.nextInt();
        if(b>0){
            System.out.println("Positivo");
        }else if(b==0){
            System.out.println("cero");
        }else{
            System.out.println("Negativo");
        }
    }
    
}
