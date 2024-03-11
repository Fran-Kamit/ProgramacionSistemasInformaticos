package Unidad04;
import java.util.Scanner;

public class actividadAplicacion4_15 {
    public static void main(String[] args) {
        System.out.println(" Diseña una función a la que se le pasan las horas y "
                + "minutos de dos instantes de tiempo.\nLa función devolverá la "
                + "cantidad de minutos que existen de diferencia entre los dos"
                + "\ninstantes utilizados.\n");

        Scanner sc = new Scanner(System.in);
        int hora1, min1, hora2, min2;

        System.out.println("Primer instante de tiempo.");

        do {
            System.out.print("Introduzca horas: ");
            hora1 = sc.nextInt();
        }while (hora1 < 0);

        do {
            System.out.print("Introduzca minutos (entre 0 y 59): ");
            min1 = sc.nextInt();
        } while (min1 < 0 || min1 > 59);


        System.out.println("\nSegundo instante de tiempo.");

        do {
            System.out.print("Introduzca horas: ");
            hora2 = sc.nextInt();
        } while (hora2 < 0);

        do {
            System.out.print("Introduzca minutos (entre 0 y 59): ");
            min2 = sc.nextInt();
        } while (min2 < 0 || min2 > 59);

        System.out.println("\nDiferencia entre los dos instantes = " + diferenciaMin(hora1, min1, hora2, min2) + " minutos.");
    }

    static int diferenciaMin(int hora1, int min1, int hora2, int min2) {
        int diferenciaMin;
        int minutos1 = hora1 * 60 + min1;
        int minutos2 = hora2 * 60 + min2;

        if (minutos1 >= minutos2) {
            diferenciaMin = minutos1 - minutos2;
        } else {
            diferenciaMin = minutos2 - minutos1;
        }
        return diferenciaMin;
    }
}