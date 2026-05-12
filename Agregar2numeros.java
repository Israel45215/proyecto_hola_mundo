import java.util.Scanner;
public class Agregar2numeros {
    public static void main(String[]args){
    Scanner numero = new Scanner(System.in);
    int num1;
    int num2;
System.out.print("Escribe el primer numero:");
    num1 = numero.nextInt();
System.out.print("Escribe el segundo nuermo:");
    num2 = numero.nextInt();
    int resultado = num1 + num2;
    System.out.print("El resultado es: " + resultado);
    numero.close();
    }
    
}
