package unidad09.Actividad9_01.Modelo;

import java.util.Arrays;

public class Lista implements Cola{
    private Integer[] elemento;

    /**
     * Constructor vacío que inicializa la tabla en 0
     */
    public Lista() {
        elemento = new Integer[0];
    }

    /**
     * Método para insertar un nuevo elemento al principio de la tabla
     * @param nuevo
     */
    public void insertarPrincipio(Integer nuevo){
        //1. Aumentar la tabla
        elemento = Arrays.copyOf(elemento, elemento.length + 1);
        //2. Crear hueco al principio de la tabla
        System.arraycopy(elemento, 0, elemento, 1 , elemento.length - 1);
        //3. Insertar el elemento nuevo
        elemento[0] = nuevo;
    }

    /**
     * Método para insertar un nuevo elemento al final de la tabla
     * @param nuevo
     */
    public void insertarFinal(Integer nuevo){
        elemento = Arrays.copyOf(elemento, elemento.length + 1);
        elemento[elemento.length - 1] = nuevo;
    }

    /**
     * Método para obtener el número de elementos insertados y mostrar la tabla completa
     */
    public void mostrarElementos(){
        System.out.println("Número de elementos -> " + elemento.length);
        System.out.println("Todos los elementos -> " + Arrays.deepToString(elemento));
    }

    /**
     * Insertar un elemento, pero nos indican el índice donde insertarlo
     * @param indice
     * @param nuevo
     */
    public void insertarConIndice(int indice, Integer nuevo){
        try {
            elemento = Arrays.copyOf(elemento, elemento.length + 1);
            System.arraycopy(elemento, indice, elemento, (indice + 1), (elemento.length - indice - 1));
            elemento[indice] = nuevo;
        } catch (Exception ex){
            elemento = Arrays.copyOf(elemento, elemento.length - 1);
            System.out.println("\tEl índice " + indice  + " está fuera de rango. El índice máximo es " + elemento.length);
        }
    }

    /**
     *Insertar tabla dentro de la original.
     * @param nuevaLista
     */
    public void  insertarLista (Lista nuevaLista){
        //1. Longitur de la lista inicial
        int longOriginal = elemento.length;
        //2. Hacer hueco
        elemento = Arrays.copyOf(elemento, elemento.length + nuevaLista.elemento.length);
        //3. Fusionar listas
        System.arraycopy(nuevaLista.elemento, 0, elemento, longOriginal, nuevaLista.elemento.length);
    }

    /**
     * Método para eliminar un índice
     * @param indice
     */
    public void eliminarNum(int indice){
        try{
            Integer numEliminar = elemento[indice]; //el dato tipo Wrapper se declara cmo null
            for (int i = indice + 1; i < elemento.length; i++) {
                elemento [i - 1] = elemento[i];
            }
            elemento = Arrays.copyOf(elemento, elemento.length - 1);
            System.out.println("El número [" + numEliminar + "] será eliminado de la tabla.");
        } catch (Exception ex) {
            System.out.println("\tEl índice " + indice  + " está fuera de rango. El índice mínimo es 0 y el máximo es " + (elemento.length - 1));
        }
    }

    /**
     * Buscar un número que pasan por parámetro
     * @param num
     */
    public void buscarNum(Integer num){
        int indice = -1;
        for (int i = 0; i < elemento.length && indice == -1; i++) {
            //para comparar el Interer no se utilizar ' == ' , se utiliza equals
            if (elemento[i].equals(num)){
                indice = i;
            }
        }
        if (indice != -1){
            System.out.println("El número buscado [" + num + "] está en la posición " + indice);
        } else {
            System.out.println("El número buscado [" + num + "] no ha sido encontrado.");
        }
    }

    @Override
    public void encolar(Integer nuevo) {
        insertarFinal(nuevo);
    }

    @Override
    public void desencolar() {
        eliminarNum(0);
    }
}