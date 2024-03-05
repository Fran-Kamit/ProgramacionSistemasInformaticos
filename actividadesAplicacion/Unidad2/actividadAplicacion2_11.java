package Unidad2;
import java.util.Scanner;

public class actividadAplicacion2_11 {
    public static void main(String[] args) {
        System.out.println(" Escribe una aplicación  que solicite al usuario un númerocomprendido entre 0 y 9.999. La" +
                " aplicación \ntendrá que indicar si el número introducido es capicúa.\n");

        Scanner sc = new Scanner(System.in);
        int n, unidades, decenas, centenas, unidMillar;

        do{
        System.out.print("Introduzca un número entre 0 y 9999: ");
        n = sc.nextInt();
        } while (n < 0 || n > 9999);

        unidades = n % 10;
        decenas = n % 100 / 10;
        centenas = n % 1000 / 100;
        unidMillar = n % 10000 / 1000;

        if (n < 10) {
            System.out.println("El número " + n + " es capicúa.");
        } else {
            if (decenas == unidades && centenas == 0 && unidMillar == 0) {
                System.out.println("El número " + n + " es capicúa.");
            } else if (centenas == unidades && unidMillar == 0) {
                System.out.println("El número " + n + " es capicúa.");
            } else if (unidMillar == unidades && centenas == decenas) {
                System.out.println("El número " + n + " es capicúa.");
            } else {
                System.out.println("El número " + n + " no es capicúa.");
            }
        }
    }
}