package RepasoParcial;

import java.util.Scanner;

public class A2 {

    /*
    Escribir un programa en JAVA que permita ingresar un número entero que
    representa una determinada cantidad de dinero e imprima cuantos billetes de
    100, 50, 20, 10, 5 y 1 soles se necesitan.
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        while (true) {
            int c = 0, d = 0, e = 0, f = 0, g = 0, h = 0;
            System.out.println("\nDigite la cantidad de  dienero que posee..");
            int b = a.nextInt();
            while (b != 0) {
                if ((b - 100) >= 0) {
                    b -= 100;
                    c++;
                } else if ((b - 50) >= 0) {
                    b -= 50;
                    d++;
                } else if ((b - 20) >= 0) {
                    b -= 20;
                    e++;
                } else if ((b - 10) >= 0) {
                    b -= 10;
                    f++;
                } else if ((b - 5) >= 0) {
                    b -= 5;
                    g++;
                } else if ((b - 1) >= 0) {
                    b -= 1;
                    h++;
                }
            }
            System.out.println("Cantidad de billetes de 100: " + c);
            System.out.println("Cantidad de billetes de  50: " + d);
            System.out.println("Cantidad de billetes de  20: " + e);
            System.out.println("Cantidad de billetes de  10: " + f);
            System.out.println("Cantidad de billetes de   5: " + g);
            System.out.println("Cantidad de billetes de   1: " + h);
        }
    }
}
