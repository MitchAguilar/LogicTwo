package RepasoParcial;

import java.util.Scanner;

public class C2 {
    /**
     * Escribir un programa en JAVA que permita ingresar un numero de cuatro
     * dígitos y que obtenga e imprima el número que resulta de invertir sus
     * cifras
     *
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        while (true) {
            int b = a.nextInt();
            if ((b < 10000) && (b > 999)) {
                System.out.println("correcto, se numero invertido es: ");
                String c[]=String.valueOf(b).split("");
                System.out.println(c[3]+""+c[2]+""+c[1]+""+c[0]+"\n");
            } else {
                System.out.println("Incorrecto mayor de 4 cifras"+"\n");
            }
        }
    }
}
