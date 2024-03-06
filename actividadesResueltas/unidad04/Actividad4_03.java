package unidad04;
import java.util.Scanner;

public class Actividad4_03 {
    public static void main(String[] args) {
        System.out.println(" Realiza una funciónque calcule y muestre el área o el volumen de un cilindro," +
                "\nsegún se especifique.\n");

        Scanner sc = new Scanner(System.in);
        double radio, altura;
        byte eleccion;

        System.out.print("Introduzca el radio: ");
        radio = sc.nextDouble();

        System.out.print("Introduzca la altura: ");
        altura = sc.nextDouble();

        do {
            System.out.print("¿Qué desea calcular? (1) área, (2) volumen: ");
            eleccion = sc.nextByte();
        }while (eleccion < 1 || eleccion > 2);

        System.out.println("");
        calculoCilindro(radio, altura, eleccion);
    }
    static void calculoCilindro(double radio, double altura, byte eleccion){
        double volumen, area;
        switch (eleccion){
            case 1 -> {
                volumen = Math.PI * Math.pow(radio, 2) * altura;
                System.out.println("El volumen es = " + volumen);
            }
            case 2 -> {
                area = 2 * Math.PI * radio * (altura + radio);
                System.out.println("El área es = " + area);
            }
        }
    }
}