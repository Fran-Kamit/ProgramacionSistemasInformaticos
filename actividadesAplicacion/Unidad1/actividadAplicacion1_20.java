package Unidad1;
import java.util.*;

public class actividadAplicacion1_20 {
    public static void main(String[] args) {
        System.out.println("Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa utilizando el nombre \ncualificado de las clases, en lugar de utilizar ninguna importación.\n");
        double n, raiz;

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        System.out.print("Introduce un número real: ");
        n = sc.nextDouble();

        if (n >= 0){
            raiz = Math.sqrt(n);
            System.out.println("La raíz cuadrada de " + n + " es " + raiz);
        }else{
            System.out.println("La raíz cuadrada de " + n + " no existe.");
        }
    }
}