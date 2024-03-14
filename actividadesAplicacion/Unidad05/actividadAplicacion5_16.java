package Unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class actividadAplicacion5_16 {
    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        int origen, destino;
        boolean mapa[][] = {
                {true,  true,  false, false, false},
                {false, true,  true,  false, false},
                {false, true,  true,  true,  false},
                {true,  false, false, true,  false},
                {true,  false, false, false, true}
        };

        do {
            System.out.print("Lugar de origen (0 al 4) -> ");
            origen = new Scanner(System.in).nextInt();
        } while (origen < 0 || origen > 4);

        do {
            System.out.print("Lugar de destino (0 al 4) -> ");
            destino = new Scanner(System.in).nextInt();
        }while (destino < 0 || destino > 4);

        int lugares[] = new int[1];
        lugares[0] = origen;

        int copia[];

        do {
            copia = Arrays.copyOf(lugares, lugares.length);

            System.out.println(Arrays.toString(lugares));
            for (int lugar : copia) {
                for (int i = 0; i < mapa.length; i++) {
                    if (mapa[lugar][i]) { //podemos llegar de lugar a i
                        if (busca(lugares, i) == -1) {
                            lugares = Arrays.copyOf(lugares, lugares.length + 1);
                            lugares[lugares.length - 1] = i;
                        }
                    }
                }
            }
        } while (!Arrays.equals(lugares, copia));

        if (busca(lugares, destino) != -1) {
            System.out.println("Es posible ir de " + origen + " a " + destino);
        } else {
            System.out.println(destino + " es inaccesible desde " + origen);
        }
    }

    static int busca(int t[], int clave) {
        int posicion = -1;
        int i = 0;
        while (i < t.length && t[i] != clave) {
            i++;
        }

        if (i < t.length) {
            posicion = i;
        }

        return posicion;
    }
}