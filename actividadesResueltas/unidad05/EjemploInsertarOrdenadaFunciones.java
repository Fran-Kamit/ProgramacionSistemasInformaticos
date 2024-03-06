package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploInsertarOrdenadaFunciones {
    static Scanner sc = new Scanner(System.in);
    static String cesta[] = new String[0];

    public static void main(String[] args) {
        menu();

    }
    static void menu(){
        byte opcion;


        System.out.println("\n--- CESTA DE LA COMPRA ---");
        System.out.println("1- Insertar, 2- Mostrar cesta, 3- Eliminar producto 4- Imprimir y salir.");

        do {
            System.out.print("Indique la opción: ");
            opcion = sc.nextByte();
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1 -> {
                cesta = insertar(cesta);
                menu();
            }
            case 2 -> {
                System.out.println(Arrays.toString(cesta));
                menu();
            }
            case 3 ->{
                cesta = eliminar(cesta);
                menu();
            }
            case 4 -> System.out.println(Arrays.toString(cesta));
        }
    }
    static String[] insertar(String cesta[]){
        boolean existe;
        String productoNuevo;

        System.out.print("\nIntroduzca el producto -> ");
        productoNuevo = sc.next();
        existe = buscarProducto(cesta, productoNuevo);

        if (existe){
            System.out.println("El producto que indicas ya existe. ");
        } else {
            cesta = Arrays.copyOf(cesta, cesta.length+1);
            cesta[cesta.length-1]=productoNuevo;
        }

        return cesta;
    }
    static boolean buscarProducto (String cesta[], String productoNuevo){
        boolean existe = false;
        int indice = 0;
        while (indice < cesta.length && !cesta[indice].equals(productoNuevo)){
            indice++;
        }
        if (indice < cesta.length){
            existe = true;
        }
        return existe;
    }
    static String[] eliminar(String cesta[]){
        String productoEliminar;
        int indice = 0;

        System.out.print("Indica el nombre del producto a eliminar: ");
        productoEliminar = sc.next();sc.nextLine();

        for (int i = 0; i < cesta.length; i++){
            if (cesta[i].equals(productoEliminar)){
                indice = i;
            }
        }

        boolean existe = buscarProducto(cesta, productoEliminar);
        if (!existe){
            System.out.println("El producto no existe en la lista.");
        } else {
            cesta[indice] = cesta[cesta.length - 1];
            cesta = Arrays.copyOf(cesta, cesta.length - 1);
        }
        return cesta;
    }
}