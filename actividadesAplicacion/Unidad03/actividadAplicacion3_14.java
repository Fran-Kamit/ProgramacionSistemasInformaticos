package Unidad03;
import java.util.Scanner;
public class actividadAplicacion3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hastaNum, contadorPrimos = 1;
        boolean esPrimo;

        do {
            System.out.print("Introduzca un número mayor a 1: ");
            hastaNum = sc.nextInt();
        } while (hastaNum < 1);

        for (int num = 2; num <= hastaNum; num++) {
            esPrimo = true;
            int i = 2;
            while (i < num && esPrimo) {
                if (num % i == 0) {
                    esPrimo = false;
                }
                i++;
            }
            if (esPrimo) {
                contadorPrimos++;
            }
        }
        System.out.println("Hay " + contadorPrimos + " números primos entre " + hastaNum + " y 1.");
    }
}