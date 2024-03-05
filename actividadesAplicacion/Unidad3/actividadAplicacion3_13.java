package Unidad3;
import java.util.Scanner;
public class actividadAplicacion3_13 {
    public static void main(String[] args) {
        System.out.println("Programa para incrementar, en segundos, la hora de un reloj.\n");

        Scanner sc = new Scanner(System.in);
        int h, m, s, increS;

        do {
            System.out.print("Introduce las horas: ");
            h = sc.nextInt();
        }while (h < 0 || h > 23);

        do {
            System.out.print("Introduce los minutos: ");
            m = sc.nextInt();
        } while (m < 0 || m > 59);

        do {
            System.out.print("Introduce los segundos: ");
            s = sc.nextInt();
        } while (s < 0 || s > 59);

        do {
            System.out.print("Introduce los segundos a incrementar: ");
            increS = sc.nextInt();
        } while (increS < 0);

        for (int i = 1; i <= increS; i++) {
            s++;
            if (s == 60) {
                s = 0;
                m++;
                if (m == 60) {
                    m = 0;
                    h++;
                    if (h == 24) {
                        h = 0;
                    }
                }
            }
        }
        if (h < 10 && m < 10 && s < 10){
            System.out.println("La hora con el incremento es = 0" + h + ":0" + m + ":0" + s);
        } else if (h < 10 && m > 9 && s > 9){
            System.out.println("La hora con el incremento es = 0" + h + ":" + m + ":" + s);
        } else if (h > 9 && m < 10 && s > 9) {
            System.out.println("La hora con el incremento es = " + h + ":0" + m + ":" + s);
        } else if (h > 9 && m > 9 && s < 10) {
            System.out.println("La hora con el incremento es = " + h + ":" + m + ":0" + s);
        } else if (h < 10 && m < 10 && s > 9) {
            System.out.println("La hora con el incremento es = 0" + h + ":0" + m + ":" + s);
        } else if (h > 9 && m < 10 && s < 10){
            System.out.println("La hora con el incremento es = " + h + ":0" + m + ":0" + s);
        } else if (h < 10 && m > 9 && s < 10){
            System.out.println("La hora con el incremento es = 0" + h + ":" + m + ":0" + s);
        } else {
            System.out.println("La hora con el incremento es = " + h + ":" + m + ":" + s);
        }
    }
}