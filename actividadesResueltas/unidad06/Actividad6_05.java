package unidad06;

import java.util.Scanner;

public class Actividad6_05 {
    public static void main(String[] args) {
        System.out.println(" Pedir una frase y devolverla invertida.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.print("Escriba una frase -> ");

        frase = sc.nextLine();

        System.out.print("\nFrase al revés -> ");
        alReves(frase);
    }
    static void alReves(String frase) {
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            nueva = frase.charAt(i) + nueva;
        }
        System.out.println(nueva);
    }
}