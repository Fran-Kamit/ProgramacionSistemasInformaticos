package unidad07.Actividad7_08.Controller;

import unidad07.Actividad7_08.Class.SintonizadorFM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        principal();
    }

     static void principal(){
        byte opcion;
        double frecuencia;
        SintonizadorFM radio;
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEncendiendo la radio FM.......");
        System.out.print("¿Desea poner una frecuencia? 1.Si 2.No -> ");
        do {
            opcion = sc.nextByte();
            if (opcion < 1 || opcion > 2) {
                System.out.print("Opción no válida. Vuelva a introducirla -> ");
            }
        } while (opcion < 1 || opcion > 2);

        if (opcion == 1) {
            System.out.print("Introduzca la frecuencia -> ");
            frecuencia = sc.nextDouble();
            radio = new SintonizadorFM(frecuencia);
            opcion = 0; //reseteamos opcion para el menú
        } else {
            radio = new SintonizadorFM();
            opcion = 0;
        }

        do {
            System.out.println("\n********** Menú **********");
            System.out.println("  1. Subir frecuencia");
            System.out.println("  2. Bajar frecuencia");
            System.out.println("  3. Indicar un favorito");
            System.out.println("  4. Apagar la radio");
            System.out.println("**************************\n");

            System.out.print("Indique la opción -> ");
            do {
                opcion = sc.nextByte();
                if (opcion < 1 || opcion > 4) {
                    System.out.print("Opción no válida. Vuelva a introducirla -> ");
                }
            } while (opcion < 1 || opcion > 4);

            switch (opcion) {
                case 1 -> {
                    radio.up();
                    radio.display();
                }
                case 2 -> {
                    radio.down();
                    radio.display();
                }
                case 3 -> {
                    System.out.print("Indique la frecuencia -> ");
                    frecuencia = sc.nextDouble();
                    radio = new SintonizadorFM(frecuencia);
                }
                case 4 -> System.out.println("Apagando la radio.........");
            }
        } while (opcion != 4);

        sc.close();
    }
}