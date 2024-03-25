package unidad06;

import java.util.Scanner;

public class Actividad6_14 {
    public static void main(String[] args) {
        System.out.println(" Implementar el juego del anagrama, que consiste en "
                + "que un jugador escribe una palabra y la aplicación \nmuestra "
                + "un anagrama (cambio del orden de los caracteres) generado "
                + "al azar. A continuación, otro jugador \ntiene que acertar cuál "
                + "es el texto original. La aplicación no debe permitir que el "
                + "texto introducido \npor el jugador 1 sea una cadena vacía.\n");

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
                System.out.print("No es correcto. Vuelva a introducir la palabra -> ");
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
}