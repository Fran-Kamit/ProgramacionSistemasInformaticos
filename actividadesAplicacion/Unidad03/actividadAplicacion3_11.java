package Unidad03;
import  java.util.Scanner;
public class actividadAplicacion3_11 {
    public static void main(String[] args) {
        System.out.println("Conversión de decimal en binario.");

        Scanner sc = new Scanner(System.in);

        int n1, n2;
        String binario = "";

        do {
            System.out.print("Introduzca un número mayor de 0: ");
            n1 = sc.nextInt();
        } while (n1 < 0);
            n2 = n1;

        while (n2 > 0) {
            if (n2 % 2 == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            n2 /= 2;
        }
        System.out.println("La conversión de " + n1 + " a binario es = " + binario);
    }
}