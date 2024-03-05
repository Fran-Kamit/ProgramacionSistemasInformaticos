package unidad4;
import java.util.Scanner;

public class Actividad4_6 {
    public static void main(String[] args) {
        System.out.println(" Diseñar una función con el siguiente prototipo:" +
                "\nboolean esPrimo(int n)\n" +
                "que devolverá true si n es primo y false en caso contrario.\n");

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduzca un número entero positivo: ");
            num = sc.nextInt();
        }while (num < 1);

        System.out.println("¿El número " + num + " es primo? " + esPrimo(num));
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
}