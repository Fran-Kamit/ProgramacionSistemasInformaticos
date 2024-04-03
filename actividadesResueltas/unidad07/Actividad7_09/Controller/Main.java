package unidad07.Actividad7_09.Controller;

import unidad07.Actividad7_09.Class.Bombilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        principal();
    }

    static void principal(){
        Scanner sc = new Scanner(System.in);

        Bombilla salon = new Bombilla();
        Bombilla cocina = new Bombilla();
        Bombilla banio = new Bombilla();
        Bombilla hab1 = new Bombilla();

        byte opcion;

        do {
            System.out.println("\n***** Menú de interruptores de la vivienda *****");
            System.out.println("  1. Salon -> " + salon.mostrarEstado());
            System.out.println("  2. Cocina -> " + cocina.mostrarEstado());
            System.out.println("  3. Baño -> " + banio.mostrarEstado());
            System.out.println("  4. Habitación -> " + hab1.mostrarEstado());
            System.out.println("  5. Interruptor general -> " + Bombilla.isInterruptorGeneral());
            System.out.println("  6. Salir");
            System.out.println("************************************************\n");

            System.out.print("Indique la opción -> ");
            do {
                opcion = sc.nextByte();
                if (opcion < 1 || opcion > 6){
                    System.out.print("Opción no válida. Vuelva a introducirla -> ");
                }
            } while (opcion < 1 || opcion > 6);

            switch (opcion){
                case 1 -> salon.encenderOApagar();
                case 2 -> cocina.encenderOApagar();
                case 3 -> banio.encenderOApagar();
                case 4 -> hab1.encenderOApagar();
                case 5 -> Bombilla.encenderOapagarGeneral();
                case 6 -> System.out.println("\nCerrando app.......");
            }
        } while (opcion != 6);

        sc.close();
    }
}