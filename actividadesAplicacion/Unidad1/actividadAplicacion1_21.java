package Unidad1;
import java.util.Scanner;

public class actividadAplicacion1_21 {
    public static void main(String[] args) {
        System.out.println("Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números son iguales y false en caso contrario.\n");
        int a, b;
        boolean igual;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        b = sc.nextInt();

        igual = a == b;
        System.out.println("¿Son los números iguales? " + igual);
    }
}