package unidad3;
import java.util.Scanner;
public class Actividad3_10 {
    public static void main(String[] args) {
        System.out.println("Diseñar un programa que muestre la suma de los 10 primeros números impares.\n");
        int impar, suma = 0;

        for(int i = 1; i <= 10 ; i++) {
            impar = 2 * i -1;
            suma += impar;
        }
        System.out.println("La suma es = " + suma);
    }
}