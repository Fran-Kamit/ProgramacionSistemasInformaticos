package unidad01;
import java.util.Scanner;

public class Actividad1_12 {
    public static void main(String[] args) {
        System.out.println("Escribir un programa que pida un número al usuario y muestre su valor absoluto.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número (positivo o negativo): ");

        int n = sc.nextInt();
        int valorAbsoluto = n < 0 ? -1 * n : n;

        System.out.println("El valor absoluto de " + n + " es " + valorAbsoluto);
    }
}
