package unidad04;
import java.util.Scanner;

public class Actividad4_07 {
    public static void main(String[] args) {
        System.out.println("Escribir una función a la que se le pase un número entero y devuelva el número" +
                "\nde divisores primos que tiene.\n");

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = sc.nextInt();
        }while (num < 1);

        System.out.println("");
        System.out.println(num + " tiene " + numDivisoresPrimos(num) + " divisores primos.");
    }
    static boolean esPrimo(int num){
        boolean esPrimo = true;
        byte i = 2;

        while (i < num && esPrimo == true){
            if (num % i == 0){
                esPrimo = false;
            }
            i++;
        }
        return (esPrimo);
    }
    static int numDivisoresPrimos(int num){
        int contador = 1;
        for(int i = 2; i <= num; i++){
            if (esPrimo(i) && num % i == 0){
                contador++;
            }
        }
        return (contador);
    }
}