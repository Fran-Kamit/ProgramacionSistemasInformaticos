package Unidad02;
import java.util.Scanner;

public class actividadAplicacion2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand1, rand2, suma, n, contador = 0;
        boolean resultCorrecto = true;

        System.out.println("Juego de la suma. Suma los siguientes números:");

        do {
            rand1 = (int)(Math.random() * 99 + 1);
            rand2 = (int)(Math.random() * 99 + 1);
            suma = rand1 + rand2;

            System.out.println("\nNúmero 1: " + rand1);
            System.out.println("Número 2: " + rand2);

            System.out.print("Introduce el resultado: ");
            n = sc.nextInt();

            if (suma == n){
                System.out.println("La suma es correcta.");
                contador++;
            } else {
                System.err.println("La suma es incorrecta.");
                resultCorrecto = false;
            }
        } while (resultCorrecto);

        System.out.print("\nEl total de aciertos ha sido de " + contador);
    }
}