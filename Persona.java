public class Persona{
    String nombre = "Israel";
    int edad = 19;
    String  matricula = "20252DSM020";
    String carrera = "Desarrollo de software";

public static void main(String[]args){
    Persona p = new Persona ();
    System.out.println("Datos de la persona");
    System.out.println("Nombre:" + p.nombre);
    System.out.println("Matricula: " + p.matricula);
    System.out.println("Edad:" + p.edad);
    System.out.println("Carrera:"+ p.carrera);
}
}