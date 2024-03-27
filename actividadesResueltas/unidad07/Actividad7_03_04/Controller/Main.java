package unidad07.Actividad7_03_04.Controller;

import unidad07.Actividad7_03_04.Class.CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        principal();
    }

    static Scanner sc = new Scanner(System.in);

    static void principal() {
        byte seleccion = 0;
        CuentaCorriente nuevoCliente = new CuentaCorriente();

        do {
            System.out.println("\n***** BANCO PSI *****");
            System.out.println("  1. Crear Cliente");
            System.out.println("  2. Retirar");
            System.out.println("  3. Ingresar");
            System.out.println("  4. Mostrar Info");
            System.out.println("  5. Asignar otro banco");
            System.out.println("  6. Salir");
            System.out.println("*********************\n");

            System.out.print("Indique su opción -> ");
            do {
                seleccion = sc.nextByte();
                if(seleccion < 1 || seleccion > 6) {
                    System.out.print("Opción no válida. vuelva a introducirla -> ");
                }
            } while (seleccion < 1 || seleccion > 6);

            switch (seleccion){
                case 1 -> {
                    System.out.print("Indique el nombre del cliente -> ");
                    sc.nextLine(); //Se añade esta línea para que "se coma" el salto de línea generado por el switch
                    String nombreT = sc.nextLine();

                    System.out.print("Indique el DNI del cliente -> ");
                    String dniT = sc.next();

                    if (!nombreT.equals("") || !dniT.equals("")){
                        nuevoCliente.nombreCliente = nombreT;
                        nuevoCliente.setDni(dniT); //Comprobamos a través de Set
                    } else {
                        System.out.println("No se puede crear un cliente sin sus datos.");
                    }
                }
                case 2 -> {
                    if (nuevoCliente.nombreCliente != null) {
                        System.out.print("Indique la cantidad que desea retirar -> ");
                        double importe = sc.nextDouble();

                        if(nuevoCliente.retiro(importe)){
                            System.out.println("Retirando dinero.............");
                        }
                    } else {
                        System.out.println("No existe ningún cliente\n");
                    }

                }
                case 3 -> {
                    if (nuevoCliente.nombreCliente != null) {
                        System.out.print("Indique el importe a ingresar -> ");
                        double ingreso = sc.nextDouble();
                        nuevoCliente.ingreso(ingreso);
                        System.out.println("Cambio realizado con éxito.");
                    } else {
                        System.out.println("No existe ningún cliente\n");
                    }
                }
                case 4 -> {
                    if (nuevoCliente.nombreCliente != null) {
                        nuevoCliente.mostrarInfo();
                    } else {
                        System.out.println("No existe ningún cliente\n");
                    }
                }
                case 5 -> {
                    if (nuevoCliente.nombreCliente != null) {
                        System.out.print("Indique el nombre del banco -> ");
                        sc.nextLine();
                        String nuevoBanco = sc.nextLine();
                        CuentaCorriente.setNombreBanco(nuevoBanco);
                    } else {
                        System.out.println("No existe ningún cliente\n");
                    }
                }
                case 6 -> System.out.println("Cerrando aplicación.......");
            }
        } while (seleccion !=6);
    }
}