package unidad01;
import java.util.*;

public class Actividad1_07 {
    public static void main(String[] args) {
        System.out.println("Diseñar una aplicación que calcule la longitud y el área de una circunferencia. Para ello, el usuario \ndebe introducir el radio (que puede contener decimales).\n");
        double radio;
        double area, longitud;
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US); //Para usar los decimales con "."
        System.out.print("Escribe el radio: ");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
    }
}
