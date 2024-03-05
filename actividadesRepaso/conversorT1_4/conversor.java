package conversorT1_4;
import java.util.*;

public class conversor {

    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        double euros;

        System.out.print("Indique los euros -> ");
        euros = sc.nextDouble();

        menu(euros);
    }

    static void menu(double euros){
        char opcion;
        final double GBP = 0.8562, JPY = 163.33, USA = 1.0838, CANADA = 1.4711;
        do {
            mostrar("\n----- CONVERSOR -----");
            mostrar("\ta -> Libras");
            mostrar("\tb -> Yen japonés");
            mostrar("\tc -> Dólar EEUU");
            mostrar("\td -> Dólar canadiense");
            mostrar("\tx -> Salir");

            System.out.print("Indica la moneda a convertir -> ");
            opcion = sc.next().charAt(0);
            System.out.println("");
        }while(opcion != 'a' && opcion != 'b' && opcion != 'c' && opcion != 'd' && opcion != 'x');

        switch (opcion){
            case 'a' -> mostrar(euros + "€ = " + euros * GBP + " GBP");
            case 'b' -> mostrar(euros + "€ = " + euros * JPY + " JPY");
            case 'c' -> mostrar(euros + "€ = " + euros * USA + " $ USA");
            case 'd' -> mostrar(euros + "€ = " + euros * CANADA + " $ canadiense");
            case 'x' -> {
                System.out.print("¿Estás seguro de salir? x -> confirmar ");
                opcion = sc.next().charAt(0);
            }
        }
        if(opcion != 'x'){
            menu(euros);
        }
    }
    static void mostrar(String texto){
        System.out.println("\t" + texto);
    }
}