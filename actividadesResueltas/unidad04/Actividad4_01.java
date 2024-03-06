package unidad04;
import java.util.Scanner;

public class Actividad4_01 {
    public static void main(String[] args) {
        System.out.println(" Diseñar la función \"Eco()\" a la que se le pasa como parámetro un número \"n\" y muestra" +
                "\npor pantalla \"n\" veces el mensaje «Eco...»\n");

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduzca un número: ");
            n = sc.nextInt();
        }while (n < 0);

        System.out.println("\n---Antes de llamar a la función---");
        eco(n);
        System.out.println("---Después de llamar a la función---");
    }
    static void eco(int n){
        for (byte i = 0; i < n; i++){
            System.out.println("Eco...");
        }
    }
}