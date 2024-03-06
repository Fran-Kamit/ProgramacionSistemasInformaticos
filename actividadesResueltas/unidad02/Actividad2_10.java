package unidad02;
import java.util.Scanner;

public class Actividad2_10 {
    public static void main(String[] args) {
        System.out.println("Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 " +
                "a 4), \nsuficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).\n");
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Introduzca una nota del 0 al 10: ");
            nota = sc.nextInt();
        } while (nota < 0 || nota > 10);

        switch (nota) {
            case 0, 1, 2, 3, 4 -> System.out.println("Insuficiente.");
            case 5 -> System.out.println("Suficiente.");
            case 6 -> System.out.println("Bien.");
            case 7, 8 -> System.out.println("Notable.");
            case 9, 10 -> System.out.println("Sobresaliente.");
        }
    }
}