package unidad06;

import java.util.*;

public class Actividad6_12 {
    public static void main(String[] args) {
        System.out.println(" Un anagrama es una palabra que resulta del cambio "
                + "del orden de los caracteres de otra.\nConstruir un programa "
                + "que solicite al usuarios dos palabras e indique si son "
                + "anagramas una\nde otra.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;
        char tablaPalabra1[], tablaPalabra2[];

        System.out.print("Escriba una palabra -> ");
        palabra1 = sc.nextLine() .toLowerCase();

        System.out.print("Escriba otra -> ");
        palabra2 = sc.nextLine() .toLowerCase();

        if (palabra1.length() != palabra2.length()) {
            System.out.println("\n" + palabra1 + " no es un anagrama de " + palabra2);
        } else {
            tablaPalabra1 = palabra1.toCharArray();
            tablaPalabra2 = palabra2.toCharArray();
            Arrays.sort(tablaPalabra1);
            Arrays.sort(tablaPalabra2);

            if (Arrays.equals(tablaPalabra1, tablaPalabra2)) {
                System.out.println("\n" + palabra1 + " es un anagrama de " + palabra2);
            } else {
                System.out.println("\n" + palabra1 + " no es un anagrama de " + palabra2);
            }
        }
    }
}