package Unidad03;
import java.util.Scanner;

public class actividadAplicacion3_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Solicita al usuario un número y dibuja un triángulo de base y altura.\n");
        System.out.print("Introduzca un número: ");

        int filasTotales = sc.nextInt();

        for (int filas = 1 ; filas <= filasTotales; filas++) {
            for (int espacio = 1; espacio <= (filasTotales - filas); espacio++) {
                System.out.print(" ");
            }
            for (int asterisco = 1; asterisco <= filas; asterisco++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}