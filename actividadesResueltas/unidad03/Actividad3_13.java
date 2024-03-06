package unidad03;
import java.util.Scanner;
public class Actividad3_13 {
    public static void main(String[] args) {
        System.out.println(" Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual " +
                "a 4) \ny suspensos.\n");

        Scanner sc = new Scanner(System.in);
        int nota, aprobados = 0, condicionados = 0, suspensos = 0;

        for (int i = 1; i <= 6; i++){
            do {
                System.out.print("Nota del alumno " + i + ": ");
                nota = sc.nextInt();
            } while (nota < 0 || nota > 10);

            if (nota >= 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("");

        if (aprobados > 0) {
            System.out.println("Aprobados: " + aprobados);
        }
        if (condicionados > 0) {
            System.out.println("Condicionados: " + condicionados);
        }
        if (suspensos > 0) {
            System.err.println("Suspensos: " + suspensos);
        }
    }
}