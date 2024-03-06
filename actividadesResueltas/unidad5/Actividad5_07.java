package unidad5;

import java.util.Arrays;

public class Actividad5_07 {
    public static void main(String[] args) {
        System.out.println(" Implementar la función: (int[]), que construye y "
                + "devuelve una tabla de la longitud apropiada,\ncon los elementos de t,"
                + "donde se han eliminado los datos repetidos.\n");

        int tabla[] = {1, 5, 9, 2, 4, 4, 4, 5, 5};
        Arrays.sort(tabla);

        System.out.println("Con valores repetidos: " + Arrays.toString(tabla));
        int sinRepetidos[] = sinRepetidos(tabla);
        System.out.println("Sin valores repetidos: " + Arrays.toString(sinRepetidos));
    }

    static int[] sinRepetidos (int t[]) {
        int temporal[] = new int[0];
        for (int elemento : t) {
            if (buscar(temporal, elemento) == -1) {
                temporal = Arrays.copyOf(temporal, temporal.length + 1);
                temporal[temporal.length - 1] = elemento;
            }
        }
        return temporal;
    }

    static int buscar(int t[], int clave) {
        int posicion;
        int i = 0;
        while (i < t.length && t[i] != clave) {
            i++;
        }
        if (i < t.length) {
            posicion = i;
        } else {
            posicion = -1;
        }
        return posicion;
    }
}