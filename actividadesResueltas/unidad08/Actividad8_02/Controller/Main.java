package unidad08.Actividad8_02.Controller;

import unidad08.Actividad8_02.Class.Hora;
import unidad08.Actividad8_02.Class.HoraExacta;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean cambio;

        LocalDateTime horaLocal = LocalDateTime.now();
        int hora = horaLocal.getHour();
        int minuto = horaLocal.getMinute();
        int segundo = horaLocal.getSecond();


        Hora r = new HoraExacta(hora, minuto, segundo);
        System.out.println("Hora actual -> " + r);

        for (int i = 1; i < 30; i++) {
            r.incrementar();
        }
        System.out.println("Hora incrementada 30'' -> " + r);

        for (int i = 1; i < 31; i++) {
            r.incrementar();
        }
        System.out.println("Hora incrementada otros 31'' -> " + r);

        /////////
        System.out.print("\nEscriba los segundos -> ");
        segundo = sc.nextInt();

        cambio = ((HoraExacta) r).setSegundos(segundo);

        if (cambio) {
            System.out.println(r);
        } else {
            System.out.println("Los segundos no se pudieron cambiar.");
        }

        sc.close();
    }
}