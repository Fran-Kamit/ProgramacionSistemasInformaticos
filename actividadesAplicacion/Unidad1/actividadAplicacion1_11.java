package Unidad1;
import java.util.*;

public class actividadAplicacion1_11 {
    public static void main(String[] args) {
        System.out.println("Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación debe solicitar la \nbase imponible y el IVA que se debe aplicar. Muestra en pantalla el importe correspondiente al IVA y al total.\n");
        int iva;
        double baseImponible, importeIva, importeTotal;

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        System.out.print("Introduzca base imponible: ");
        baseImponible = sc.nextDouble();

        System.out.print("Introduzca IVA: ");
        iva = sc.nextInt();

        importeIva = (baseImponible * iva) / 100;
        System.out.println("El importe del IVA es de " + importeIva + " €");

        importeTotal = baseImponible + importeIva;
        System.out.println("El importe total es de " + importeTotal + " €");
    }
}
