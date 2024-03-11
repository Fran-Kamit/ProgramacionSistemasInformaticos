package Unidad04;
import java.util.*;

public class actividadAplicacion4_11 {
    public static void main(String[] args) {
        System.out.println(" Diseña una función que calcule y muestre la superficie y el volumen de una esfera.\n");

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        double radio;
        byte elec;

        do {
            System.out.print("¿Qué desea realizar? 1/ Superficie, 2/ Volumen -> ");
            elec = sc.nextByte();
        } while (elec < 1 || elec > 2);

        System.out.print("Introduzca el radio -> ");
        radio = sc.nextDouble();

        calculo(elec, radio);
    }
    static void calculo(byte elec, double radio){
        double solucion;
        switch (elec){
            case 1 -> {
                solucion = 4 * Math.PI * Math.pow(radio, 2);
                System.out.println("\nLa superficie con radio " + radio + " = " + solucion);
            }
            case 2 -> {
                solucion = (4 * Math.PI) / 3 * Math.pow(radio, 3);
                System.out.println("\nEl volumen con radio " + radio + " = " + solucion);
            }
        }
    }
}