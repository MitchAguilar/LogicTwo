package Proyecto;

import java.util.Scanner;

public class Code {

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
        //created obj
        Binario Nbin = new Binario(ValorOne);
        Binario Nbin2 = new Binario(ValorTwo);
        //System Binario
        SistemasNumericos Sys = new SistemasNumericos(Nbin2, Nbin, tam1, tam2);
        Sys.normalizarArreglos();
        Menu();
        boolean ent = true;
        while (ent) {
            try {
                int opcion = tc.nextInt();
                switch (opcion) {
                    case 1:
                        Sys.OperSum();
                        System.out.println("\n");
                        Menu();
                        break;
                    case 2:
                        Sys.OperRest();
                        System.out.println("\n");
                        Menu();
                        break;
                    case 3:
                        Sys.OperMult();
                        System.out.println("\n");
                        Menu();
                        break;
                    case 4:
                        Sys.OperDiv();
                        System.out.println("\n");
                        Menu();
                        break;
                    case 5:
                        System.out.println("Gracias por usar nuestro programa");
                        ent = false;
                        break;
                    default:
                        opcion = 5;
                        opcion /= 0;
                        //provocar error para los numeros incorretos
                        break;
                }
            } catch (Exception io) {
                tc = new Scanner(System.in);
                System.err.println("Digite una opción correcta");
            }
        }
    }

    public static void Menu() {
        System.out.println("-------------------\nDigite Una Opción:\n1.-SUMAR NUMEROS\n2.-RESTAR NUMEROS\n"
                + "3.-MULTIPLICAR NUMEROS\n4.-DIVIDIR NUMEROS\n5.-Salir\n-------------------");
    }
}
