package Unidad1;
import java.util.Scanner;

public class actividadAplicacion1_13 {
    public static void main(String[] args) {
        System.out.println("Modifica la Actividad de Aplicación 1.12 para que, indicando dos números n y m, diga qué cantidad hay que \nsumarle a n para que sea múltiplo de m.\n");
        int n, m, calculo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número entero: ");
        n = sc.nextInt();

        System.out.print("Introduzca el segundo número entero: ");
        m = sc.nextInt();

        calculo = n % m;
        if (calculo == 0) {
            System.out.println("El número ya es múltiplo de " + m);
        }else{
            calculo = m - calculo;
            System.out.println("Hay que sumar " + calculo + " a " + n + " para que sea múltiplo de " + m);
        }
    }
}