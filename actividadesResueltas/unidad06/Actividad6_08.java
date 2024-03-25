package unidad06;

import java.util.Scanner;

public class Actividad6_08 {
    public static void main(String[] args) {
        System.out.println(" Los habitantes de Javalandia tiene un idioma algo "
                + "extraño; cuando hablan siempre comenzando\nsus frases con "
                + "«Javalín, javalón», para después hacer una pausa más o menos "
                + "larga y a\ncontinuación expresan el mensaje. Existe un dialecto "
                + "que no comienza sus frases con la\nmuletilla anterior, pero "
                + "siempre las terminan con un silencio más o menos prolongado y "
                + "la\ncoletilla «javalén, len, len». Se pide diseñar un traductor "
                + "que, en primer lugar, nos diga\nsi la frase introducida está "
                + "escrita en el idioma de Javalandia (en cualquiera de sus "
                + "dialectos),\ny en caso afirmativo, nos muestre solo el mensaje "
                + "sin muletillas.\n");

        principal();
    }
    static void principal(){
        Scanner sc = new Scanner(System.in);
        final String PREFIJO = "Javalín, javalón";
        final String SUFIJO = "javalén, len, len";
        String entrada;
        boolean idiomaJavalandia = false;

        System.out.print("Escriba una frase -> ");
        entrada = sc.nextLine();
        System.out.println();

        if (entrada.startsWith(PREFIJO)) {
            idiomaJavalandia = true;
            entrada = entrada.substring(PREFIJO.length());
        } else if (entrada.endsWith(SUFIJO)) {
            idiomaJavalandia = true;
            entrada = entrada.substring(0, entrada.length() - SUFIJO.length());
        }

        if (idiomaJavalandia) {
            entrada = entrada.strip();
            System.out.println(entrada);
        } else {
            System.out.println("No está escrito en el idioma de Javalandia.");
        }
    }
}