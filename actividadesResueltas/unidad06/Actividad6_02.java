package unidad06;

import java.util.Scanner;

public class Actividad6_02 {
    public static void main(String[] args) {
        System.out.println(" Introducir por teclado dos frases e indicar cuál de ellas es la más corta, " +
                "es decir,\nla que contiene menos caracteres.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String frase1, frase2;
        int longFrase1, longFrase2;

        //Leémos las dos frases
        System.out.print("Introduzca la 1ª frase -> ");
        frase1 = sc.nextLine();

        System.out.print("Introduzca la 2ª frase -> ");
        frase2 = sc.nextLine();

        System.out.println();

        //Calculamos la longitud
        longFrase1 = frase1.length();
        longFrase2 = frase2.length();

        //Comparamos los tamaños
        if (longFrase1 < longFrase2) {
            System.out.println(frase1 + " es más corta que " + frase2);
        } else if (longFrase1 > longFrase2) {
            System.out.println(frase2 + " es más corta que " + frase1);
        } else {
            System.out.println("Las frases tienen la misma longitud.");
        }
    }
}