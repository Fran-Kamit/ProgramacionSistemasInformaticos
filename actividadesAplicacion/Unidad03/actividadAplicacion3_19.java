package Unidad03;
import java.util.Scanner;

public class actividadAplicacion3_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, aproximacion = 0;

        System.out.print("Escriba un número para calcular su raiz cuadrada: ");
        n = sc.nextInt();

        do {
            aproximacion++;
        } while (Math.pow(aproximacion, 2) <= n);

        aproximacion--;

        System.out.println("Raiz cuadrada: " + aproximacion);
        System.out.println("Resto: " + (n - Math.pow(aproximacion, 2)));

    }
}