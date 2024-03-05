package Unidad2;
import java.util.*;

public class actividadAplicacion2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        double grados, grados1, result, resultRedondeo;

        System.out.println("Conversor de grados a radianes.\n");

        System.out.print("Introduce los grados: ");
        grados = sc.nextDouble();

        if (grados > -360 && grados < 360) {
            result = (grados * Math.PI) / 180;
            resultRedondeo = Math.round(result * 1000.0) / 1000.0; // redondeo con 3 decimales con "."
            System.out.println(grados + "º es igual a " + resultRedondeo + " radianes.");
            //System.out.println(result);
        } else {
            grados1 = grados % 360;
            result = (grados1 * Math.PI) / 180;
            //resultRedondeo = Math.round(result * 1000.0) / 1000.0;
            System.out.print(grados + "º es igual a " + grados1 + "º, que a su vez es igual a ");
            System.out.printf("%.3f", result); //redondeo con 3 decimales con ","
            System.out.println(" radianes.");
            //System.out.println(result);
        }
    }
}