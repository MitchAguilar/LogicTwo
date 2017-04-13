package arr;

import java.util.Arrays;
import java.util.Scanner;
import javax.xml.transform.Source;

public class Note {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite e tamaño del arreglo: ");
        int tam = a.nextInt();
        arr n = new arr(tam);
        n.des();
    }

    public static class arr {

        Scanner b = new Scanner(System.in);
        double a[];
        int tam;
        double moda;
        double vari;

        public double[] getA() {
            return a;
        }

        public void setA(double[] a) {
            this.a = a;
        }

        public int getTam() {
            return tam;
        }

        public void setTam(int tam) {
            this.tam = tam;
        }

        public arr(int tam) {
            this.tam = tam;
            a = new double[tam];
        }

        public void display(String b, double a) {
            System.out.println("la " + b + " : " + a);
        }

        public void des() {
            for (int i = 0; i < a.length; i++) {
                a[i] = b.nextInt();
            }
            display("Media", media());
            display("madiana", median());
            display("Moda ",moda());
            moda=moda();
            display("Variaza ", varianza());
            vari=varianza();
            display("desviación estandar: ", deestandar());
        }

        public double media() {
            int pro = 0;
            for (int i = 0; i < a.length; i++) {
                pro += a[i];
            }
            return (pro / a.length);
        }

        public double median() {
            double mediana = 0;
            int z = (a.length / 2);
            Arrays.sort(a);
            if (a.length % 2 == 0) {
                mediana = ((a[z] + a[z - 1]) / 2);
            } else {
                mediana = a[z];
            }
            return mediana;
        }

        public double moda() {
            int num = 0;
            double base = 0;
            int acun=0;
            for (int i = 0; i < a.length; i++) {
                num=0;
                for (int j = 0; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        num++;
                    }
                    if (num >= acun) {
                       acun=num;
                       base=a[i];
                    }
                }
            }
            return base;
        }
        public double varianza(){
           double sumatoria = 0;
           double vari=0;
            for (int i = 0; i < a.length; i++) {
                sumatoria+=a[i];
            }
            double cal=Math.pow((sumatoria-moda), 2);
            cal=(cal/(a.length-1));
            vari=cal;   
            return vari;
        }
        public double deestandar(){
            double des=0;
            double cos=0;
            double put=a.length-1;
            cos=(1/put);
            cos=cos*vari;
            des=Math.sqrt(cos);
            return des;
        }
    }

}

//MEDIA
//MEDIANA
//MODA 
//varianza
//desviación estandar
