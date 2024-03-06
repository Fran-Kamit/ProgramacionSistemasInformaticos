package unidad5;

public class Ejemplo03 {
    public static void main(String[] args) {
        /*Busqueda no ordenada con números*/
        int numeros [] = {5, 3, 7, 977, 3, 6, 8, 1, 4, 90, 44};
        System.out.println("Longitud de la tabla -> " + numeros.length);

        int indice1 = 0;
        int numeroBuscado = 977;

        while (indice1 < numeros.length && numeros[indice1] != numeroBuscado){
            indice1++;
        }

        if (indice1 < numeros.length){
            System.out.println("La posición del número buscado es -> " + indice1);
        } else {
            System.out.println("El número no se encuentra en la tabla.");
        }
        System.out.println();

        /*Busqueda no ordenada con String*/

        String nombres [] = {"Pepe", "María", "Juan", "Quique", "Alba"};
        System.out.println("Longitud de la tabla -> " + nombres.length);

        int indice2 = 0;
        String nombreBuscado = "María";

        while (indice2 < nombres.length && !nombres[indice2].equals(nombreBuscado)){
            indice2++;
        }

        if (indice2 < nombres.length){
            System.out.println("La posición del nombre buscado es -> " + indice2);
        } else {
            System.out.println("El nombre no se encuentra en la tabla.");
        }
    }
}