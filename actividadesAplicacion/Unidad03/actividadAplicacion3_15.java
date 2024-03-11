package Unidad03;
import java.util.Scanner;
public class actividadAplicacion3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte n;

        System.out.println("Aplicación que dibuja el triángulo de Pascal, para n filas.\n");

        do {
            System.out.print("Introduzca el número de filas (mayor a 0): ");
            n = sc.nextByte();
        } while (n < 1);

        for (int fila = 0; fila < n; fila++) {
            for (int elemento = 0; elemento <= fila; elemento++) {
                int factN = 1;
                for (int i = 1; i <= fila; i++) {
                    factN *= i;
                }

                int factM = 1;
                for (int i = 1; i <= elemento; i++) {
                    factM *= i;
                }

                int factNMenosM = 1;
                for (int i = 1; i <= fila - elemento; i++) {
                    factNMenosM *= i;
                }

                int valor = factN / (factM * factNMenosM);
                System.out.print(valor + "  ");
            }
            System.out.println("");
        }
    }
}