package unidad3;
import java.util.Scanner;

public class Actividad3_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand1, rand2, rand3, result = 0, n, contador = 0;
        boolean resultCorrecto = true;
        char operMat = ' ';

        System.out.println("Juego del cálculo.\n");

        do {
            rand1 = (int)(Math.random() * 100 + 1);
            rand2 = (int)(Math.random() * 100 + 1);
            rand3 = (int) (Math.random() * 3);

            switch (rand3) {
                case 0 -> {
                    operMat = '+';
                    result = rand1 + rand2;
                }
                case 1 -> {
                    operMat = '-';
                    result = rand1 - rand2;
                }
                case 2 -> {
                    operMat = 'x';
                    result = rand1 * rand2;
                }
            }

            System.out.println(rand1 + " " + operMat + " " + rand2);

            System.out.print("Introduce el resultado: ");
            n = sc.nextInt();

            if (result == n){
                System.out.println("Resultado correcto.\n");
                contador++;
            } else {
                System.err.println("Resultado incorrecto.\n");
                resultCorrecto = false;
            }
        } while (resultCorrecto);

        System.out.println("\nEl total de aciertos ha sido de " + contador);
    }
}