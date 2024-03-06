package unidad04;
import java.util.Scanner;

public class Actividad4_09 {
    public static void main(String[] args) {
        System.out.println(" Dando tres números, mostrar el mayor.\n");

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, numMax;

        System.out.print("Introduzca el primer número: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca el segundo número: ");
        num2 = sc.nextInt();

        System.out.print("Introduzca el tercer número: ");
        num3 = sc.nextInt();

        numMax = max(num1, num2, num3);
        System.out.println("El mayor número de " + num1 + ", " + num2 + " y " + num3 + " es " + numMax);
    }
    static int max(int num1, int num2, int num3){
        int aux;
        aux = Math.max(num1, num2);
        aux = Math.max(aux, num3);
        return (aux);
    }
}