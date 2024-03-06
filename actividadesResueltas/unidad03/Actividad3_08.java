package unidad03;
import java.util.Scanner;

public class Actividad3_08 {
    public static void main(String[] args) {
        System.out.println(" Pedir diez números enteros por teclado y mostrar la media.\n");
        int n, suma = 0;
        double media;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            do {
                System.out.print("Escriba un número (mayor o igual a 0) para " + i + ": ");
                n = sc.nextInt();
            } while (n < 0);
            suma += n;
        }
        media = suma / 10.0;
        System.out.println("Media = " + media);
    }
}