
package quiz;

import java.util.Scanner;

public class Autobus {

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Numero de alumnos");
        int b =29;
        if(b>=100){
            System.out.println("El costo es de "+(b*65));
        }else if(b>=500&&b<=99){
            System.out.println("El costo es de "+(b*70));
        }else if(b>=30&&b<=49){
            System.out.println("El costo es de. "+(b*95));
        }else if(b<30){
            System.out.println("El costo del autobus es de $4000");
        }
    }
    
}
