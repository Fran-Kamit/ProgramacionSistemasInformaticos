package unidad03;
import java.util.Scanner;
public class ActividadPropuesta3_03 {
    public static void main(String[] args) {
        System.out.println("Implementa un programa que pida al usuario un número positivo y lo muestre guarismo " +
                "a guarismo.\n");

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número mayor a 0: ");
            n = sc.nextInt();
        } while (n < 1);

        for (int i = n; i > 0; i /= 10) {
            System.out.println(i % 10);
        }
    }
}