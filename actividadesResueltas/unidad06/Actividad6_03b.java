package unidad06;

import java.util.Scanner;

public class Actividad6_03b {
    public static void main(String[] args) {
        System.out.println("Juego «Acierta la contraseña». Los caracteres acertados " +
                "se mostrarán y los\nno acertados con *.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String contr, palabra;

        System.out.print("Jugador 1. Introduzca la contraseña -> ");
        contr = sc.nextLine();

        System.out.println("La contraseña tiene " + contr.length() + " caracteres.\n");

        System.out.print("Jugador 2. Palabra -> ");
        palabra = sc.nextLine();

        while (!palabra.equals(contr)) {
            String pista = "";
            for (int i = 0; i < contr.length(); i++) {
                if (contr.charAt(i) == palabra.charAt(i)) {
                    pista += contr.charAt(i);
                } else {
                    pista += '*';
                }
            }
            System.out.println(pista);
            System.out.print("Jugador 2. Introduzca palabra de nuevo -> ");
            palabra = sc.nextLine();
        }
        System.out.println("\n¡Has acertado!");
    }
}