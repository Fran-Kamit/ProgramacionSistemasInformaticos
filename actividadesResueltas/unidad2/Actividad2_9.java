package unidad2;
import java.util.Scanner;
public class Actividad2_9 {
    public static void main(String[] args) {
        System.out.println("Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por" +
                " teclado, que \nestará comprendido entre 0 y 99 999.\n");
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduzca un número entre 0 y 99.999: ");
            n = sc.nextInt();
        } while (n < 0 || n > 99999);

        if (n < 10) {
            System.out.println("Tiene 1 cifra.");
        } else if (n < 100) {
            System.out.println("Tiene 2 cifras.");
        } else if (n < 10000) {
            System.out.println("Tiene 4 cifras.");
        } else {
            System.out.println("Tiene 5 cifras.");
        }
    }
}