package unidad07.Actividad7_02.Controller;


import unidad07.Actividad7_02.Class.CuentaCorriente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        principal();
    }

    static Scanner sc = new Scanner(System.in);
    static CuentaCorriente nuevoCliente = new CuentaCorriente();

    static void principal() {
        byte seleccion = 0;

        do {
            System.out.println("\n**************** BANCO PSI ****************");
            System.out.println("  1. Crear Cliente DNI y saldo");
            System.out.println("  2. Crear Cliente Nombre, DNI y saldo");
            System.out.println("  3. Retirar");
            System.out.println("  4. Ingresar");
            System.out.println("  5. Mostrar Info");
            System.out.println("  6. Salir");
            System.out.println("******************************************\n");

            System.out.print("Indique su opción -> ");
            do {
                seleccion = sc.nextByte();
                if(seleccion < 1 || seleccion > 6) {
                    System.out.print("Opción no válida. vuelva a introducirla -> ");
                }
            } while (seleccion < 1 || seleccion > 6);

            switch (seleccion){
                case 1 -> {
                    crearClienteSinNombre();
                }
                case 2 -> {
                    crearCliente();
                }
                case 3 -> {
                    if (nuevoCliente.dniVacio()) {
                        System.out.print("Indique la cantidad que desea retirar -> ");
                        double importe = sc.nextDouble();

                        if(nuevoCliente.retiro(importe)){
                            System.out.println("Retirando dinero.............");
                        }
                    } else {
                        System.out.println("No existe ningún cliente\n");
                    }
                }
                case 4 -> {
                    if (nuevoCliente.dniVacio()) {
                        System.out.print("Indique el importe a ingresar -> ");
                        double ingreso = sc.nextDouble();
                        nuevoCliente.ingreso(ingreso);
                    } else {
                        System.out.println("No existe ningún cliente\n");
                    }
                }
                case 5 -> {
                    if (nuevoCliente.dniVacio()) {
                        nuevoCliente.mostrarInfo();
                    } else {
                        System.out.println("No existe ningún cliente\n");
                    }
                }
                case 6 -> System.out.println("Cerrando aplicación.......");
            }
        } while (seleccion !=6);
    }

    static void crearClienteSinNombre(){
        String dniT;
        double saldoT;

        System.out.print("Indique el DNI del cliente -> ");
        dniT = sc.next();

        System.out.print("Indique el saldo inicial -> ");
        saldoT = sc.nextDouble();

        if (!dniT.equals("") && saldoT > 0){
            nuevoCliente = new CuentaCorriente(dniT, saldoT);
        } else {
            System.out.print("No se puede crear un cliente sin sus datos.");
            if(saldoT <= 0) {
                System.out.println(" Y el saldo no puede ser de 0€ o inferior.");
            }
            System.out.println();
        }
    }

    static void crearCliente(){
        String nombreT, dniT;
        double saldoT;

        System.out.print("Indique el nombre del cliente -> ");
        sc.nextLine(); //Se añade esta línea para que "se coma" el salto de línea generado por el switch
        nombreT = sc.nextLine();

        System.out.print("Indique el DNI del cliente -> ");
        dniT = sc.next();

        System.out.print("Indique el saldo inicial -> ");
        saldoT = sc.nextDouble();

        if (saldoT > 0 && !nombreT.equals("") && !dniT.equals("")){
            nuevoCliente = new CuentaCorriente(nombreT,dniT,saldoT);
        } else {
            System.out.print("No se puede crear un cliente sin sus datos.");
            if(saldoT <= 0) {
                System.out.println(" Y el saldo no puede ser de 0€ o inferior.");
            }
            System.out.println();
        }
    }
}