package Unidad03;
import java.util.Scanner;

public class actividadAplicacion3_20 {
    public static void main(String[] args) {
        System.out.println("Sumar distintas cantidades. Para no introducir más datos poner \"0\".");

        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 0;

        while (a != 0) {
            System.out.print("Introducir cantidad a sumar: ");
            a = sc.nextInt();
            b += a;
        }
        System.out.println("Total cantidad sumada = " + b);
    }
}