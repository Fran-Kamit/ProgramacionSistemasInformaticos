package Unidad1;
import java.util.*;

public class actividadAplicacion1_14 {
    public static void main(String[] args) {
        System.out.println("Crea un programa que pida la base y la altura de un triángulo y muestre su área.\n");
        double base, altura, areaTriangulo;

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        System.out.print("Introduzca la base del triángulo: ");
        base = sc.nextDouble();

        System.out.print("Introduzca la altura del triángulo: ");
        altura = sc.nextDouble();

        areaTriangulo = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + areaTriangulo);
    }
}