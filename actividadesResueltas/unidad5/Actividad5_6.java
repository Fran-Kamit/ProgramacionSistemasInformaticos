package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_6 {
    public static void main(String[] args) {
        System.out.println(" Definir una función que tome como parámetro dos tablas, "
                + "la primera con los 6 números de\nuna apuesta de la primitiva, y "
                + "la segunda (ordenada) con los 6 números de la combinación\nganadora. "
                + "La función devolverá el número de aciertos.\n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su apuesta.");
        int apuesta[] = new int [6];
        int numero1;

        for (int i = 0; i < apuesta.length; i++) {
            do {
                System.out.print("Introduzca número -> ");
                numero1 = sc.nextInt();
                if (numero1 < 1 || numero1 > 49){
                    System.out.println("Número no válido.");
                }

                int indice1 = 0;
                while (indice1 < apuesta.length && apuesta[i] != numero1){
                    indice1++;
                }
                if (indice1 >= apuesta.length){
                    apuesta[i] = numero1;
                } else {
                    i--;
                    System.out.println("Número repetido.");
                }
            }while(apuesta[i] < 1 || apuesta[i] > 49);
        }

        /*Combinación ganadora*/
        int[] combGanadora = new int [6];
        int numero2;

        for (int i = 0; i < combGanadora.length; i++) {
            numero2 = (int) (Math.random() * 49 + 1);
            //si el aleatorio duplica un número, hay que validarlo para que no se duplique

            int indice2 = 0;
            while (indice2 < combGanadora.length && combGanadora[i] != numero2) {
                indice2++;
            }
            if (indice2 >= combGanadora.length) {
                combGanadora[i] = numero2;
            } else {
                i--;
            }

        }

        System.out.println("Tu apuesta -> " + Arrays.toString(apuesta));
        System.out.println("Apuesta ganadora -> " + Arrays.toString(combGanadora));
        System.out.println("\nNúmero de aciertos: " + primitiva(apuesta, combGanadora));
    }

    static int primitiva(int apuesta[], int combGanadora[]) {
        //Ordenamos los Arrays
        Arrays.sort(combGanadora);
        Arrays.sort(apuesta);
        /////
        int aciertos = 0;

        for (int i : apuesta) {
            if (Arrays.binarySearch(combGanadora, i) >= 0) {
                aciertos++;
            }
        }
        return (aciertos);
    }
}