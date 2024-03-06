package unidad02;
import java.util.*;

public class ActividadPropuesta2_05 {
    public static void main(String[] args) {
        System.out.println(" Escribir un programa que calcule el dinero recaudado en un concierto. La aplicación " +
                "solicitará el aforo máximo \nlocal, el precio por entrada y el número de entradas vendidas. Hay que " +
                "tener en cuenta que si el número de \nentradas no supera el 20% del aforo del local, se cancela el " +
                "concierto. Si el número de entradas vendidas no \nsupera el 50% del aforo del local, se realiza una " +
                "rebeja del 25% del precio de la entrada.\n");

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        int aforoMax, numEntradasVendidas;
        double precioEntrada, recaudacion;

        do {
            System.out.print("Introduzca el aforo máximo: ");
            aforoMax = sc.nextInt();
        } while (aforoMax < 1);

        do {
            System.out.print("Introduzca el número de entradas vendidas: ");
            numEntradasVendidas = sc.nextInt();
        } while (numEntradasVendidas < 0 || aforoMax < numEntradasVendidas);

        do {
            System.out.print("Introduzca el precio de cada entrada: ");
            precioEntrada = sc.nextDouble();
        } while (precioEntrada < 0);

        if (numEntradasVendidas <= (aforoMax * 0.2)){
            System.out.println("\nSe cancela el concierto por no haber suficientes personas.");
        } else if (numEntradasVendidas < (aforoMax * 0.5)){
            precioEntrada -= (precioEntrada * 0.25);
            System.out.println("\nAl no superar la mitad del aforo el precio de la entrada es = " + precioEntrada + "€");
            recaudacion= numEntradasVendidas * precioEntrada;
            System.out.println("\nLa recaudación del concierto es = " + recaudacion + "€");
        } else {
            System.out.println("El concierto se puede realizar con normalidad.");
            recaudacion = numEntradasVendidas * precioEntrada;
            System.out.println("\nLa recaudación del concierto es = " + recaudacion + "€");
        }
    }
}