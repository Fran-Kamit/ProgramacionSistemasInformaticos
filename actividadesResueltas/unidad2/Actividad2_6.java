package unidad2;
import java.util.Scanner;

public class Actividad2_6 {
    public static void main(String[] args) {
        System.out.println("Realizar de nuevo la actividad 2_3 considerando el caso de que los números introducidos " +
                "sean iguales.\n");
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        System.out.print("Introduzca un número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Son iguales");
        } else {
            if (n1 > n2){
                System.out.println(n1 + " es mayor que " + n2);
            } else {
                System.out.println(n2 + " es mayor que " + n1);
            }
        }
    }
}