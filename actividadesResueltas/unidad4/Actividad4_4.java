package unidad4;
import java.util.Scanner;

public class Actividad4_4 {
    public static void main(String[] args) {
        System.out.println(" Diseñar una función que recibe como parámetros dos números enteros y devuelve" +
                "\nel máximo de ambos.\n");

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Introduzca un número: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca otro número: ");
        num2 = sc.nextInt();

        System.out.println("De los números " + num1 + " y " + num2 + " el mayor es el: " + max(num1, num2));
    }
    static int max(int num1, int num2){
        int max;
        max = Math.max(num1, num2);
        return (max);
    }
}