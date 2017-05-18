package arregloobjeos;

import java.util.Scanner;

public class Estudiante extends Persona {

    double notas[];
    int Materias;
    int Notas;
    Double Promedio[];
    Scanner a= new Scanner(System.in);
    public Estudiante(String Nombre, String Genero, int edad, int Cantidad_Materias, int Notas_Por_Materia) {
        super(Nombre, Genero, edad);
        Materias = Cantidad_Materias;
        notas = new double[Notas_Por_Materia*Cantidad_Materias];
        Notas=Notas_Por_Materia;
        Promedio= new Double[Cantidad_Materias];
        NotasPorMatariaDeEstudiante();
    }
    public void NotasPorMatariaDeEstudiante(){
        for (int i = 0; i < Materias; i++) {
            System.out.println("-Materia: "+(i+1));
            double Prome=0;
            for (int j = 0; j < Notas; j++) {
                System.out.println("--Digite Nota: "+(j+1));
                notas[i+j]=a.nextDouble();
                Prome+=notas[i+j];
            }
            Promedio[i]=Prome/Notas;
        }
//        toString();
    }
    public String Notas(){
        String Dat="";
        for (int i = 0; i < Materias; i++) {
            Dat+="\tMateria: "+(i+1)+" Promedio-- "+Promedio[i]+"\n";
        }
        return Dat;
    }
    @Override
    public String toString() {
        return "\n===Gusano: "+Persona()+"\n\t**Promedio De Notas Por Materia: \n"+Notas()+"\n";
    }
    
}
