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
        for (int i = 0; i < ValorOne.length(); i++) {
            if (ValorOne.charAt(i) != '0' && ValorOne.charAt(i) != '1') {
                System.err.println("Digite un binario correcto");
                ValorOne = tc.next();
                i = 0;
            }
        }
        tam1 = ValorOne.length();
        //reset scanner
        tc = new Scanner(System.in);
        //pedir nuevas otro valor
        System.out.println("Digite su segundo numero");
        ValorTwo = tc.next();
        //comprobación
        for (int i = 0; i < ValorTwo.length(); i++) {
            if (ValorTwo.charAt(i) != '0' && ValorTwo.charAt(i) != '1') {
                System.err.println("Digite un numero correcto");
                ValorTwo = tc.next();
                i = 0;
            }
        }
        tam2 = ValorTwo.length();
        //////////////////////igualación///////////////////////
        int a = Math.max(tam1, tam2);
        int b = Math.min(tam1, tam2);
        String pint = "";
        int val1[] = new int[a];
        int val2[] = new int[a];
        int aa = (a - b);
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
                val2[i] = Integer.parseInt(ValorTwo.charAt(i - aa) + "");
            }
        } else {
            for (int i = 0; i < a; i++) {
                val2[i] = Integer.parseInt(ValorTwo.charAt(i) + "");
            }
            for (int i = (a - b); i < a; i++) {
                val1[i] = Integer.parseInt(ValorOne.charAt(i - aa) + "");
            }
        }
        //mostrar como quedan los arreglos que ne éste caso van a ser las sumas
        System.out.println("\n\n-_-_-_- OPERATION SUM -_-_-_-\n");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val1[i] + "]");
            pint += "----";
        }
        System.out.println("\n+");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val2[i] + "]");
        }
        System.out.println("\n    " + pint);

        ///////operación suma
        int aux = 0;
        String acum = "";
        for (int i = a - 1; i >= 0; i--) {
            if (aux == 0) {
                if ((val1[i] + val2[i]) == 2) {
                    aux = 1;
                    acum += 0;
                } else {
                    acum += val1[i] + val2[i];
                }
            } else {
                switch (val1[i] + val2[i]) {
                    case 2:
                        aux = 1;
                        acum += 1;
                        break;
                    case 1:
                        aux = 1;
                        acum += 0;
                        break;
                    default:
                        aux = 0;
                        acum += 1;
                        break;
                }
            }
        }

        if (aux == 1) {
            acum += 1;
        } else {
            System.out.print("    ");
        }
        for (int i = acum.length() - 1; i >= 0; i--) {
            System.out.print(" [" + acum.charAt(i) + "]");
        }
        System.out.print("\n");
        //mostrar como quedan los arreglos que ne éste caso van a ser las restas
        pint = "";
        System.out.println("\n\n-_-_-_- OPERATION REST -_-_-_-\n");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val1[i] + "]");
            pint += "----";
        }
        System.out.println("\n-");
        System.out.print("    ");
        for (int i = 0; i < a; i++) {
            System.out.print(" [" + val2[i] + "]");
        }
        System.out.println("\n    " + pint);
        ///////operación resta
        int aux1 = 0;
        String acum1 = "";
        for (int i = a - 1; i >= 0; i--) {
            if (aux1 == 0) {
                if ((val1[i] - val2[i]) == 0) {
                    aux1 = 0;
                    acum1 += 0;
                } else {
                    acum1 += val1[i] - val2[i];
                }
            } else {
                switch (val1[i] - val2[i]) {
                    case 2:
                        aux1 = -1;
                        acum1 += 1;
                        break;
                    case 1:
                        aux1 = -1;
                        acum1 += 0;
                        break;
                    default:
                        aux1 = 0;
                        acum1 += 1;
                        break;
                }
            }
        }

        if (aux1 == 1) {
            acum1 += 1;
        } else {
            System.out.print("    ");
        }
        for (int i = acum1.length() - 1; i >= 0; i--) {
            System.out.print(" [" + acum1.charAt(i) + "]");
        }
        System.out.print("\n");

    }

}
