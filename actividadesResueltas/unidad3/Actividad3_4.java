package unidad3;
import java.util.Scanner;

public class Actividad3_4 {
    public static void main(String[] args) {
        System.out.println("Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál " +
                "es el árbol más alto. Para ello se introducirá por teclado la altura (en centímetro) de cada árbol " +
                "(terminando la introducción de datos cuando se utilice -1 como altura). Los árboles se identifican " +
                "mediante etiquetas con números únicos correlativos, comenzando en 0. Diseñar una aplicación que " +
                "resuelva el problema planteado.\n");
        Scanner sc = new Scanner(System.in);
        int etiqMasAlto = 0, hMasAlto, etiqueta = 0, h;

        do {
            System.out.print("Altura del árbol (" + etiqueta + "): ");
            h = sc.nextInt();
        } while (h < -1);

        hMasAlto = h;
        while (h != -1) {
            if (h > hMasAlto) {
                hMasAlto = h;
                etiqMasAlto = etiqueta;
            }
            etiqueta++;
            do {
                System.out.print("Altura del árbol (" + etiqueta + "): ");
                h = sc.nextInt();
            } while (h < -1);
        }

        if (hMasAlto == -1) {
            System.err.println("\nNo hay ningún árbol.");
        } else {
            System.out.println("\nEl árbol más alto mide: " + hMasAlto + " cm.");
            System.out.println("Etiqueta del árbol: " + etiqMasAlto);
        }
    }
}