package unidad2;
import java.util.Scanner;
public class Actividad2_7 {
    public static void main(String[] args) {
        System.out.println("Pedir tres números y mostrarlos ordenados de mayor a menor.\n");
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Introduzca el 1er número: ");
        n1 = sc.nextInt();
        System.out.print("Introduzca el 2º número: ");
        n2 = sc.nextInt();
        System.out.print("Introduzca el 3er número: ");
        n3 = sc.nextInt();
        if (n1 > n2 && n2 > n3){
            System.out.println(n1 + ", " + n2 + ", " + n3);
        } else if (n1 > n3 && n3 > n2) {
            System.out.println(n1 + ", " + n3 + ", " + n2);
        } else if (n2 > n1 && n1 > n3) {
            System.out.println(n2 + ", " + n1 + ", " + n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.println(n2 + ", " + n3 + ", " + n1);
        } else if (n3 > n1 && n1 > n2) {
            System.out.println(n3 + ", " + n1 + ", " + n2);
        } else {
            System.out.println(n3 + ", " + n2 + ", " + n1);
        }
    }
}