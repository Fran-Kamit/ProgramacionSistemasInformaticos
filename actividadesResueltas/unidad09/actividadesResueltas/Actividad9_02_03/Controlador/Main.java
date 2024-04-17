package unidad09.actividadesResueltas.Actividad9_02_03.Controlador;

import unidad09.actividadesResueltas.Actividad9_02_03.Modelo.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);
        Integer n;

        /*Lista para encolar números*/
        Lista c1 = new Lista();
        System.out.print("Introduzca un número para añadir a la cola (-1 salir) -> ");
        n = sc.nextInt();

        while (n >= 0){
            c1.encolar(n);
            System.out.print("Introduzca un número -> ");
            n = sc.nextInt();
        }

        System.out.println("\nDesencolando números....");
        c1.desencolar();
        while (c1.isExisteTabla()){
            c1.desencolar();
        }
        System.out.println();


        /*Lista para apilar números*/
        Lista c2 = new Lista();
        System.out.print("Introduzca un número para añadir a la pila (-1 salir) -> ");
        n = sc.nextInt();

        while (n >= 0){
            c2.apilar(n);
            System.out.print("Introduzca un número -> ");
            n = sc.nextInt();
        }

        System.out.println("\nDesapilando números....");
        c2.desapilar();
        while (c2.isExisteTabla()){
            c2.desapilar();
        }
        System.out.println();
        sc.close();
    }
}