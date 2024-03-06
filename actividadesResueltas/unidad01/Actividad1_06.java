package unidad01;
import java.util.Scanner;

public class Actividad1_06 {
    public static void main(String[] args) {
        System.out.println("Crear una aplicación que calcule la media aritmética de dos notas enteras. Hay que tener en cuenta \nque la media puede contener decimales.\n");
        Scanner sc = new Scanner(System.in);
        int nota1, nota2;
        double media;
        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sc.nextInt();
        media = (nota1 + nota2) / 2.0;
        System.out.println("La media es: " + media);
    }
}