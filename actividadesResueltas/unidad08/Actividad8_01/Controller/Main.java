package unidad08.Actividad8_01.Controller;

import unidad08.Actividad8_01.Class.Hora;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cambio;

        LocalDateTime horaLocal = LocalDateTime.now();
        int hora = horaLocal.getHour();
        int minuto = horaLocal.getMinute();


        Hora r = new Hora(hora, minuto);
        System.out.println("Hora actual -> " + r);

        for (int i = 1; i < 30; i++) {
            r.incrementar();
        }
        System.out.println("Hora incrementada 30' -> " + r);

        for (int i = 1; i < 31; i++) {
            r.incrementar();
        }
        System.out.println("Hora incrementada otros 31' -> " + r);

        /////////
        System.out.print("\nEscriba una hora -> ");
        hora = sc.nextInt();

        cambio = r.setHora(hora);

        if (cambio) {
            System.out.println(r);
        } else {
            System.out.println("La hora no se pudo cambiar.");
        }

        sc.close();
    }
}