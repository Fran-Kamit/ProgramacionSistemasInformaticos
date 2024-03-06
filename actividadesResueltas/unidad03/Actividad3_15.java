package unidad03;
import java.util.Scanner;
public class Actividad3_15 {
    public static void main(String[] args) {
        System.out.println(" Pedir por consola un número y dibujar un triángulo rectángulo de n elementos de lado" +
                "\nutilizando *.\n");

        Scanner sc = new Scanner(System.in);
        int n;


        System.out.print("Escriba cuántos elementos desea de lado: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}