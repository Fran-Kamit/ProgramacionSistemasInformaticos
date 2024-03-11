package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Crear tabla bidimensional 5x5. El elemento debe contener el valor 10 x n + m.\n");

        //System.out.println(Arrays.deepToString(tabla()));
        ordenarTabla(tabla());
    }

    static int [][] tabla(){
        int tabla [][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = 10 * i + j;
            }
        }
        //ordenarTabla(tabla);
        return tabla;
    }

    static void ordenarTabla(int tabla[][]){
        for (int fila[] : tabla) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}