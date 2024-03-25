package unidad06;

import java.util.Scanner;

public class Actividad6_13 {
    public static void main(String[] args) {
        System.out.println(" Diseñar un algoritmo que lea del teclado una frase "
                + "e indique, para cada letra que aparece\nen la frase, cuántas "
                + "veces se repite. Se consideran iguales las letras mayúsculas "
                + "y las\nminúsculas para realizar la cuenta.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String frase;
        int [] numVeces;

        System.out.print("Introduzca una frase (sin acentos) -> ");
        frase = sc.nextLine() .toLowerCase();

        numVeces = new int ['z' - 'a' + 1];

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLetter(frase.charAt(i))) {
                numVeces[frase.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 'z' - 'a' + 1; i++) {
            if (numVeces[i] != 0) {
                System.out.println("La letra " + (char) (i + 'a') + ""
                        + " se repite " + numVeces[i] + " veces.");
            }
        }
    }
}