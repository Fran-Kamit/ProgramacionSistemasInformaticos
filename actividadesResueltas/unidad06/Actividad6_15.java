package unidad06;

import java.util.Scanner;

public class Actividad6_15 {
    public static void main(String[] args) {
        System.out.println(" Modificar la actividad anterior para que el programa "
                + "indique al jugador 2 cuántas letras\ncoinciden entre el texto "
                + "introducido por él y el original.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String textoJugador1, intentoJugador2;

        do {
            System.out.print("Jugador 1. Introduzca una palabra -> ");
            textoJugador1 = sc.next();
        } while (textoJugador1.isEmpty());

        System.out.println("\nA qué palabra corresponde el anagrama -> " + creaAnagrama(textoJugador1));

        System.out.print("\nJugador 2. ¿Cuál es el original? ");
        do {
            intentoJugador2 = sc.next();
            if (!textoJugador1.equals(intentoJugador2)){
                System.out.println("Letras en posición correcta -> " + letrasCorrectas(textoJugador1, intentoJugador2));
                System.out.print("Vuelva a introducir la palabra -> ");
            }
        } while (!textoJugador1.equals(intentoJugador2));

        System.out.println("\n¡Has acertado!");
    }

    static String creaAnagrama(String textoJugador1) {
        char anagrama[] = textoJugador1.toCharArray();

        for (int aleatorio = 0; aleatorio < anagrama.length; aleatorio++) {
            int i = (int)(Math.random() * anagrama.length);
            int j = (int)(Math.random() * anagrama.length);

            char auxiliar = anagrama[i];

            anagrama[i] = anagrama[j];
            anagrama[j] = auxiliar;
        }

        return String.valueOf(anagrama);
    }

    static int letrasCorrectas(String textoJugador1, String intentoJugador2) {
        int longitudMinima = Math.min(textoJugador1.length(), intentoJugador2.length());
        int contCorrectas = 0;

        for (int i = 0; i < longitudMinima; i++) {
            if (textoJugador1.charAt(i) == intentoJugador2.charAt(i)) {
                contCorrectas++;
            }
        }
        return contCorrectas;
    }
}