package Unidad05;

import java.util.Arrays;

public class actividadAplicacion5_12 {
    public static void main(String[] args) {
        System.out.println("Función que cambie de forma aleatoria los elementos de una tabla ordenada.\n");

        tabla();
    }

    static void tabla(){
        int t[] = {0, 1, 3, 4, 6, 8, 9}; //Incializamos con un tabla ordenada

        System.out.println("Tabla ordenada");
        System.out.println(Arrays.toString(t));

        desordenar(t);

        System.out.println("\nTabla desordenada aleatoriamente.");
        System.out.println(Arrays.toString(t));
    }

    static void desordenar(int t[]) {
        for (int i = 0; i < t.length; i++) {
            int num = (int) (Math.random() * t.length - 1);
            int aux = t[i];
            t[i] = t[num];
            t[num] = aux;
        }
    }
}