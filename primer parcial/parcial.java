
import java.util.Scanner;

public class Kfgnjkfgnf {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Digite el numero de trabajadores con quienes cuenta:");
        int t = a.nextInt();
        String[] b = new String[t];
        int[] c = new int[t];
        int[] d = new int[t];
        int[] e = new int[t];
        int f = 0, i = 0;
        String a1 = "";
        while (t != 0) {
            System.out.println("\n\n\n\n");
            System.out.println("Nombre del trabajador:");
            b[i] = a.next();
            System.out.println("Dia de la semana en que trabajó:");
            c[i] = a.nextInt();
            System.out.println("Numero de horas diurnas trabajadas");
            d[i] = a.nextInt();
            System.out.println("Numero de horas nocturnas trabajadas");
            e[i] = a.nextInt();
//            System.out.println("Si decea salir precione 1 de lo contrario 2");
//            f = a.nextInt();
//            if (f == 1) {
//                break;
//            }
            i++;
            t--;
        }
        while (true) {
            System.out.println("\n\n\n");
            System.out.println("Hola soy tu asistente personal, mi nimbre es RONCANCIA, por favor digita una opción");
            System.out.println("a) Monto a cobrar por cada trabajador");
            System.out.println("b) Nombre del primer trabajador cuyas horas nocturna son mayores que las diurnas");
            System.out.println("c) Nombre del trabajador y día de la semana con mayo salario");
            System.out.println("d) promedio de las horas de los trabajadores que laboraron el día domingo");
            System.out.println("e) para salir");
            a1 = a.next();
            String n4 = "";
            int d5 = 0;
            switch (a1) {
                case "a":
                    System.out.println("Para cada trabajador el numero de horas que trabajó es de: ");
                    int sa = 0;//me aprobecho de mis comprobaciones aquí para sacar el punto c :)
                    for (int j = 0; j < b.length; j++) {
                        int d1 = d[j];//recojo el total de horas que trabajó
                        int n2 = e[j];
                        if (c[j] == 0) {
                            d1 *= 15000;
                            n2 *= 32500;
                        } else {
                            d1 *= 10000;
                            n2 *= 25000;
                        }
                        int sa2 = (d1 + n2);
                        if (sa2 > sa) {
                            n4 = b[j];
                            d5 = c[j];
                            sa = sa2;
                        }

                        System.out.println("\n----Nombre: " + b[j] + " Monto a cobrar por concepto de cobro " + (d1 + n2) + " Ese trabajador estubo el día " + c[j]);
                    }
                    break;
                case "b":
                    System.out.println("El nombre del trabajador con más horas nocturnas es: ");
                    int a6 = 0;
                    int pos = 0;
                    for (int j = 0; j < e.length; j++) {//rrecorro mi arrreglo de horas nocturnas y cme  aprobecho de las posiciones como lo guarda en forma paralela, sé que con una posición voy a tener las de todos :)
                        int va = e[j];
                        if (va > a6) {
                            a6 = va;
                            pos = j;
                        }
                    }
                    System.out.println("Nombre: " + b[pos] + " con un total de horas nocturnas de: " + e[pos]);
                    break;
                case "c":
                    System.out.println("El nombre del trabajador y día de la semana con mayor salario fue: ");
                    System.out.println("Nombre: " + n4);
                    System.out.println("Dia de la semana en que trabajó: " + d5);
                    break;
                case "d":
                    System.out.println("el promedio de horas de los trabajadores que laboraron el día domingo es de:");
                    try {
                        for (int j = 0; j < c.length; j++) {
                            if (c[j] == 0) {
                                int p = 0;
                                int p2 = 0;
                                int pf = 0;
                                if (c[j] == 0) {
                                    p += d[j];
                                    p += e[j];
                                } else {
                                    p2 += d[j];
                                    p2 += e[j];
                                }
                                pf = p2 + p;
                                double c2 = (pf / p);
                                System.out.println("el promedio de horas trabajadas el domingo entre nocturnas y diurnas es de: " + (c2));
                            }
                        }
                    } catch (Exception e3) {//me aprobecho del error si en los arreglos de las otras comprobaciones no hay nada no importa si java me inicializa los arreglos  en 0 el día domingo no tiene datos y en la divición 
                        //para el proomedio me daria un error by/zero en ese caso significa que no se trabajó el día domingo, de lo contrario daría algun valor x :)
                        System.out.println("No se trabajó el día domingo");
                    }

                    break;
                case "e":
                    System.out.println("Soy RONCANCIA,gracias por salir, por cierto renuncio, por mal jefe :)");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Soy RONCANCIA, por favor jefesito digita una opción correcta");
            }
        }
    }
}
//posdata: por cada una que me queda mal le debo un tinto, de lo contrario de debe uno usted a mi :)