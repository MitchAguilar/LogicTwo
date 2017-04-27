 
package poo_4;
 
import java.util.Scanner;

 
public class Poo_4 {

   
    public static void main(String[] args) {
        Scanner b=  new Scanner(System.in);
        Scanner d=  new Scanner(System.in);
        Scanner e=  new Scanner(System.in);
        Scanner f=  new Scanner(System.in);
        Scanner g=  new Scanner(System.in);
        Scanner h=  new Scanner(System.in);
        Scanner i=  new Scanner(System.in);
        Teatro a = new Teatro();
        boolean entr=true;
        while(entr){
            System.out.println("\n"+a.estadoTeatro()+"\n");
            System.out.println("Digite Una Opción");
            System.out.println("1.- Cambiar Nombre Del Teatro y Dirección");
            System.out.println("2.- Modificar Una Funición");
            System.out.println("3.- Salir");
            int value=b.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Digite el nuevo nombre del teatro");
                    String nuevo= d.nextLine();
                    a.setNombre(nuevo);
                    System.out.println("Digite la nueva dirección del teatro");
                    String diree=d.nextLine();
                    a.setDireccion(diree);
                    break;
                case 2:
                    System.out.println("Nombre Funcion 1");
                    a.funci1.setNombre(d.nextLine());
                    System.out.println("Precio Funcion 1");
                    a.funci1.setPrecio(d.nextInt());
                    System.out.println("Nombre Funcion 2");
                    a.funci2.setNombre(e.nextLine());
                    System.out.println("Precio Funcion 2");
                    a.funci2.setPrecio(f.nextInt());
                    System.out.println("Nombre Funcion 3");
                    a.funci3.setNombre(h.nextLine());
                    System.out.println("Precio Funcion 3");
                    a.funci3.setPrecio(h.nextInt());
                    System.out.println("Nombre Funcion 4");
                    a.funci4.setNombre(i.nextLine());
                    System.out.println("Precio Funcion 4");
                    a.funci4.setPrecio(g.nextInt());
                    break;
                case 3:
                    System.out.println("Adios");
                    entr=false;
                    break;
                default:
                    break;
            }
        }
    }
    
}
