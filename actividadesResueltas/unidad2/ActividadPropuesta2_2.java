package unidad2;
import java.util.Scanner;

public class ActividadPropuesta2_2 {
    public static void main(String[] args) {
        System.out.println("Solicita por teclado un número de tipo int al usuario y escribe un programa que muestre " +
                "true o false \ndependiendo de si el número es positivo.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("El número " + n + " es negativo.");
        } else if (n == 0) {
            System.out.println("El número " + n + " es neutro.");
        } else {
            System.out.println("El número " + n + " es positivo");
        }
    }
}