package unidad06;

import java.util.Scanner;

public class Actividad6_09 {
    public static void main(String[] args) {
        System.out.println(" Introducir por teclado una frase palabra a palabra, "
                + "y mostrar la frase completa separando\nlas palabras introducidas "
                + "con espacios en blanco. Terminar de leer la frase cuando alguna"
                + "\nde las palabras introducidas sea la cadena «fin» escrita con "
                + "cualquier combinación de\nmayúsculas y minúsculas. La cadena "
                + "«fin» no aparecerá en la frase final.\n");

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        String frase = "", palabra;

        System.out.print("Escriba una palabra -> ");
        palabra = sc.next();

        while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + " " + palabra;
            System.out.print("Escribe una palabra -> ");
            palabra = sc.next();
        }
        System.out.println("\n\n" + frase);
    }
}