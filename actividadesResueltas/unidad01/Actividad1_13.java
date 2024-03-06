package unidad01;
import java.util.Scanner;

public class Actividad1_13 {
    public static void main(String[] args) {
        System.out.println("Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas enteras que se \nsolicitarán al usuario). El programa debe mostrar la nota media del curso como se utiliza en el boletín de \ncalificaciones (solo la parte entera) y como se usa en el expediente académico (con decimales).\n");
        int nota1, nota2, nota3;
        int mediaBoletin;
        double mediaExpediente;

        Scanner sc = new Scanner(System.in);
        System.out.print("Nota primer trimestre: ");
        nota1 = sc.nextInt();
        System.out.print("Nota segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.print("Nota tercer trimestre: ");
        nota3 = sc.nextInt();

        mediaExpediente = (nota1 + nota2 + nota3) / 3.0;

        mediaBoletin = (int) mediaExpediente;

        System.out.println("Boletín de calificaciones: " + mediaBoletin);
        System.out.println("Expediente académico: " + mediaExpediente);
    }
}
