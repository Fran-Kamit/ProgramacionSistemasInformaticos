package unidad06;

import java.util.Scanner;

public class Actividad6_06 {
    public static void main(String[] args) {
        System.out.println(" Pedir el nombre al usuario y mostrarlo sin vocales.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String nombre, sinVocales = "";
        char a;

        System.out.print("Escriba su nombre completo -> ");
        nombre = sc.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            a = nombre.charAt(i);
            if (!esVocal(a)) {
                sinVocales = sinVocales + a;
            }
        }
        System.out.println("\nSu nombre sin vocales -> " + sinVocales);
    }

    static boolean esVocal(char a) {
        boolean result;
        String vocales = "aeiouáéíóúàèìòùäëïöü";
        a = Character.toLowerCase(a);

        if (vocales.indexOf(a) == -1) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }
}