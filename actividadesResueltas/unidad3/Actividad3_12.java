package unidad3;
import java.util.Scanner;
public class Actividad3_12 {
    public static void main(String[] args) {
        System.out.println("Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso.\n");

        Scanner sc = new Scanner(System.in);
        int notas;
        boolean suspensos = false;

        for (int i = 1; i <= 5; i++) {
            do {
                System.out.print("Introduzca la nota (de 0 a 10) del alumno " + i + ": ");
                 notas = sc.nextInt();
            } while (notas < 0 || notas > 10);
            if (notas < 5) {
                suspensos = true;
                break;
            }
        }
        System.out.println("");
        if (suspensos) {
            System.err.println("Hay alumnos suspensos.");
        } else {
            System.out.println("No hay suspensos.");
        }
    }
}