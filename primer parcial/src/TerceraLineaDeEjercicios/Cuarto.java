package TerceraLineaDeEjercicios;

import java.util.Scanner;
/*
La secretaria de tránsito de la ciudad de Florencia desea saber, de los N
autos que entran al centro cuántos entran con calcomanía de cada color.
Conociendo el último dígito de la placa de cada automóvil se puede
determinar el color de la calcomanía utilizando la siguiente tabla:
Dígitos Color de la Calcomanía
1 o 2 Amarilla
3 o 4 Rosa
5 o 6 Roja
7 o 8 Verde
9 o 0 Azul 
*/
public class Cuarto {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        int b = 0;
        int[] c= new int[5];
        while (b<=10){
            System.out.println("Digito de la placa:");
            b=a.nextInt();
            if(b==1||b==2){
                c[0]+=1;
            }
            if(b==3||b==4){
                c[1]+=1;
            }
            if(b==5||b==6){
                c[2]+=1;
            }
            if(b==7||b==8){
                c[3]+=1;
            }
            if(b==9||b==0){
                c[4]+=1;
            }
        }
        System.out.println("Numero de Autos por colores:");
        System.out.println("Amarilla: "+c[0]);
        System.out.println("Rosa:     "+c[1]);
        System.out.println("Roja:     "+c[2]);
        System.out.println("Verde:    "+c[3]);
        System.out.println("Azul:     "+c[4]);
    }
    
}
