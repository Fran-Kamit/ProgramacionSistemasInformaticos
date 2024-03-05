package Unidad1;
import java.util.*;

public class actividadAplicacion1_17 {
    public static void main(String[] args) {
        System.out.println("Solicita al usuario tres distancias:\nLa primera, medida en milímetros.\nLa segunda, medida en centímetros. \nLa última, medida en metros.\nDiseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).\n");
        double mm, cm, m, sumaLongitud;

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        System.out.print("Introduce medida en milímetros: ");
        mm = sc.nextDouble();

        System.out.print("Introduce medida en centrímetros: ");
        cm = sc.nextDouble();

        System.out.print("Introduce medida en metros: ");
        m = sc.nextDouble();

        mm = mm / 10;
        m = m * 100;

        sumaLongitud = m + cm + mm;

        System.out.println("La suma de las longitudes dan: " + sumaLongitud + " cm.");
    }
}