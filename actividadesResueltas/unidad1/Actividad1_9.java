package unidad1;
import java.util.*;

public class Actividad1_9 {
    public static void main(String[] args) {
        System.out.println("Escribir un programa que pida un número al usuario e indique mediante un literal booleano (true o false) \nsi el número es par.\n");
        int numero;
        System.out.print("Escriba un número: ");
        numero = new Scanner(System.in) .nextInt();
        boolean esPar = (numero % 2) == 0;
        System.out.println("Es par: " + esPar);
    }
}
