package unidad02;
import java.util.Scanner;

public class Actividad2_03 {
    public static void main(String[] args) {
        System.out.println("Solicitar dos números distintos y mostrar cuál es el mayor.\n");
        Scanner sc = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("Introduzca un número: ");
            a = sc.nextInt();
            System.out.print("Introduzca otro número: ");
            b = sc.nextInt();
        } while (a==b);
        if (a > b){
            System.out.println(a + " es mayor que " + b);
        } else {
            System.out.println(b + " es mayor que " + a);
        }
    }
}
