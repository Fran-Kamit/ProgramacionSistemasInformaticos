package unidad08.Actividad8_03.Controller;

import unidad08.Actividad8_03.Class.Hora;
import unidad08.Actividad8_03.Class.HoraExacta;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDateTime horaLocal = LocalDateTime.now();
        int hora = horaLocal.getHour();
        int minuto = horaLocal.getMinute();
        int segundo = horaLocal.getSecond();

        Hora r1 = new HoraExacta(hora, minuto, segundo);
        Hora r2 = new HoraExacta(hora, minuto, segundo);
        Hora r3 = new HoraExacta(5, 30, 40);
        System.out.println("Hora1 -> " + r1);
        System.out.println("Hora2 -> " + r2);
        System.out.println("Hora3 -> " + r3);

        sc.close();
    }
}