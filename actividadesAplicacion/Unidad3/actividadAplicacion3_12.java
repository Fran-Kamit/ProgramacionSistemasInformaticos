package Unidad3;
import java.util.Scanner;
public class actividadAplicacion3_12 {
    public static void main(String[] args) {
        System.out.println("Conversión de binario a decimal.");

        Scanner sc = new Scanner(System.in);
        int binario1, binario2, decimal = 0, base = 1, unidad;

        do {
            System.out.print("Introduzca un número binario mayor o igual a 0: ");
            binario1 = sc.nextInt();
        } while (binario1 < 0);

        binario2 = binario1;

        while (binario2 != 0) {
            unidad = binario2 % 2;
            binario2 /= 10;
            decimal += base * unidad;
            base *= 2;
        }
        System.out.println("La conversión de " + binario1 + " a decimal es = " + decimal);
    }
}