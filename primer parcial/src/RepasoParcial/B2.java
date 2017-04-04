package RepasoParcial;

import java.util.Scanner;

public class B2 {

    /*
    Un banco establece que la clave secreta para acceso a sus cajeros
    automáticos debe ser un numero de cuatro dígitos, tales que ninguno de ellos
    se repita y que la suma de los dos dígitos intermedios sea par. Escribir un
    programa en JAVA que permita ingresar un valor entero y si se trata de una
    clave valida imprimir el segundo digito menor, en caso contrario debe indicar
    al usuario que la clave no es válida.
     */
    public static void main(String[] args) {
        try {
            Scanner a = new Scanner(System.in);
            System.out.println("Digite sus 4 digitos...");
            String b[] = a.nextLine().split("");
            int c = Integer.parseInt(b[0]);
            int d = Integer.parseInt(b[1]);
            int e = Integer.parseInt(b[2]);
            int f = Integer.parseInt(b[3]);
//        int seguridad= Integer.parseInt(b[4]);
            int h = 0;
            boolean m = true;
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
            if ((c != d && c != e && c != f) && (d != e && d != f) && (e != f)) {//si son diferentes
                int g = (d + e);
                if (g % 2 == 0) {
                    h = B3(c, d, e, f);
                } else {
                    m = false;
                }
            } else {
                m = false;
            }

            if (m == false) {
                System.out.println("Incorrecto...");
            } else {
                System.out.println("Es correcto, y el segundo numero menor es: " + h);
            }
        } catch (Exception e) {
            System.out.println("Mas de 4 digitos");
        }

    }

    /*
    POSDATA: Me emocioné un poquito escribiendo codigo, se puede hacer de formas más faciles... pero ésta funciona muy bien... 
     */

    public static int B3(int a4, int b4, int c4, int d4) {
        int d = 0;
        int[] a = new int[4];
        a[0] = a4;
        a[1] = b4;
        a[2] = c4;
        a[3] = d4;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int a2 = a[i];
                    a[i] = a[j];
                    a[j] = a2;
                }
            }
        }
        d = a[1];
        return d;
    }
}
/*
int b, c, d, e, f,a2=0;
        b = a.nextInt();
        c = a.nextInt();
        d = a.nextInt();
        e = a.nextInt();
        if ((b != c && b != d && b != e) && (c != d && c != e) && (d != e)) {//si son diferentes
            f = (c + d);//sume los intermedios
            if (f % 2 == 0) {//si la suma es par entonces, el codigo es valido, y debemos imprimir el segundo menor
                for (int i = 0; i < 4; i++) {
                    if(){}
                }
                
                System.out.println(a2);
            } else {
                System.out.println("Clave no valida...");
            }
        }
 */
