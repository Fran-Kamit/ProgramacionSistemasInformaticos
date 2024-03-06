package unidad01;
import java.util.Scanner;

public class Actividad1_11 {
    public static void main(String[] args) {
        System.out.println("Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. Por este motivo, \nes necesario diseñar una aplicación que solicite las ventas (en kilos) de cada semestre para cada fruta. La \naplicación mostrará el importe total sabiendo que el precio del kilo de manzanas está fijado en 2,35 € y el kilo \nde peras en 1,95 €.\n");
        final double PRECIO_MANZANAS = 2.35;
        final double PRECIO_PERAS = 1.95;
        int vManz1Sem, vManz2Sem, vPeras1Sem, vPeras2Sem;
        double impTotal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Para las manzanas: ");
        System.out.print("Ventas (en kilos) del primer semestre: ");
        vManz1Sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre: ");
        vManz2Sem = sc.nextInt();

        System.out.println("Para las peras: ");
        System.out.print("Ventas (en kilos) del primer semestre: ");
        vPeras1Sem = sc.nextInt();
        System.out.print("Ventas (en kilos) del segundo semestre: ");
        vPeras2Sem = sc.nextInt();

        impTotal = (vManz1Sem + vManz2Sem) * PRECIO_MANZANAS;
        impTotal = (vPeras1Sem + vPeras2Sem) * PRECIO_PERAS;

        System.out.println("El importe total es de: " + impTotal + " €");
    }
}
