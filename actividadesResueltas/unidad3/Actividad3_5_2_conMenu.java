package unidad3;
import java.util.Scanner;
import javax.swing.*;

public class Actividad3_5_2_conMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rand1, rand2, result = 0, n = 0, contador = 0;
        byte opcion;
        boolean resultCorrecto = true;
        char operMat = ' ';
        String menu = null, mensaje;

        System.out.println("Juego del cálculo.\n");

        do {
            do {
                menu = "";
                menu += "***** Menú *****\n";
                menu += "1. Sumar\n";
                menu += "2. Restar\n";
                menu += "3. Multiplicar\n";
                menu += "4. Salir\n";

                opcion = (byte) Integer.parseInt(JOptionPane.showInputDialog(menu));
            } while (opcion < 1 || opcion > 4);

            rand1 = (int)(Math.random() * 100 + 1);
            rand2 = (int)(Math.random() * 100 + 1);

            switch (opcion) {
                case 1 -> {
                    operMat = '+';
                    result = rand1 + rand2;
                }
                case 2 -> {
                    operMat = '-';
                    result = rand1 - rand2;
                }
                case 3 -> {
                    operMat = 'x';
                    result = rand1 * rand2;
                }
            }

            if (opcion != 4) {
                n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el resultado:\n" + rand1 + " " + operMat + " " + rand2));
            }

            if (result == n && opcion != 4){
                contador++;
            } else {
                resultCorrecto = false;
            }
        } while (resultCorrecto);

        mensaje="El total de aciertos ha sido de " + contador;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}