package Unidad01;
import java.util.Scanner;

public class actividadAplicacion1_16 {
    public static void main(String[] args) {
        System.out.println("Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. La aplicación debe \nmostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.\n");
        int n, s, m, h;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce los segundos: ");
        n = sc.nextInt();

        s = n % 60;
        //System.out.println(s);

        m = n / 60;
        m = m % 60;
        //System.out.println(m);

        h = n / 3600;
        //System.out.println(h);
        System.out.println(n + " en segundos son " + h + " horas, " + m + " minutos, y " + s + " segundos.");
    }
}