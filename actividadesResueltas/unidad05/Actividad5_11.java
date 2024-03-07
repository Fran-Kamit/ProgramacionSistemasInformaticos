package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_11 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Juego abrir cámara mediante combinación secreta.\n");

        menu();
    }
    static void menu(){
        int longitud;

        do {
            System.out.print("Longitud de la combinación secreta -> ");
            longitud = sc.nextInt();
        } while (longitud < 1);

        int combSecreta[]= new int [longitud], combJugador[] = new int [longitud];

        generaCombinacion(combSecreta);

        System.out.println(Arrays.toString(combSecreta));

        System.out.println("Escriba la combinación.");
        leeTabla(combJugador);

        while (!Arrays.equals(combSecreta, combJugador)){
            muestraPistas(combSecreta, combJugador);
            System.out.println("\nEscriba una combinación");
            leeTabla(combJugador);
        }
        System.out.println("\n¡La cámara está abierta!");
    }

    static void generaCombinacion(int t[]){
        final byte MAX = 5;
        for (byte i = 0; i < t.length; i++){
            t[i] = (int)(Math.random() * MAX + 1);
        }
    }

    static void leeTabla(int t[]){
        for (byte i = 0; i < t.length; i++){
            System.out.print("Introduzca el valor de nº " + (i + 1) + " -> ");
            t[i] = sc.nextByte();
        }
    }

    static void muestraPistas(int secreto[], int jugador[]){
        System.out.println("\nPistas:");
        for(byte i = 0; i < jugador.length; i++){
            if (secreto[i] > jugador[i]){
                System.out.println("El nº es mayor que " + jugador[i]);
            } else if (secreto [i] < jugador[i]){
                System.out.println("El nº es menor que " + jugador[i]);
            } else {
                System.out.println("El nº es igual.");
            }
        }
    }
}
