package unidad06;

import java.util.Scanner;

public class Actividad6_07 {
    public static void main(String[] args) {
        System.out.println("Solicitar una frase y una palabra. A continuación el progama debe buscar cuántas veces " +
                "\naparece la palabra en la frase.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int cont = 0, posic;

        System.out.print("Introduzca una frase -> ");
        frase = sc.nextLine();

        System.out.print("Introduzca la palabra -> ");
        palabra = sc.nextLine();

        posic = frase.indexOf(palabra);
        while (posic != -1) {
            cont++;
            posic = frase.indexOf(palabra, posic + 1);
        }
        if (cont == 0) {
            System.out.println("\"" + palabra + "\" no se encuentra en la frase.");
        } else {
            System.out.println("\"" + palabra + "\" está " + cont + " veces.");
        }
    }
}