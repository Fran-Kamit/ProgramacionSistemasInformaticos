package Unidad4;
import java.util.Scanner;

public class actividadAplicacion4_16 {
    public static void main(String[] args) {
        System.out.println(" Implementa la función \"divisoresPrimos()\" que muestra, "
                + "por consola, todos los divisores\nprimos del número que se le "
                + "pasa como parámetro.\n");

        Scanner sc = new Scanner(System.in);
        int numElegido;

        do {
            System.out.print("Introduzca un número mayor que 1: ");
            numElegido = sc.nextInt();
        } while (numElegido < 2);

        System.out.println("\nLos divisores primos de " + numElegido + " son "
                + "los siguientes números: ");
        divisoresPrimos(numElegido);
    }

    static void divisoresPrimos(int numElegido) {
        for (int num = 2; num <= numElegido; num++) {
            boolean esPrimo = true;
            int i = 2;

            /*Saber si son primos o no.*/
            while (i < num && esPrimo) {
                if (num % i == 0) {
                    esPrimo = false;
                }
                i++;
            }
            /*Nos muestre los números primos.*/
            if (numElegido % num == 0 && esPrimo){
                System.out.print(num + " ");
            }
        }
        System.out.println("");
    }
}