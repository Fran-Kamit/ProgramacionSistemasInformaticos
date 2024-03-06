package unidad03;
import java.util.Scanner;

public class ActividadPropuesta3_02 {
    public static void main(String[] args) {
        System.out.println(" Implementa la apliación Eco, que pide al usuario un número y muestre «Eco...» tantas " +
                "veces \ncomo indique el número introducido.\n");
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Introduzca un número (mayor a 0): ");
            num = sc.nextInt();
        } while (num <= 0);

        for (int i = 1; i <= num; i++){
            System.out.println("Eco...");
        }
    }
}