package unidad01;
import java.util.Scanner;

public class Actividad1_08 {
    public static void main(String[] args) {
        System.out.println("Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad (mediante un literal \nbooleano: true o false).\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su edad: ");
        int edad = sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayoría de edad " + mayorEdad);
    }
}
