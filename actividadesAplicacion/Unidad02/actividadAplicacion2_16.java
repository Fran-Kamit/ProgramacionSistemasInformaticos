package Unidad02;
import java.util.*;

public class actividadAplicacion2_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        double n1, n2;
//        double absoluto;

        System.out.println("Valor absoluto de un número.");

        System.out.print("Introduzca un número: ");
        n1 = sc.nextDouble();

/*        absoluto = n1 >= 0 ? n1 : n1*-1;
*        System.out.println("El valor absoluto de " + n1 + " es " + absoluto);*/

        if (n1 >= 0) {
            System.out.println("El valor absoluto de " + n1 + " es " + n1);
        } else {
            n2 = n1 * -1;
            System.out.println("El valor absoluto de " + n1 + " es " + n2);
        }
    }
}