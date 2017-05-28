package poo_;

import java.util.Scanner;

public class Poo_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el grado de su polinomio");
        int grado = sc.nextInt();
        int grado2= grado;
        int arr[] = new int[grado];
        int arre[] = new int[grado];
        for (int i = 0; i < arre.length; i++) {
            int pol = sc.nextInt();
            arre[grado - 1] = pol;
            grado--;
        }
        for (int i = 0; i < arre.length; i++) {
            System.out.print("[" + arre[i] + "] ");
        }
        System.out.println("---");
        for (int i = 0; i < arr.length; i++) {
            int pol = sc.nextInt();
            
            arr[grado2 - 1] = pol;
            grado2--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[" + arr[i] + "] ");
        }

    }

}
