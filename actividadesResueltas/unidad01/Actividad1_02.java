package unidad01;
import java.util.Scanner;

public class Actividad1_02 {
    public static void main(String[] args) {
        System.out.println("Diseñar un programa que pida un número al usuario -por teclado- y a continuación lo muestre.\n");
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.print("Escriba un número: ");
        num = sc.nextInt();
        System.out.println("\nValor introducido: " + num);
    }
}