package Unidad01;
import java.util.Scanner;

public class actividadAplicacion1_12 {
    public static void main(String[] args) {
        System.out.println("Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el \nresultado sea múltiplo de 7.\n");
        int n, calculo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número entero: ");
        n = sc.nextInt();

        calculo = n % 7;
        if (calculo == 0) {
            System.out.println("\nEl número ya es múltiplo de 7");
        }else{
            calculo = 7 - calculo;
            System.out.println("\nHay que sumar " + calculo + " a " + n + " para que sea múltiplo de 7");
        }
    }
}