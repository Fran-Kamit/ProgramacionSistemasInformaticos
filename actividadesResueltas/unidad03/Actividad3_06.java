package unidad03;
import java.util.Scanner;

public class Actividad3_06 {
    public static void main(String[] args) {
        System.out.println(" Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará " +
                "todos \nlos números del 1 a n.\n");
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduzca un número: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

    }
}