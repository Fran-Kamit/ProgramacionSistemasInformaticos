package unidad02;
import java.util.Scanner;

public class Actividad2_02 {
    public static void main(String[] args) {
        System.out.println("Pedir dos número y decir si son iguales o no.\n");
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.print("Introduzca un número: ");
        a = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        b = sc.nextInt();
        if (a == b){
            System.out.println("Ambos números son iguales.");
        } else {
            System.out.println("Ambos números son distintos.");
        }
    }
}
