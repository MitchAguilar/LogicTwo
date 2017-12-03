/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaalmacen;

import Clases.Factura;
import Clases.Persona;
import Clases.Producto;
import Clases.SistemaFacturación;
import java.util.Scanner;

public class SistemaAlmacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        SistemaFacturación SALM = new SistemaFacturación();
        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("1:) Ver Facturas");
            System.out.println("2:) Ingresar Factura");
            System.out.println("3:) Buscar Factura");
            System.out.println("4:) Eliminar Factura");
            System.out.println("5:) Editar Factura");
            System.out.println("6:) Salir");
            System.out.println("-------------------------------------------");
            int var = sc.nextInt();
            sc = new Scanner(System.in);
            switch (var) {
                case 1:
                    //ver si hay  no facturas
                    System.out.println(SALM.VerFacturas());
                    break;
                case 2:
                    //
                    System.out.println("----Ingrese Un Usuario----");
                    System.out.println(" \n Nombre De La Persona:");
                    String NombrePersona = sc.nextLine();
                    System.out.println("Numero De Cuenta:");
                    String NumeroCuenta = sc.nextLine();
                    System.out.println("Identificación");
                    String Identificacion = sc.nextLine();
                    Persona per = new Persona(NombrePersona, NumeroCuenta, Identificacion);
                    System.out.println("INGRESE UN NUMERO DE FACTURA");
                    String FcNumero = sc.nextLine();
                    //maximo 5 productos
                    System.out.println("Cantidad de productos que va a ingresar");
                    sc= new Scanner(System.in);
                    int numer= sc.nextInt();
                    sc= new Scanner(System.in);
                    Producto[] pr = new Producto[numer];
                    for (int i = 0; i < pr.length; i++) {
                        System.out.println("Nombre Del Producto");
                        String PrNombre= sc.nextLine();
                        System.out.println("Precio Del Producto");
                        String PrPrecio= sc.nextLine();
                        System.out.println("Código DeL Producto");
                        String PrCodigo= sc.nextLine();
                        Producto pr2= new Producto(PrNombre, PrCodigo, PrPrecio);
                        pr[i]=pr2;
                    }
                    Factura fv = new Factura(FcNumero, per, pr);
                    break;
                case 3:
                    //identificacion de factura
                    break;
                case 6:
                    //acabar programa
                    System.out.println("Gracias Por Usar Nuestro Sistema.");
                    System.exit(0);
                    break;
                default:
                    //salir
                    System.out.println("Gracias Por Usar Nuestro Sistema.");
                    System.exit(0);
                    break;
            }
        }
    }
}
