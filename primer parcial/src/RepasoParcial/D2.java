package RepasoParcial;

import java.util.Scanner;

public class D2 {

    /*
    Escribir un programa en Java que me permita ingresar un mes (numero) y un
    año e imprima cuantos días tiene .tener en cuenta el caso de año bisiestos.
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite su mes en numero:");
        int b = a.nextInt();
        System.out.println("Digite el año:");
        int c = a.nextInt();
        if ((c % 4 == 0) && ((c % 100 != 0) || (c % 400 == 0))) {
            System.out.println("Es bisiesto");
            switch (b) {
                case 1:
                    System.out.println("31 dias");
                    break;
                case 2:
                    System.out.println("29 dias");
                    break;
                case 3:
                    System.out.println("31 dias");
                    break;
                case 4:
                    System.out.println("30 dias");
                    break;
                case 5:
                    System.out.println("31 dias");
                    break;
                case 6:
                    System.out.println("30 dias");
                    break;
                case 7:
                    System.out.println("31 dias");
                    break;
                case 8:
                    System.out.println("31 dias");
                    break;
                case 9:
                    System.out.println("30 dias");
                    break;
                case 10:
                    System.out.println("31 dias");
                    break;
                case 11:
                    System.out.println("30 dias");
                    break;
                case 12:
                    System.out.println("31 dias");
                    break;

                default:
                    System.out.println("No es un numero de mes valido");
            }
            System.out.println("El total de días del año es 366");
        } else {
            System.out.println("No es bisiento");
            switch (b) {
                case 1:
                    System.out.println("31 dias");
                    break;
                case 2:
                    System.out.println("28 dias");
                    break;
                case 3:
                    System.out.println("31 dias");
                    break;
                case 4:
                    System.out.println("30 dias");
                    break;
                case 5:
                    System.out.println("31 dias");
                    break;
                case 6:
                    System.out.println("30 dias");
                    break;
                case 7:
                    System.out.println("31 dias");
                    break;
                case 8:
                    System.out.println("31 dias");
                    break;
                case 9:
                    System.out.println("30 dias");
                    break;
                case 10:
                    System.out.println("31 dias");
                    break;
                case 11:
                    System.out.println("30 dias");
                    break;
                case 12:
                    System.out.println("31 dias");
                    break;

                default:
                    System.out.println("No es un numero de mes valido");
            }
            System.out.println("El total de días de éste año es de 365");
        }
    }

}
