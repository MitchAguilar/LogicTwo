package numeriuno;

import java.util.Scanner;

public class NumeriUno {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite su opción");
        System.out.println("1: Inicie desde una hora definida");
        System.out.println("2: inicie por defecto");
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                int horas,
                 minutos,
                 segundo;
                System.out.println("Digite la hora");
                horas = sc.nextInt();
                System.out.println("Digite los minutos");
                minutos = sc.nextInt();
                System.out.println("Digite los segundos");
                segundo = sc.nextInt();
                new reloj(horas, minutos, segundo);
                break;
            case 2:
                new reloj();
            default:
                System.out.println("Digite opción correcta");
                break;
        }
    }

    public static class reloj {

        int horas, minutos, segundos;

        public reloj() throws InterruptedException {
            horas = 0;
            minutos = 0;
            segundos = 0;
            incremento();
        }

        public reloj(int horas, int minutos, int segundos) throws InterruptedException {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
            incrementodefinido();
        }

        public void puestaencero() {
            horas = 0;
            minutos = 0;
            segundos = 0;
        }

        public void incremento() throws InterruptedException {
            for (horas = 0; horas < 24; ++horas) {
                for (minutos = 0; minutos < 60; ++minutos) {
                    for (segundos = 0; segundos < 60; ++segundos) {
                        System.out.println(horas + ":" + minutos + ":" + segundos);
                        Thread.sleep(999);//no es de 1 sg por razones de los ciclos y la comprovación
                        if (horas == 23 && minutos == 59 && segundos == 59) {
                            puestaencero();
                        }
                    }
                }
            }
        }

        public void incrementodefinido() throws InterruptedException {
            int horas, minutos, segundos;

            for (horas = this.horas; horas < 24; ++horas) {
                for (minutos = this.minutos; minutos < 60; ++minutos) {
                    for (segundos = this.segundos; segundos < 60; ++segundos) {
                        System.out.println(horas + ":" + minutos + ":" + segundos);
                        Thread.sleep(999);//no es de 1 sg por razones de los ciclos y la comprovación
                        if (horas == 23 && minutos == 59 && segundos == 59) {
                            puestaencero();
                        }
                    }
                }
            }
        }
    }
}
