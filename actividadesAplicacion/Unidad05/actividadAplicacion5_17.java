package Unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class actividadAplicacion5_17 {
    /*Implementa una función, que crea y devuelve una tabla con las sumas de los elementos consecutivos.*/
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        Scanner sc = new Scanner(System.in);
        int longTabla, numElementos;

        do {
            System.out.print("Introduzca el tamaño de la tabla -> ");
            longTabla = sc.nextInt();
        } while (longTabla < 1);

        int t[] = new int[longTabla];
        System.out.println();
        for (int i = 0; i < (longTabla); i++) {
            System.out.print("Introduzca el valor " + (i+1) + " -> ");
            t[i] = sc.nextInt();
        }

        do {
            System.out.print("\nIntroduzca la agrupación de números -> ");
            numElementos = sc.nextInt();
        } while (numElementos < 1);

        //int t[] = {10, 1, 5, 8, 9, 2};
        //int numElementos = 3;
        int aux[] = suma(t,numElementos);
        System.out.println("\nLa sumas de " + Arrays.toString(t));
        System.out.print("Agrupando " + numElementos + " elementos = ");
        System.out.println(Arrays.toString(aux));
    }

    static int[] suma(int t[], int numElementos) {
        int sumas[] = new int[t.length - numElementos + 1];

        for (int i = 0; i < sumas.length; i++) {
            sumas[i] = 0;
            for (int j = 0; j < numElementos; j++) {
                sumas[i] += t[i+j];
            }
        }
        return sumas;
    }
}