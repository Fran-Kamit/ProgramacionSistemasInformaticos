package unidad2;
import java.util.Scanner;

public class Actividad2_1 {
    public static void main(String[] args) {
        System.out.println("Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.\n");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("El número " + n + " es par.");
        } else {
            System.out.println("El número " + n + " es impar.");
        }
        String nombre;
        System.out.print("\nIndica tu nombre: ");
        nombre = sc.next();
        if (nombre.equals("María")){
            System.out.println("Es el nombre que esperaba.");
        } else {
            System.out.println("Tu nombre no es el indicado.");
        }
    }
}