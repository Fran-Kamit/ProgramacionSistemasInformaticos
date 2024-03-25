package unidad06;

import java.util.Scanner;

public class Actividad6_03a {
    public static void main(String[] args) {
        System.out.println("Juego «Acierta la contraseña». Se indicará si la palabra introducida es " +
                "mayor o menor alfabéticamente.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String contr, palabra;

        System.out.print("Jugador 1. Introduzca la contraseña -> ");
        contr = sc.nextLine();

        do {
            System.out.print("\nJugador 2. Palabra -> ");
            palabra = sc.nextLine();
            int compara = contr.compareTo(palabra);
            if ( compara == 0) {
                System.out.println("¡Acertaste!");
            } else if (compara < 0){
                System.out.println("La contraseña es menor que -> " + palabra);
            } else {
                System.out.println("La contraseña es mayor que -> " + palabra);
            }
        } while (!contr.equals(palabra));
    }
}