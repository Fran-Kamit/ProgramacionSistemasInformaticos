package unidad02;
import java.util.Scanner;

public class Actividad2_11 {
    public static void main(String[] args) {
        System.out.println("dear un programa que solicite al usuario un número comprendido entre 1 y 7, " +
                "correspondiente a un día de la semana. Se \ndebe mostrar el nombre del día de la semana al que " +
                "corresponde. \n");
        Scanner sc = new Scanner(System.in);
        byte dia;

        do{
            System.out.print("Introduzca un número del 1 al 7: ");
            dia = sc.nextByte();
        } while (dia < 1 || dia > 7);

        switch (dia) {
            case 1 -> System.out.println(dia + " corresponde al lunes.");
            case 2 -> System.out.println(dia + " corresponde al martes.");
            case 3 -> System.out.println(dia + " corresponde al miércoles.");
            case 4 -> System.out.println(dia + " corresponde al jueves.");
            case 5 -> System.out.println(dia + " corresponde al viernes.");
            case 6 -> System.out.println(dia + " corresponde al sábado.");
            case 7 -> System.out.println(dia + " corresponde al domingo.");
        }
    }
}