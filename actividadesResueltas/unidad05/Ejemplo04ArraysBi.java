package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo04ArraysBi {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Solicitar al usuario que genere una tabla de 5x5\n");

        System.out.println(Arrays.deepToString(solicitarNum()));

    }

    static int[][] solicitarNum(){
        int numeros[][] = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print("Ingrese el numero de la fila " + (i + 1) + " y la columna " + (j + 1) + " -> ");
                numeros [i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return numeros;
    }
}