package unidad5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo02 {
    public static void main(String[] args) {
        /*
        * Solicitar con Scanner las edades
        * Solicitar 1º cuantas edades se van a insertar
        * */
        Scanner sc = new Scanner(System.in);
        int longitud;

        System.out.print("Indique el número de edades a insertar: ");
        longitud = sc.nextInt();

        int edad [] = new int [longitud];

        for (int i = 0; i < longitud; i++){
            System.out.print("Indique la edad nº " + (i + 1) + ": ");
            edad[i] = sc.nextInt();
        }
        System.out.println();
        //System.out.println(Arrays.toString(edad));

        for (int ed:edad){//se declara una variable llamada elemento y que recorra el array
            System.out.println("Edad insertada -> " + ed);
        }

        System.out.println();

        for (int i = 0; i < edad.length; i++){
            System.out.println("La edad nº " + (i+1) + " es -> " + edad[i]);
        }

        /*
        * Métodos de la API de Java sobre arrays
        * Conocer la longitud de un array
        * */
        System.out.println("\nLongitud del array Edad -> " + edad.length);

        /*
        * Referencias de memoria en los arrays, variables...
        * */
        System.out.println("\n****************************");
        System.out.println(edad + "\n");

        //Iniciar con un valor predeterminado
        String[] id = new String[5];
        Arrays.fill(id,"nombre");
        System.out.println(Arrays.toString(id) + "\n");

        double puntuacion [] = new double[10];
        Arrays.fill(puntuacion, 0);
        System.out.println(Arrays.toString(puntuacion));
        Arrays.fill(puntuacion, 0, 5, 55.6);
        System.out.println(Arrays.toString(puntuacion));
    }
}