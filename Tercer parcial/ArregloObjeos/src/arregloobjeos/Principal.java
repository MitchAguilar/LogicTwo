package arregloobjeos;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Cuantas personas desea registrar");
            int cantidad = sc.nextInt();
            Grupo gru = new Grupo(cantidad);
            int op = 0;
            do {
                try {
                    System.out.println("*****************------------*****************");
                    System.out.println("Opciones\n\n1. Ingresar una persona\n2. Listar personas\n3. Mostrar Mujeres\n4. Mostrar Hombres\n5. Mostrar mayores de edad\n6. Ordenar Arreglo\n");
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
                            gru.OrdenarArreglo();
                            break;
                    }

                } catch (Exception ex) {
                    System.err.println("El dato ingresado no es valido");
                } finally {
                    sc = new Scanner(System.in);
                }
            } while (op != 7);

        } catch (Exception ex) {
            System.err.println("El dato ingresado no es valido");
        } finally {
            sc = new Scanner(System.in);
        }
    }

}
