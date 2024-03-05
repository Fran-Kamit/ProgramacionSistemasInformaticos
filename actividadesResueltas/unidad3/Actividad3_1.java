package unidad3;
import java.util.Scanner;

public class Actividad3_1 {
    public static void main(String[] args) {
        System.out.println(" Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si" +
                " es \npositivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0.\n");
        Scanner sc = new Scanner(System.in);
        int num;
        String esPar, esPositivo;

        do {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();
        } while (num == 0);

        while (num != 0) {
            esPar = num % 2 == 0 ? "Sí." : "No.";
            esPositivo = num >= 1 ? "Sí." : "No.";

            System.out.println("¿El número es par? " + esPar);
            System.out.println("¿El número es positivo? " + esPositivo);

            System.out.print("\nIntroduzca otro número: ");
            num = sc.nextInt();
        }
        System.out.println("\nCerrando el programa.......");
    }
}