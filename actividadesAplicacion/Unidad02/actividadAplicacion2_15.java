package Unidad02;
import java.util.*;

public class actividadAplicacion2_15 {
    public static void main(String[] args) {
        System.out.println("Cálculo del área de un triángulo.\n");
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        double base, altura, area;

        do {
            System.out.print("Introduce la base (mayor de 0): ");
            base = sc.nextDouble();
        } while (base < 0);

        do {
            System.out.print("Introduce la altura (mayor de 0): ");
            altura = sc.nextDouble();
        }while (altura < 0);

        area = (base * altura) / 2;
        System.out.println("El área del triángulo es " + area);
    }
}