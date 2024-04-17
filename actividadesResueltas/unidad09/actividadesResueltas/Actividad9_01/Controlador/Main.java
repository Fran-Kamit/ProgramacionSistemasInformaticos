package unidad09.actividadesResueltas.Actividad9_01.Controlador;

import unidad09.actividadesResueltas.Actividad9_01.Modelo.Lista;

public class Main {
    public static void main(String[] args) {
        principal();
    }

    public static void principal(){
        System.out.println("\n- Tabla 1 -");
        Lista numeros = new Lista();
        numeros.insertarPrincipio(50);
        numeros.insertarPrincipio(60);
        numeros.encolar(100);
        numeros.encolar(90);
        numeros.mostrarElementos();

        System.out.println("\n- Tabla 2 -");
        Lista listado = new Lista();
        listado.insertarPrincipio(1);
        listado.encolar(2);
        listado.encolar(3);
        listado.encolar(4);
        listado.encolar(5);
        listado.encolar(6);
        listado.encolar(7);
        listado.mostrarElementos();

        System.out.println("\n* Insertar indicando el índice *");
        listado.insertarConIndice( 5,10);
        listado.mostrarElementos();

        System.out.println("\n* Insertar una tabla dentro de otra *");
        numeros.insertarLista(listado);
        numeros.mostrarElementos();

        System.out.println("\n* Desencolando el primer número... *");
        numeros.desencolar();
        numeros.mostrarElementos();

        System.out.println("\n* Buscar número *");
        numeros.buscarNum(90);
        numeros.buscarNum(100);
    }
}