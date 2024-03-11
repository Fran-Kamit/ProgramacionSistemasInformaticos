package Unidad02;
import java.util.Scanner;


public class actividadAplicacion2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand1, rand2, rand3, n, result = 0, contador = 0;
        String operMat = null;
        boolean resultCorrecto = true;

        System.out.println("Juego de las operaciones matemáticas. Suma, resta o multiplica los siguientes números:\n");

        do {
            rand1 = (int) (Math.random() * 99 + 1);
            rand2 = (int) (Math.random() * 99 + 1);
            rand3 = (int) (Math.random() * 3);

            switch (rand3) {
                case 0 -> {
                    operMat = "Suma";
                    result = rand1 + rand2;
                }
                case 1 -> {
                    operMat = "Resta";
                    result = rand1 - rand2;
                }
                case 2 -> {
                    operMat = "Multiplica";
                    result = rand1 * rand2;
                }
            }

            System.out.println(operMat + " el número " + rand1 + " y el número " + rand2);

            System.out.print("Introduce el resultado: ");
            n = sc.nextInt();

            if (result == n) {
                System.out.println("El resultado es correcto.\n");
                contador++;
            } else {
                System.err.println("El resultado es incorrecto.\n");
                resultCorrecto = false;
            }
        } while (resultCorrecto);

        System.out.println("\nEl total de aciertos ha sido de " + contador);
    }
}