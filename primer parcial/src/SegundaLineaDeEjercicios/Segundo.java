package SegundaLineaDeEjercicios;

/*El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que
le permita determinar cuánto debe cobrar por el uso del estacionamiento a sus
clientes. Las tarifas que se tienen son las siguientes:
a. Las dos primeras horas a $5.00 c/u.
b. Las siguientes tres a $4.00 c/u.
c. Las cinco siguientes a $3.00 c/u.
d. Después de diez horas el costo por cada una es de dos pesos
 */
public class Segundo {

    public static void main(String[] args) {
        java.util.Scanner b = new java.util.Scanner(System.in);
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int a = b.nextInt();
        while (a != 0) {
            a--;
            d++;
            if(d<=2){
                c+=5;
            }
            if(d>2&&d<=5){
                c+=4;
            }
            if(d>5&&d<=10){
                c+=3;
            }
            if(d>10){
                c+=2;
            }
        }
        System.out.println("Debe pagar $" + (c) + ".00 c/u");
    }
}
