/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloobjeos;

/**
 *
 * @author r.vergara
 */
public class Persona {

    private String Nombre, Genero;
    private int edad;

    public Persona()
    {
        
    }
    public Persona(String Nombre, String Genero, int edad) {
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return Nombre + "\tGenero: " + Genero + "\tEdad: " + edad + "\n";
    }

}
