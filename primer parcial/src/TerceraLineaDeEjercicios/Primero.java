
package TerceraLineaDeEjercicios;

import java.util.Scanner;
/*
Construir un programa que permita ingresar una cantidad indeterminada de
números, este proceso se debe realizar hasta que se digite un cero. Al final
debe imprimir la cantidad de números que se digitaron y el promedio de los
números; recuerde que no debe contar el cero para realizar el promedio.
*/
public class Primero {

    public static void main(String[] args) {
        Scanner d= new Scanner(System.in);
        double a=1,b=0,c=0;
        while(a!=0){
            a=d.nextDouble();
            c+=a;
            b++;
        }
        System.out.println("Numeros digitados: "+(b-1));
        System.out.println("Promedio de numeros digitados: "+(c/(b-1)));
    }
    
}
