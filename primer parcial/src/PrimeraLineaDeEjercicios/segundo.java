package PrimeraLineaDeEjercicios;

import java.util.Scanner;

public class segundo {

    public static void main(String[] args) {
        /*
        Escribir un programa que lea dos enteros de tres dígitos y calcule e imprima producto, cociente y resto cuando el primero se divide entre el segundo.
         */
        Scanner a = new Scanner(System.in);
        int b = a.nextInt();
        int c = a.nextInt();
        double d = (b / c);
        System.out.println("Producto: "+b+"/"+c);
        System.out.println("Cociente: " + d);
        System.out.println("Resto: " + (b % c));
    }

}
