/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arregloobjeos;

/**
 *
 * @author estudiante
 */
public class Estudiante extends Persona{
    
    double notas[] ;
    
    public Estudiante(String Nombre, String Genero, int edad, int Cantidad_notas) {
        super(Nombre, Genero, edad);
        notas = new double[Cantidad_notas];
    }
    
    
}
