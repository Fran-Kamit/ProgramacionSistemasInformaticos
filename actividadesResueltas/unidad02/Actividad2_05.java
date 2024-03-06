package unidad02;
import java.util.Scanner;

public class Actividad2_05 {
    public static void main(String[] args) {
        System.out.println("Pedir dos número y mostrarlos ordenados de forma decreciente.\n");
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        int mayor, menor;
        System.out.print("Introduzca un número: ");
        n1= sc.nextInt();
        System.out.print("Introduzca otro número: ");
        n2 = sc.nextInt();
        mayor = n1 > n2 ? n1 : n2;
        menor = n1 < n2 ? n1 : n2;
        System.out.println(mayor + ", " + menor);
    }
}