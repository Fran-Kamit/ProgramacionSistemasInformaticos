package Unidad4;
import java.util.Scanner;

public class actividadAplicacion4_14 {
    public static void main(String[] args) {
        System.out.println(" Escribe una función a la que se pase como parámetros "
                + "de entrada una cantidad de días, horas y minutos.\nLa función "
                + "calculará y devolverá el número de segundos.\n");

        Scanner sc = new Scanner(System.in);
        int dia, hora, min;

        do{
            System.out.print("Introduzca los días: ");
            dia = sc.nextInt();
        } while (dia < 0);

        do {
            System.out.print("Introduzca horas: ");
            hora = sc.nextInt();
        } while (hora < 0 || hora > 23);

        do {
            System.out.print("Introduzca minutos: ");
            min = sc.nextInt();
        } while (min < 0 || min > 59);


        System.out.println(dia + " días, " + hora + " horas y " + min + " minutos "
                + "= " + minutos(dia, hora, min) + " segundos.");
    }

    static int minutos(int dia, int hora, int min) {
        int minutos = dia * 86400 + hora * 3600 + min * 60;
        return minutos;
    }
}