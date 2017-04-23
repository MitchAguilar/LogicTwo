package segundoejercicio;

import java.util.Scanner;

/*
Elaborar una clase que modele ángulos medidos en grados. La clase debe
incorporar al menos la suma de ángulos, su resta, el opuesto de un ángulo,
quedando bien entendido que el ángulo 0° y el ángulo 360° son el mismo.
 */
public class SegundoEjercicio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        angulos an = new angulos();
        int grados[] = new int[2];
        int minutos[] = new int[2];
        int segundo[] = new int[2];

        boolean intro = true;
        while (true) {
            System.out.println("\n***************************************");
            System.out.println("Ingrese los valores de sus dos angulos");
            for (int i = 0; i < 2; i++) {
                System.out.println("Angulo " + (i + 1));
                System.out.println("Digite grados");
                grados[i] = sc.nextInt();
                System.out.println("Digite minutos");
                minutos[i] = sc.nextInt();
                System.out.println("Digite segundos");
                segundo[i] = sc.nextInt();
            }
            while (intro) {
                System.out.println("----------------------");
                System.out.println("Digite una opción");
                System.out.println("1: Sumar angulos");
                System.out.println("2: Restar angulos");
                System.out.println("3: Opuesto de angulos");
                System.out.println("4: Salir");
                int a = sc.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("\nla suma de sus dos angulos es:");
                        System.out.println(an.sumar(grados, minutos, segundo));
                        break;
                    case 2:
                        System.out.println("\nla resta de sus dos angulos es:");
                        System.out.println(an.restar(grados, minutos, segundo));
                        break;
                    case 3:

                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
            }
        }
    }

    public static class angulos {

        public angulos() {

        }

        public String sumar(int[] grados, int[] minutos, int[] segundos) {
            String dev = "";
            int gra = (grados[0] + grados[1]);
            int minu = (minutos[0] + minutos[1]);
            int segu = (segundos[0] + segundos[1]);
            if (segu > 60) {
                minu += (segu / 60);
                segu = (segu % 60);
            }
            if (minu > 60) {
                gra += (minu / 60);
                minu = (minu % 60);
            }
            dev = gra + "° " + minu + " \' " + segu + " \" ";
            return dev;
        }

        public String restar(int[] grados, int[] minutos, int[] segundos) {
            String dev = "";
            int segu = 0;
            int minu = 0;
            if (segundos[0] >= segundos[1]) {
                segu = (segundos[0] - segundos[1]);
            } else {
                minutos[0]--;
                segundos[0] += 60;
                segu = (segundos[0] - segundos[1]);
            }
            if (minutos[0] >= minutos[1]) {
                minu = (minutos[0] - minutos[1]);
            } else {
                grados[0]--;
                minutos[0] += 60;
                minu = (minutos[0] - minutos[1]);
            }
            int gra = (grados[0] - grados[1]);
            dev = gra + "° " + minu + " \' " + segu + " \" ";
            return dev;
        }
    }

}
