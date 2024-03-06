package unidad5;

import java.util.Arrays;

public class ActividadPropuesta5_01 {
    public static void main(String[] args) {
        System.out.println(" Crea tres tablas de cinco elementos: \n" +
                "1- Tipo entero.\n" +
                "2- Tipo double.\n" +
                "3- Tipo booleano.\n" +
                "Muestra las referencias de cada tabla.\n");

        int tablaEnteros [] = {1, 2, 3, 4, 5};
        double tablaDobles [] = {1.01, 2.02, 3.03, 4.04, 5.05};
        boolean tablaBooleanos [] = {true, false, false, true, false};

        System.out.println(" Referencia en memoria y valores de tabla Enteros");
        System.out.println(tablaEnteros);
        System.out.println(Arrays.toString(tablaEnteros));

        System.out.println("\n Referencia en memoria y valores de tabla Dobles");
        System.out.println(tablaDobles);
        System.out.println(Arrays.toString(tablaDobles));

        System.out.println("\n Referencia en memoria y valores de tabla Booleanos");
        System.out.println(tablaBooleanos);
        System.out.println(Arrays.toString(tablaBooleanos));
    }
}