package unidad5;

import java.util.Arrays;

public class Ejemplo01 {
    public static void main(String[] args) {
        /*La declaración de una tabla debe contener 3 elementos.
        El tipo de dato.
        El nombre de la variable.
        La longitud.
        */

        int edad [] = new int [5];
        edad[0] = 23;
        edad[1] = 52;
        edad[2] = 18;
        edad[3] = 32;
        edad[4] = 45;

        System.out.println(Arrays.toString(edad));
    }
}