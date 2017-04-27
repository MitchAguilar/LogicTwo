package factura;

import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {
        tienda b = new tienda();
        Scanner a = new Scanner(System.in);

        int op;
        while (true) {
            System.out.println(" Digite la opcion que desee");
            System.out.println("1. cambiar el producto de la factura ");
            System.out.println(" 2. salir");
            op = a.nextInt();
            switch (op) {
                case 1:
                    System.out.println(" digite el codigo del producto");
                    String cod = a.next();
                    b.codigo.setCodigo(cod);
                    System.out.println(" digite el precio del producto");
                    int pre = a.nextInt();
                    b.precio.setPrecio(pre);
                    break;

            }
        }

    }

}
