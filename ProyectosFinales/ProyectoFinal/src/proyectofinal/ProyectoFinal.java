package proyectofinal;

import java.util.Scanner;

public class ProyectoFinal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String ValorOne = "";
        String ValorTwo = "";
        int tam1 = 0;
        int tam2 = 0;
        System.out.println("Digite su primer Binario");
        ValorOne = tc.next();
        //comprobacion
        tam1 = ValorOne.length();
        for (int i = 0; i < tam1; i++) {
            if (ValorOne.charAt(i) != '0' && ValorOne.charAt(i) != '1') {
                System.err.println("Digite un binario correcto");
                ValorOne = tc.next();
                i = 0;
            }
        }
        //reset scanner
        tc = new Scanner(System.in);
        //pedir nuevas otro valor
        System.out.println("Digite su segundo numero");
        ValorTwo = tc.next();
        //comprobación
        tam2 = ValorTwo.length();
        for (int i = 0; i < tam2; i++) {
            if (ValorTwo.charAt(i) != '0' && ValorTwo.charAt(i) != '1') {
                System.err.println("Digite un numero correcto");
                ValorTwo = tc.next();
                i = 0;
            }
        }
        //////////////////////igualación///////////////////////
        int a = Math.max(tam1, tam2);
        int b = Math.min(tam1, tam2);
        int val1[] = new int[a];
        int val2[] = new int[a];
        int aa=(a-b);
        //meter el primer valor
        if (ValorOne.length() == ValorTwo.length()) {
            for (int i = 0; i < a; i++) {
                val1[i] = Integer.parseInt(ValorOne.charAt(i) + "");
                val2[i] = Integer.parseInt(ValorTwo.charAt(i) + "");
            }
        } else if (ValorOne.length() > ValorTwo.length()) {
            for (int i = 0; i < a; i++) {
                val1[i] = Integer.parseInt(ValorOne.charAt(i) + "");
            }
            
            for (int i = aa; i < a; i++) {
                val2[i] = Integer.parseInt(ValorTwo.charAt(i-aa) + "");
            }
            
        } else {
            for (int i = 0; i < a; i++) {
                val2[i] = Integer.parseInt(ValorTwo.charAt(i) + "");
            }
            for (int i = (a-b); i < a; i++) {
                val1[i] = Integer.parseInt(ValorOne.charAt(i-aa) + "");
            }
        }
        //mostrar como quedan los arreglos
        for (int i = 0; i < val1.length; i++) {
            System.out.print("["+val1[i]+"]");
        }
        System.out.println("");
        for (int i = 0; i < val2.length; i++) {
            System.out.print("["+val2[i]+"]");
        }
    }
}
