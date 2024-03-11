package Unidad03;
import java.util.Scanner;

public class actividadAplicacion3_17 {
    public static void main(String[] args) {
        System.out.println(" Realiza un programa que calcule el máximo comun divisor de dos números.\n");

        int num1, num2, mcd;

        System.out.print("Escriba el primer número: ");
        num1 = new Scanner(System.in).nextInt();

        System.out.print("Escriba el segundo número: ");
        num2 = new Scanner(System.in).nextInt();

        mcd = num1 < num2 ? num1 : num2;
        boolean encontrado = false;

        while (mcd >= 1 && !encontrado) {
            if (num1 % mcd == 0 && num2 % mcd == 0) {
                encontrado = true;
                System.out.println("El mcd es: " + mcd);
            }
            mcd--;
        }

    }

}