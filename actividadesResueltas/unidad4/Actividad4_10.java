package unidad4;
import java.util.*;

public class Actividad4_10 {
    public static void main(String[] args) {
        System.out.println(" Diseñar una función que calcule A^n\n");

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double a, solucion;
        int n;

        do {
            System.out.print("Introduzca el valor de la base: ");
            a = sc.nextDouble();
        } while (a == 0);

        do {
            System.out.print("Introduzca el valor (positivo) del exponente: ");
            n = sc.nextInt();
        } while (n < 0);

        solucion = calculo(a, n);
        System.out.println(a + " ^ " + n + " = " + solucion);
    }
    static double calculo(double a, int n) {
        double solucion;
        solucion = Math.pow(a, n);
        return solucion;
    }
}