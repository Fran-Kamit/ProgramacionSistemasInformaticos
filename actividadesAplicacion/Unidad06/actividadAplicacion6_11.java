package Unidad06;

import java.util.Scanner;

public class actividadAplicacion6_11 {
    public static void main(String[] args) {
        System.out.println(" Programa para decodificar la actividad 6.11\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        final char CONJUNTO1[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
        final char CONJUNTO2[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
        char textoDescodificado[];
        String texto;

        System.out.print("Introduzca el texto a descodificar -> ");
        texto = sc.nextLine();
        texto = texto.toLowerCase();

        textoDescodificado = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) {
            textoDescodificado[i] = descodificador(CONJUNTO1, CONJUNTO2, texto.charAt(i));
        }
        System.out.println("\nTexto descodificado -> " + String.valueOf(textoDescodificado));
    }

    static char descodificador(char CONJUNTO1[], char CONJUNTO2[], char x) {
        final String CONJ1 = String.valueOf(CONJUNTO1);
        char textoDescodificado;
        int posic = CONJ1.indexOf(x);

        if (posic == -1) {
            textoDescodificado = x;
        } else {
            textoDescodificado = CONJUNTO2[posic];
        }
        return textoDescodificado;
    }
}