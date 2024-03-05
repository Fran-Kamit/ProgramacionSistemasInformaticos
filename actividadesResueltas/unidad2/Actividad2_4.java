package unidad2;
import java.util.*;

public class Actividad2_4 {
    public static void main(String[] args) {
        System.out.println("Implementar un programa que pida por teclado un número decimal e indique si es un número" +
                " casi-cero, que son \naquellos, positivos o negativos, que se acercan a 0 por menos de 1 unidad, " +
                "aunque curiosamente el 0 no se \nconsidera un número casi-cero.\n");
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        double n;
        System.out.print("Introduzca un número positivo o negativo: ");
        n = sc.nextDouble();
        if (-1 < n && n < 1 && n != 0){
            System.out.println("El número " + n + " es un casi-cero.");
        } else {
            System.out.println("El número " + n + " no es un casi-cero");
        }
    }
}