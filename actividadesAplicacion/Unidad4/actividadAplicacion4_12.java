package Unidad4;
import java.util.*;

public class actividadAplicacion4_12 {
    public static void main(String[] args) {
        System.out.println(" Calcular la distancia euclídea que separa dos puntos.\n");

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double x1, y1, x2, y2, eucl;

        System.out.print("Introduzca el valor de x1 -> ");
        x1 = sc.nextDouble();

        System.out.print("Introduzca el valor de y1 -> ");
        y1 = sc.nextDouble();;

        System.out.print("Introduzca el valor de x2 -> ");
        x2 = sc.nextDouble();

        System.out.print("Introduzca el valor de y2 -> ");
        y2 = sc.nextDouble();

        eucl = distancia(x1, x2, y1, y2);
        System.out.println("La distancia que separa los puntos (" + x1 + ", " + y1 + ") y " +
                "(" + x2 + ", " + y2 + ") = " + eucl );
    }
    static double distancia(double x1, double x2, double y1, double y2){
        double distancia;
        distancia = Math.sqrt(Math.pow((x1 - x2),2) + Math.pow((y1 - y2), 2));
        return distancia;
    }
}