
package TerceraLineaDeEjercicios;

import java.util.Scanner;
/*
Construir un programa que permita realizar la suma de los primeros N
números naturales positivos. El valor de N lo debe ingresar el usuario.
*/
public class Segundo {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int b,c = 0,d = 0;
        System.out.println("Digite el numero hasta el que quiere sumar:");
        b=a.nextInt();
        while (c<b){
            c++;
            d+=c;     
        }
        System.out.println("La suma de sus numeros es: "+d);
    }
}
