package unidad07.Actividad7_11.Controller;

import unidad07.Actividad7_11.Class.Lista;

public class Main {
    public static void main(String[] args) {
        principal();
    }

    public static void principal(){
        System.out.println("\n- Tabla 1 -");
        Lista numeros = new Lista();
        numeros.insertarPrincipio(50);
        numeros.insertarPrincipio(60);
        numeros.insertarFinal(100);
        numeros.insertarFinal(90);
        numeros.mostrarElementos();

        System.out.println("\n- Tabla 2 -");
        Lista listado = new Lista();
        listado.insertarPrincipio(1);
        listado.insertarFinal(2);
        listado.insertarFinal(3);
        listado.insertarFinal(4);
        listado.insertarFinal(5);
        listado.insertarFinal(6);
        listado.insertarFinal(7);
        listado.mostrarElementos();

        System.out.println("\n* Insertar indicando el índice *");
        listado.insertarConIndice( 5,10);
        listado.mostrarElementos();

        System.out.println("\n* Insertar una tabla dentro de otra *");
        numeros.insertarLista(listado);
        numeros.mostrarElementos();

        System.out.println("\n* Eliminar un número a partir del índice *");
        numeros.eliminarNum(2);
        numeros.mostrarElementos();

        System.out.println("\n* Buscar número *");
        numeros.buscarNum(90);
        numeros.buscarNum(100);
    }
}