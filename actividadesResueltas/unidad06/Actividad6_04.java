package unidad06;

import java.util.Scanner;

public class Actividad6_04 {
    public static void main(String[] args) {
        System.out.println("Aplicación que pide al usuario una frase e indique cuantos espacios contiene.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String frase;
        int numEspaciosBlanco = 0;
        char c;

        System.out.print("Escriba una frase -> ");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            c = frase.charAt(i);
            if (Character.isSpaceChar(c)) {
                numEspaciosBlanco ++;
            }
        }
        System.out.println("\nLa frase contiene " + numEspaciosBlanco + " espacios en blanco.");
    }
}