package Unidad05;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class actividadAplicacion5_14 {
    public static void main(String[] args) {
        System.out.println(" Crear una aplicación que ayude a realizar encuestas estadísticas para conocer el nivel" +
                "\nadquisitivo de los habitantes de un municipio. Se necesita preguntar el sueldo de cada" +
                "\npersona. No se conoce el número de los encuestados. Para finalizar la entrada de datos," +
                "\nintroduce -1." +
                "\n Una vez terminada la entrada de datos, muestra la siguiente información:" +
                "\n - Todos los sueldos introducidos ordenados de forma decreciente." +
                "\n - El suelvo máximo y mínimo." +
                "\n - La media de los sueldos.\n");

        double sueldo[] = altaSueldo();

        System.out.println(Arrays.toString(sueldo) + "\n");

        mostrarDecreciente(sueldo);

        mostrarMaxMin(sueldo);

        mediaSueldos(sueldo);

    }
    static  double[] altaSueldo(){ //Método para insertar los sueldos
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        double sueldoAux, sueldo[] = new double[0];

        do {
            do{
                System.out.print("Introduzca el sueldo (-1 salir) -> ");
                sueldoAux = sc.nextDouble();
            } while (sueldoAux < -1);

            if (sueldoAux != -1) {
                sueldo = Arrays.copyOf(sueldo, sueldo.length + 1);
                sueldo[sueldo.length - 1] = sueldoAux;
            }
        } while (sueldoAux != -1);

        Arrays.sort(sueldo);//Ordenamos la tabla

        return sueldo;
    }

    static void mostrarDecreciente(double sueldo[]){
        for (int i = sueldo.length - 1; i >= 0 ; i--) {
            System.out.print(sueldo[i] + "€ , ");
        }
        System.out.println("\n");
    }

    static void mostrarMaxMin(double sueldo[]){
        System.out.println("El sueldo mayor es -> " + (sueldo [sueldo.length - 1]) + "€");
        System.out.println("El sueldo menor es -> " + sueldo [0] + "€\n");
    }

    static void mediaSueldos(double sueldo[]){
        double suma = 0, media;
        for (int i = 0; i < sueldo.length; i++) {
            suma += sueldo[i];
        }
        media = suma/sueldo.length;
        System.out.println("La media de los sueldos es -> " + media + "€");
    }
}