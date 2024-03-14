package Unidad05;

import java.util.*;

public class actividadAplicacion5_11 {
    public static void main(String[] args) {
        System.out.println("Realiza una función que crea y devulve una tabla con todos los índices " +
                "de los elementos\ndonde se encuentra la clave de búsqueda. En caso de que no se encuentre, " +
                "se devolverá\nuna tabla vacía.\n");

        datos();
    }

    static void datos(){
        int aux[] = {1, 2, 5, 3, 2, 5, 4, 3, 4, 1, 2, 5, 1, 3, 2};
        System.out.println(Arrays.toString(aux));

        System.out.print("Escriba el elemento a buscar (del 1 al 5) -> ");
        int aBuscar = new Scanner(System.in).nextInt();

        int indices[] = buscarTodos(aux, aBuscar);

        System.out.print("\nEl número " + aBuscar + " se encuentra en los índices -> ");
        System.out.println(Arrays.toString(indices));
    }

    static int[] buscarTodos(int t[], int clave) {
        int encontradoEn[] = new int[0];

        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                encontradoEn = Arrays.copyOf(encontradoEn, encontradoEn.length + 1);
                encontradoEn[encontradoEn.length - 1] = i;
            }
        }
        return encontradoEn;
    }
}