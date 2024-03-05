package unidad5;

import java.util.Arrays;

public class Actividad5_1 {
    public static void main(String[] args) {
        System.out.println(" Cear una tabla de longitud 10 que se inicializará con números aleatorios" +
                "\nentre el 1 y 100. Mostrar la suma de todos los números guardados.\n");

        int valores [] = new int[10]; //declaramos el array
        int suma = 0;

        for (int i = 0; i < valores.length; i++){ //Bucle para añadir valores aleatorios al array
            valores[i] = (int) (Math.random() * 100 + 1);
            suma += valores[i]; //suma de valores
        }
        //System.out.println(Arrays.toString(valores));
        //System.out.println("\nLa suma de todos los valores es " + suma);

        /*Ejemplo con foreach*/
        for (int total:valores){
            System.out.print(total + " + ");
        }
        System.out.println(" = " + suma);
    }
}