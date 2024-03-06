package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, datos[], numero;

        System.out.print("Escriba n: ");
        n = sc.nextInt();
        datos = new int[n]; //crear tabla de longitud n

        for (int i = 0; i < datos.length; i++){ //asignamos valores a la tabla
            System.out.print("Introduzca un número: ");
            datos[i] = sc.nextInt();
        }

        System.out.println("Valores de la tabla: " + Arrays.toString(datos));

        System.out.println("\nIntroduzca a partir de que nº desea eliminar: ");
        numero = sc.nextInt();

        int sinMayores[] = sinMayores(datos, numero);
        System.out.println("Valores de la tabla sin nº mayores a " + numero + " -> " + Arrays.toString(sinMayores));

    }
    static int [] sinMayores(int t[], int valor){
        int copia[] = Arrays.copyOf(t, t.length);
        int i = 0;
        while (i < copia.length){
            if (copia[i] > valor){
                copia[i] = copia[copia.length - 1];
                copia = Arrays.copyOf(copia, copia.length - 1);
            } else {
                i++;
            }
        }
        return copia;
    }
}