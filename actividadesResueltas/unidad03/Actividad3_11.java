package unidad03;
import java.util.Scanner;

public class Actividad3_11 {
    public static void main(String[] args) {
        System.out.println("Pedir un número y calcular su factorial.\n");
        Scanner sc = new Scanner(System.in);

        int n;
        long factorial = 1;

        do {
            System.out.print("Introduzca un número positivo: ");
            n = sc.nextInt();
        } while (n < 1);

        for (int i = n; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
    }
}