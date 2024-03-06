package unidad03;
import java.util.Scanner;
public class Actividad3_09 {
    public static void main(String[] args) {
        System.out.println(" Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10. " +
                "Hay que \nmostrar la tabla de multiplicar de dicho número, asegurándose de que el número " +
                "introducido \nse encuentra en el rango establecido.\n");
        int n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca un número (del 1 al 10): ");
            n = sc.nextInt();
        } while (n < 1 || n > 10);

        System.out.println("\nTabla del " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}