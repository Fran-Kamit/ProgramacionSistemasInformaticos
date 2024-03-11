package Unidad04;
import java.util.Scanner;

public class actividadAplicacion4_17 {

    public static void main(String[] args) {
        System.out.println("Escribe una función que decida si dos números enteros " +
                "positivos \nson amigos. Dos números a y b son amigos si la suma de " +
                "los \ndivisores propios (distintos de él mismo) de a es igual a b. " +
                "Y viceversa.\n");

        Scanner sc = new Scanner(System.in);
        int num1, num2;

        do {
            System.out.print("Introduce el primer número: ");
            num1 = sc.nextInt();
        }while (num1 < 1);

        do {
            System.out.print("Introduce el segundo número: ");
            num2 = sc.nextInt();
        }while (num2 < 1);

        System.out.print("Los números " + num1 + " y " + num2);
        if(sonAmigos(num1, num2)){
            System.out.println(" son amigos.");
        } else {
            System.out.println(" no son amigos.");
        }
    }

    static boolean sonAmigos(int num1, int num2){
        boolean amigos = false;
        if(num1 == sumaDivisores(num2)){
            amigos = num2 == sumaDivisores(num1) ? true:false;
        }
        return amigos;
    }

    static int sumaDivisores(int numero){
        int sumaDivisores = 0;
        for(int i = 1; i < numero; i++){
            if(numero % i == 0){
                sumaDivisores += i;
            }
        }
        return sumaDivisores;
    }
}