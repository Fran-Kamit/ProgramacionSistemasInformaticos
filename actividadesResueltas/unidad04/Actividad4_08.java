package unidad04;
import java.util.*;

public class Actividad4_08 {
    public static void main(String[] args) {
        System.out.println("--- Calculadora ---\n");

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int operacion, repetir;
        double n1, n2, resultado;

        do {
            System.out.print("Introduzca primer valor: ");
            n1 = sc.nextDouble();
            System.out.print("Introduzca segundo valor: ");
            n2 = sc.nextDouble();

            do {
                System.out.print("¿Qué desea realizar? (1/ Suma, 2/ Resta, 3/ Multiplicación, 4/ División) ");
                operacion = sc.nextInt();
            }while (operacion < 1 || operacion > 4);

            resultado = calculadora(n1, n2, operacion);
            System.out.println(resultado);

            do {
                System.out.print("¿Desea realizar otro cálculo? (1/ Sí, 2/ No) ");
                repetir = sc.nextInt();
                System.out.println("");
            }while (repetir < 1 || repetir > 2);
        } while (repetir == 1);

        System.out.println("Cerrando aplicación...");

    }

    //Funciones.
    static double calculadora(double a, double b, int operacion) {

        double result;

        result = switch (operacion) {
            case 1 ->
                    a + b;
            case 2 ->
                    a - b;
            case 3 ->
                    a * b;
            case 4 ->
                    (double) a / b;
            default -> {
                yield 0;
            }
        };
        return (result);
    }
}