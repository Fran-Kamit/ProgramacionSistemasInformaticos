package unidad1;
import java.util.Scanner;

public class Actividad1_3 {
    public static void main(String[] args) {
        System.out.println("pedir al usuario su edad u mostrar la que tendrá el próximo año.\n");
        Scanner sc = new Scanner(System.in);
        short edad;
        System.out.print("Escriba su edad: ");
        edad= sc.nextShort();
        edad++;
        System.out.println("El próximo año su edad será : " + edad + " años.");


    }
}
