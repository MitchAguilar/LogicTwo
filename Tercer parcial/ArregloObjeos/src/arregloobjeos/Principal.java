/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloobjeos;

import java.util.Scanner;

/**
 *
 * @author r.vergara
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Cuantas personas desea registrar");
            int cantidad = sc.nextInt();
            Grupo gru = new Grupo(cantidad);
            int op = 0;

            do {
                try {
                    System.out.println("Opciones\n\n1. Ingresar una persona\n2. Listar personas\n3. Mostrar Mujeres\n4. Mostrar Hombres\n5. Mostrar mayores de edad");
                    op = sc.nextInt();
                    switch (op) {
                        case 1:
                            if (gru.AgregarPersona()) {
                                System.out.println("Persona registrada correctamente");
                            } else {
                                System.out.println("No fue posible registrar la persona");
                            }
                            break;
                        case 2:
                            System.out.println("Las personas registradas son:\n" + gru.ListarPersonas());
                            break;
                        case 3:
                            System.out.println("Las Mujeres registradas son:\n" + gru.ListarPersonas("F"));
                            break;
                        case 4:
                            System.out.println("Las Hombres registradas son:\n" + gru.ListarPersonas("M"));
                            break;
                        case 5:
                            System.out.println("Los Mayores de Edad registrados son:\n" + gru.MayoresEdad());
                            break;
                        case 6:
                            System.out.println("Hasta luego");
                            break;
                    }
                    
                } catch (Exception ex) {
                    System.err.println("El dato ingresado no es valido");
                } finally {
                    sc = new Scanner(System.in);

                }
            } while (op != 6);

        } catch (Exception ex) {
            System.err.println("El dato ingresado no es valido");
        } finally {
            sc = new Scanner(System.in);
        }
    }

}
