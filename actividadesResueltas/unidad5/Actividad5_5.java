package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_5 {
    public static void main(String[] args) {
        System.out.println(" Crea y devuelve una tabla ordenada que se encuentra rellenada con números " +
                "pares aleatorios.\n");

        Scanner sc = new Scanner(System.in);
        int longitud, fin;

        do {
            System.out.print("¿Qué longitud de tabla desea? (>= 1) ");
            longitud = sc.nextInt();
        }while (longitud < 1);

        do {
            System.out.print("Introduzca el nº máximo (>= 2) ");
            fin = sc.nextInt();
        }while (fin < 2);

        System.out.println();

        rellenaPares(longitud, fin);
    }
    static int [] rellenaPares(int longitud, int fin){
        int pares[] = new int [longitud];
        int i = 0, num;

        while (i < pares.length){
            num = (int)(Math.random()*fin + 1);
            if (num % 2 == 0){
                pares [i] = num;
                i++;
            }
        }
        Arrays.sort(pares);
        System.out.println(Arrays.toString(pares));
        return (pares);
    }
}
