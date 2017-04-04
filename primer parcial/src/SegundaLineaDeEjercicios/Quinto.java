package SegundaLineaDeEjercicios;

import java.util.Scanner;

public class Quinto {
    /*
    Almacenes “El harapiento distinguido” tiene una promoción: a todos los trajes que
    tienen un precio superior a $2500.00 se les aplicará un descuento de 15 %, a todos
    los demás se les aplicará sólo 8 %. Realice un algoritmo para determinar el precio
    final que debe pagar una persona por comprar un traje y de cuánto es el descuento
    que obtendrá.
    */
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Digite el presio del traje:");
        double b=a.nextDouble();
        if(b>2500){
            System.out.println("El presio total a pagar es de: "+(b-(b*0.15))+" El descuento realizado es de: "+(b*0.15)+"%");
        }else{
            System.out.println("El presio total a pagar es de: "+(b-(b*0.08))+" El descuento realizado es de: "+(b*0.08)+"%");
        }
    }
    
}
