package PrimeraLineaDeEjercicios;

import java.util.Scanner;

public class quinto {

    public static void main(String[] args) {
        /*
        Redactar y ejecutar un programa que simule una calculadora simple y que lea 2 enteros y un carácter. Si el carácter es un signo +, debe imprimir la suma; si es un signo −, la diferencia; si es ∗, el producto; si es /, el cociente; y si es %, el resto. Utilizar la sentencia switch.
         */
        Scanner a = new Scanner(System.in);
        /*
        Redactar y ejecutar un programa que simule una calculadora simple y que lea 2 enteros y un carácter. Si el carácter es un signo +, debe imprimir la suma; si es un signo −, la diferencia; si es ∗, el producto; si es /, el cociente; y si es %, el resto. Utilizar la sentencia switch.
        */
        while (true) {
            float b = a.nextFloat();
            float c = a.nextFloat();
            String d = a.next();
            switch (d) {
                case "+":
                    System.out.println("suma: " + (b + c));
                    break;
                case "-":
                    System.out.println("resta: " + (b - c));
                    break;
                case "*":
                    System.out.println("multi: " + (b * c));
                    break;
                case "/":
                    System.out.println("divi: " + (b / c));
                    break;
                case "%":
                    System.out.println("mod: " + (b % c));
                    break;
                default:
                    System.out.println("revise lo digitado");
                    break;
            }
        }

    }

}
