package unidad07.Actividad7_06.Controller;

import unidad07.Actividad7_06.Class.Hora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        principal();
    }

    static void principal() {
        Scanner sc = new Scanner(System.in);
        byte valor;
        int numSegundos;

        Hora h = new Hora(); //Creamos un objeto Hora
        System.out.print("Introduzca la hora (0 a 23) -> ");
        do {
            valor = sc.nextByte();
            if (valor < 0 || valor > 23) {
                System.out.print("La hora está fuera del rango. Introdúzcala de nuevo. -> ");
            }
        } while (valor < 0 || valor > 23);

        h.setHora(valor); //Asignamos valor a hora

        System.out.print("Introduzca los minutos (0 a 59) -> ");
        do {
            valor = sc.nextByte();
            if (valor < 0 || valor > 59) {
                System.out.print("Los minutos están fuera del rango. Introdúzcalos de nuevo. -> ");
            }
        } while (valor < 0 || valor > 59);

        h.setMinuto(valor); //Asignamos valor a minutos

        System.out.print("Introduzca los segundos (0 a 59) -> ");
        do {
            valor = sc.nextByte();
            if (valor < 0 || valor > 59) {
                System.out.print("Los segundos están fuera del rango. Introdúzcalos de nuevo. -> ");
            }
        } while (valor < 0 || valor > 59);

        h.setSegundo(valor); //Asignamos valor a segundos

        System.out.print("¿Cuántos segundos quiere mostrar? (>= 0) ");
        do {
            numSegundos = sc.nextInt();
            if (numSegundos < 0) {
                System.out.print("El número tiene que ser mayor o igual a 0. Introduzcalo de nuevo. ->");
            }
        } while (numSegundos < 0);

        for (int i = 0; i <= numSegundos; i++) {
            if (i == 0){
                System.out.println("\nHora introducida -> " + h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
                h.incrementaSegundo();
            } else {
                System.out.println("Incremento " + i + " -> " + h.getHora() + ":" + h.getMinuto() + ":" + h.getSegundo());
                h.incrementaSegundo();
            }
        }
    }
}