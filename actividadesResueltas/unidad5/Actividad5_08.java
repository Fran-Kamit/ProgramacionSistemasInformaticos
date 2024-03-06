package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad5_08 {
    public static void main(String[] args) {
        System.out.println("Leer y almacenar n números enteros en una tabla," +
                " a partir de la que se \nconstruirán otras dos tablas con los" +
                " elementos con valores pares e impares\nde la primera, respectivamente." +
                " Las tablas pares e impares deben mostrarse ordenadas.\n");

        Scanner sc = new Scanner(System.in);
        int n, datos[], par[] = new int [0], impar[] = new int[0];

        System.out.print("Escriba n: ");
        n = sc.nextInt();
        datos = new int[n]; //crear tabla de longitud n

        for (int i = 0; i < datos.length; i++){ //asignamos valores a la tabla
            System.out.print("Introduzca un número: ");
            datos[i] = sc.nextInt();
        }

        //clasificación
        for (int numero : datos){
            if (numero % 2 == 0){
                par = Arrays.copyOf(par, par.length + 1);
                par[par.length - 1] = numero;
            } else {
                impar = Arrays.copyOf(impar, impar.length + 1);
                impar[impar.length - 1] = numero;
            }
        }
        System.out.println("\nPares: " + Arrays.toString(par));
        System.out.println("Impares: " + Arrays.toString(impar));
    }
}