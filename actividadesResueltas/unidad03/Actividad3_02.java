package unidad03;
import java.util.Scanner;

public class Actividad3_02 {
    public static void main(String[] args) {
        System.out.println(" Implemente una aplicación para calcular datos estadísticos de las edades de los alumnos " +
                "de \nun centro educativo. Se introducirán datos hasta que uno de ellos sea negativo y se mostrará: " +
                "\nla suma de todas las edades introducidas, la media, el número de alumnos y cuántos son mayores " +
                "\nde edad.\n");
        Scanner sc = new Scanner(System.in);
        int edad, sumaEdades = 0, contadorAlumn = 0, contadorMayorEdad = 0;
        double media, mediaRedondeo;

        System.out.print("Introduzca edad: ");
        edad = sc.nextInt();

        while (edad >= 0) {
            sumaEdades += edad;
            contadorAlumn++;

            if (edad >= 18) {
                contadorMayorEdad++;
            }

            System.out.print("Introduzca edad: ");
            edad = sc.nextInt();
        }

        media = (double) sumaEdades / contadorAlumn;
        mediaRedondeo = Math.round(media * 1000.0) / 1000.0;

        System.out.println("\nLa suma de todas las edades es = " + sumaEdades);
        System.out.println("Media = " + mediaRedondeo);
        System.out.println("Total de alumnos = " + contadorAlumn);
        System.out.println("Mayores de edad = " + contadorMayorEdad);
    }
}