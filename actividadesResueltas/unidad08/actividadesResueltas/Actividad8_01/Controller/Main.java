package unidad08.actividadesResueltas.Actividad8_01.Controller;

import unidad08.actividadesResueltas.Actividad8_01.Class.Hora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cambioHora;
        boolean cambio;
        Scanner sc = new Scanner(System.in);

        Hora r = new Hora(9, 8);
        System.out.println(r);
        for (int i = 1; i < 30; i++) {
            r.incrementar();
        }
        System.out.println(r);

        for (int i = 1; i < 31; i++) {
            r.incrementar();
        }
        System.out.println(r);

        do{
            System.out.print("Escriba una hora: ");
            cambioHora = sc.nextInt();
        } while (cambioHora < 0 || cambioHora > 23);

        cambio = r.setHora(cambioHora);

        if (cambio) {
            System.out.println(r);
        } else {
            System.out.println("La hora no se pudo cambiar.");
        }

        sc.close();
    }
}