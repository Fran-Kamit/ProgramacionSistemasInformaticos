package unidad06;

import java.util.Scanner;

public class Actividad6_10 {
    public static void main(String[] args) {
        System.out.println(" Realizar un programa que lea una frase del teclado "
                + "y nos indique si es palíndroma, es decir,\nque la frase sea "
                + "igual leyendo de izquierda a derecha, que de derecha a "
                + "izquierda, sin tener\nen cuenta los espacios.\n"
                + "Ej. «Dábale arroz a la zorra el abad».\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String frase, sinEspacios, invertida;

        System.out.print("Escriba una frase -> ");
        frase = sc.nextLine();

        frase = frase.toLowerCase();

        sinEspacios = eliminaEspacios(frase);

        invertida = alReves(sinEspacios);

        if (sinEspacios.equals(invertida)) {
            System.out.println("\nLa frase es palíndroma.");
        } else {
            System.out.println("\nLa frase no es palíndroma.");
        }
    }

    static String eliminaEspacios(String frase) {
        String sin = "";
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (!Character.isWhitespace(c)) {
                sin = sin + c;
            }
        }
        return sin;
    }

    static String alReves(String frase) {
        String nueva = "";
        for (int i = 0; i < frase.length(); i++) {
            nueva = frase.charAt(i) + nueva;
        }
        return nueva;
    }
}