package unidad07.Actividad7_13.Controller;

import unidad07.Actividad7_13.Class.Pila;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pila p = new Pila();

        for (int i = 0; i < 5; i++) {
            p.apilar(i);
        }
        System.out.println("* Array creado *");
        p.mostrar();

        System.out.println();
        p.desapilar();p.mostrar();
        p.desapilar();p.mostrar();
    }
}