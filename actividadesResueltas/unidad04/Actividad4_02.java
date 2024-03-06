package unidad04;

import java.util.Scanner;

public class Actividad4_02 {
    public static void main(String[] args) {
        System.out.println(" Escribir una función a la que se le pasen dos enteros y muestre todos los números" +
                "\ncomprendidos entre ellos.\n");

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Introduzca un número: ");
        a = sc.nextInt();

        System.out.print("Introduzca otro número: ");
        b = sc.nextInt();

        mostrar(a, b);
    }

    static void mostrar(int a, int b){
        int mayor, menor;
        mayor = a > b ? a : b;
        menor = a < b ? a : b;
        for (int i = menor; i <= mayor; i++){
            System.out.println(i);
        }
    }
}