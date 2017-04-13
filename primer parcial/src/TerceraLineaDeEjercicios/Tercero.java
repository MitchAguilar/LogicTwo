package TerceraLineaDeEjercicios;

import java.util.Scanner;

public class Tercero {
    /*
    Realizar un programa que permita realizar una multiplicación, sin emplear el
    operador producto (*). Los multiplicando deben ser ingresados por el usuario,
    el programa debe imprimir el resultado de la multiplicación.
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int b,c,d = 0,e;
        System.out.println("Ingrese su Multiplicando:");
        b=a.nextInt();
        System.out.println("Ingrese su Multiplicador:");
        c=a.nextInt();
        while (b!=0){
            b--;
            d+=c;
        }
        System.out.println("El resultado es : "+d);
    }
}
