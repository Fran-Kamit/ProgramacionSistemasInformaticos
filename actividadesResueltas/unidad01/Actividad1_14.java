package unidad01;
import java.util.*;

public class Actividad1_14 {
    public static void main(String[] args) {
        System.out.println("Realizar un programa que pida como entrada un número decimal y lo muestre redondeado al entero más próximo.\n");
        double n;
        int redondeo;

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        System.out.print("Escriba un número decimal: ");
        n = sc.nextDouble();
        redondeo = (int) (n + 0.5);

        System.out.println(n + " redondeo es: " + redondeo);
    }
}
