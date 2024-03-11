package Unidad03;
import java.util.Scanner;

public class actividadAplicacion3_18 {
    public static void main(String[] args) {
        System.out.println(" Realiza un programa que calcule el mínimo común múltiplo de dos números.\n");

        int num1, num2, mcm, mayor;

        System.out.print("Escriba el primer número: ");
        num1 = new Scanner(System.in).nextInt();

        System.out.print("Escriba el segundo número: ");
        num2 = new Scanner(System.in).nextInt();

        mayor = num1 > num2 ? num1 : num2;
        mcm = mayor;
        while (mcm % num1 != 0 || mcm % num2 != 0) {
            mcm += mayor;
        }
        System.out.println("Mínimo común múltiplo: " + mcm);
    }
}