package unidad3;
import java.util.Scanner;

public class Actividad3_3 {
    public static void main(String[] args) {
        System.out.println(" Codificar el juego «el número secreto», que consiste en acertar un número entre el 1 y " +
                "100 \n(generado aleatoriamente). Para ello se introduce por teclado una serie de números, para los " +
                "\nque se indica: «mayor» o «menor», según sea mayor o menor con respecto al número secreto. El " +
                "\nproceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).\n");
        Scanner sc = new Scanner(System.in);
        byte numSecreto, num;
        numSecreto = (byte) (Math.random() * 100 + 1);

        do {
            System.out.print("Introduzca un número entre 1 y 100: ");
            num = sc.nextByte();
        } while (num < 1);

        while (numSecreto != num && num != -1) {
            if (numSecreto < num) {
                System.out.println("El número es menor a " + num);
            } else {
                System.out.println("El número es mayor a " + num);
            }
            do {
                System.out.print("\nIntroduzca otro número (1 al 100 ó -1 para rendirse): ");
                num = sc.nextByte();
            } while (num < -1 || num == 0);
        }

        if (numSecreto == num) {
            System.out.println("\nEnhorabuena. ¡Has acertado!");
        } else {
            System.err.println("\nOtra vez será.");
        }
    }
}