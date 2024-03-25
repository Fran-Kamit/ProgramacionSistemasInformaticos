package Unidad06;

import java.util.Scanner;

public class actividadAplicacion6_12 {
    public static void main(String[] args) {
        System.out.println(" Juego del ahorcado.\n");

        principal();
    }

    static Scanner sc = new Scanner(System.in);

    static void principal(){
        //Códigos de colores para cambiar el color del texto.
        final String RESET="\u001B[0m";
        final String RED="\033[31m";
        final String GREEN="\033[32m";
        final String YELLOW="\033[33m";
        /*final String BLACK="\033[30m";
        final String BLUE="\033[34m";
        final String PURPLE="\033[35m";
        final String CYAN="\033[36m";
        final String WHITE="\033[37m";*/

        String jugadorA = palabraSecreta();
        char[] guiones = guionizacion(jugadorA);
        char jugadorB;
        boolean finPartida = false, acierto, juegoGanado;
        int vidas = 7;

        do {
            System.out.println("\nTienes " + vidas + " vidas.");
            System.out.println(guiones);
            System.out.print("Jugador B, introduzca letra -> ");
            jugadorB = sc.next() .toUpperCase() .charAt(0);
            acierto = false;

            for (int i = 0; i < jugadorA.length(); i++) {
                if (jugadorA.charAt(i) == jugadorB) {
                    guiones[i] = jugadorB;
                    acierto = true;
                }
            }
            if (!acierto) {
                System.out.println(YELLOW + "La letra " + jugadorB + " no está." + RESET);
                vidas--;
                if(vidas == 0) {
                    System.out.println(RED + "\nFin de partida." + RESET);
                    System.out.println("La palabra era " + jugadorA);
                    finPartida = true;
                }
            } else {
                juegoGanado = !quedanGuiones(guiones);
                if (juegoGanado) {
                    System.out.println(GREEN + "\n¡Has acertado!" + RESET);
                    System.out.println("La palabra es " + jugadorA);
                    finPartida = true;
                }
            }
        } while (!finPartida);
    }

    static String palabraSecreta() {
        System.out.print("Jugador A, introduzca palabra -> ");
        String jugadorA = sc.next() .toUpperCase();
        return jugadorA;
    }

    static char[] guionizacion(String jugadorA) {
        int numLetras = jugadorA.length();
        char[] guiones = new char[numLetras];
        for (int i = 0; i < guiones.length; i++) {
            guiones[i] = '-';
        }
        return guiones;
    }

    static boolean quedanGuiones(char[] posiciones) {
        for (char letra : posiciones) {
            if (letra == '-') {
                return true;
            }
        }
        return false;
    }
}