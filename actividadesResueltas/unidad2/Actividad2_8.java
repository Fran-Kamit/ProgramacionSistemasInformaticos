package unidad2;
import java.util.*;
public class Actividad2_8 {
    public static void main(String[] args) {
        System.out.println("Pedir los coeficientes de una ecuación de segundo grado y mostrar sus soluciones reales. " +
                "Si no existen, \nhabrá que indicarlo. Hay que tener en cuenta que las soluciones de una ecuación de " +
                "segundo grado, \nax2 + bx + c = 0, son : x=(-b +- (raíz cuadrada(b^2-4ac)))/2a\n");
        Scanner sc = new Scanner(System.in) . useLocale(Locale.US);
        double a, b, c, x1, x2, d;
        System.out.print("Introduzca el primer valor (a): ");
        a = sc.nextDouble();
        System.out.print("Introduzca el segundo valor (b): ");
        b = sc.nextDouble();
        System.out.print("Introduzca el tercer valor (c): ");
        c = sc.nextDouble();
        d = (b * b - 4 * a * c); //calculamos discriminante
        if (d < 0) {
            System.err.println("No existe solución real.");
        } else {
            if (a == 0) {
                System.err.println("No es una ecuación de segundo grado.");
            } else {
                x1 = (-b + Math.sqrt(d) / (2 * a));
                x2 = (-b - Math.sqrt(d) / (2 * a));
                System.out.println("Solución 1= " + x1);
                System.out.println("Solución 2= " + x2);
            }
        }
    }
}