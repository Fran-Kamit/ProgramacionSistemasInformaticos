package conversorT1_4;
import java.util.*;

public class Calculadora {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        byte opcion;

        System.out.println(" _____________________ ");
        System.out.println("| Calculadora en Java |");
        System.out.println("|                     |");
        System.out.println("|  1. Sumar           |");
        System.out.println("|  2. Restar          |");
        System.out.println("|  3. Multiplicar     |");
        System.out.println("|  4. Dividir         |");
        System.out.println("|  5. Raíz cuadrada   |");
        System.out.println("|  6. Exponencial     |");
        System.out.println("|  7. Salir           |");
        System.out.println("|_____________________|\n");

        do {
            System.out.print("Indique opción -> ");
            opcion = sc.nextByte();
            System.out.println();
        }while (opcion < 1 || opcion > 7);

        calculo(opcion);
    }

    static void  calculo(byte opcion){
        double num1 = 0, num2 = 0, base = 0, expo = 0, resultado = 0;

        if (opcion >= 1 && opcion <= 4) {
            System.out.print("Ingrese el valor del número 1 -> ");
            num1 = sc.nextDouble();

            System.out.print("Ingrese el valor del número 2 -> ");
            num2 = sc.nextDouble();
        }

        if (opcion != 7) {
            switch (opcion) {
                case 1 -> resultado = num1 + num2;
                case 2 -> resultado = num1 - num2;
                case 3 -> resultado = num1 * num2;
                case 4 -> resultado = num1 / num2;
                case 5 -> {
                    System.out.print("Ingrese el valor del número 1 para calcular su raíz cuadrada -> ");
                    base = sc.nextDouble();
                    resultado = Math.sqrt(base);
                }
                case 6 -> {
                    System.out.print("Ingrese la base -> ");
                    base = sc.nextDouble();

                    System.out.print("Ingrese el exponente -> ");
                    expo = sc.nextDouble();

                    resultado = Math.pow(base, expo);
                }
            }

            System.out.println("\nEl resultado es " + resultado + "\n");
            menu();
        } else {
            System.out.println(" Cerrando la aplicación.......");
        }
    }
}