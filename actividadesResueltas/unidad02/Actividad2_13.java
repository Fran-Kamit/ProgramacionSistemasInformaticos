package unidad02;
import java.util.Scanner;

public class Actividad2_13 {
    public static void main(String[] args) {
        System.out.println(" Escribir un rograma que pida una hora de la siguiente forma: hora, minutos y segundos. " +
                "El programa debe mostrar \nqué hora será un segundo más tarde.\n");
        Scanner sc = new Scanner(System.in);
        byte h, m, s;

        do {
            System.out.print("Introduzca la hora (de 0 a 23): ");
            h = sc.nextByte();
        } while (h < 0 || h > 23);

        do {
            System.out.print("Introduzca los minutos (de 0 a 59): ");
            m = sc.nextByte();
        } while (m < 0 || m > 59);

        do {
            System.out.print("Introduzca los segundos (de 0 a 59): ");
            s = sc.nextByte();
        } while (s < 0 || s > 59);

        s++;

        if (s > 59) {
            s = 0;
            m++;

            if (m > 59) {
                m = 0;
                h++;

                if (h > 23) {
                    h = 0;
                }
            }
        }
        System.out.println("\nHora + 1 segundo = " + h + ":" + m + ":" + s);
    }
}
