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
public class Grupo {

    private Persona arreglo[];
    private int Cantidad;

    public Grupo(int total) {
        arreglo = new Persona[total];
        Cantidad = 0;
    }

    public boolean AgregarPersona() {
        if (Cantidad == arreglo.length - 1) {
            return false;
            //No hay espacio para mas personas
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el genero de la persona (F o M)");
        String genero = sc.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int edad = sc.nextInt();
        System.out.println("Ingrese la Cantidad de Materias");
        int canti = sc.nextInt();

        arreglo[Cantidad] = new Estudiante(nombre, genero, edad, canti);
        Cantidad++;
        return true;
    }

    public String ListarPersonas() {
        String r = "";
        for (int i = 0; i < Cantidad; i++) {
            r += arreglo[i].toString();
        }

        return (r.equals("") ? "No hay personas registradas" : r);
    }

    public String ListarPersonas(String genero) {
        String r = "";
        for (int i = 0; i < Cantidad; i++) {
            if (arreglo[i].getGenero().equals(genero)) {
                r += arreglo[i].toString();
            }
        }
        return (r.equals("") ? "No hay " + (genero.equals("M") ? "Hombres" : "Mujeres") + " registradas" : r);
    }

    String MayoresEdad() {
        String r = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getEdad() >= 18) {
                r += arreglo[i].toString();
            }
        }
        return (r.equals("") ? "No hay personas registradas" : r);
    }
}
