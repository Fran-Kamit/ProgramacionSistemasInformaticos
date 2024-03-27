package unidad07.Actividad7_05.Controller;

import unidad07.Actividad7_05.Class.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        principal();
    }

    static Scanner sc = new Scanner(System.in);
    static CuentaCorriente nuevoCliente = new CuentaCorriente();
    static Gestor gestor = new Gestor();

    static void principal() {
        byte seleccionCliente = 0, seleccionGestor = 0;

        do {
            System.out.println("\n******** BANCO PSI ********");
            System.out.println("  1. Crear Cliente");
            System.out.println("  2. Retirar");
            System.out.println("  3. Ingresar");
            System.out.println("  4. Mostrar Info");
            System.out.println("  5. Asignar otro banco");
            System.out.println("  6. Salir");
            System.out.println("***************************\n");

            System.out.print("Indique su opción -> ");
            do {
                seleccionCliente = sc.nextByte();
                if(seleccionCliente < 1 || seleccionCliente > 6) {
                    System.out.print("Opción no válida. Vuelva a introducirla -> ");
                }
            } while (seleccionCliente < 1 || seleccionCliente > 6);

            switch (seleccionCliente){
                case 1 -> {
                    System.out.print("Indique el nombre del cliente -> ");
                    sc.nextLine(); //Se añade esta línea para que "se coma" el salto de línea generado por el switch
                    String nombreT = sc.nextLine();

                    System.out.print("Indique el DNI del cliente -> ");
                    String dniT = sc.next();

                    if (!nombreT.equals("") && !dniT.equals("")){//Comprobamos que el nombre y DNI no estén vacíos.
                        nuevoCliente = new CuentaCorriente(nombreT,dniT);

                        System.out.print ("¿Desea añadir un gestor a la cuenta? 1.Sí 2.No -> ");
                        do {
                            seleccionGestor = sc.nextByte();
                            if (seleccionGestor < 1 || seleccionGestor > 2){
                                System.out.print("Opción no válida. Vuelva a introducirla -> ");
                            }
                        } while (seleccionGestor < 1 || seleccionGestor > 2);
                        if (seleccionGestor == 1){
                            nuevoGestor();
                        } else {
                            gestor = new Gestor();
                            nuevoCliente.setGestor(gestor);
                        }
                        System.out.println("\nCliente creado correctamente.");
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
                case 6 -> {
                    sc.close();
                    System.out.println("Cerrando aplicación.......");
                }
            }
        } while (seleccionCliente !=6);
    }

    static void nuevoGestor(){
        String nombreGestor, telefonoGestor;
        double operacionMax;

        System.out.print("Nombre del gestor -> ");
        sc.nextLine();
        nombreGestor = sc.nextLine();
        System.out.print("Número de teléfono -> ");
        telefonoGestor = sc.nextLine();
        System.out.print("¿Operación máxima de la cuenta? -1.Para no asignar -> ");
        do {
            operacionMax = sc.nextDouble();
            if (operacionMax < 0 && operacionMax != -1){
                System.out.print("La cantidad no puede ser menor a 0€. Vuelva a introducir la cantidad. ->");
            }
        } while (operacionMax < 0 && operacionMax != -1);


        if (operacionMax == -1){
            gestor = new Gestor(nombreGestor, telefonoGestor);
            nuevoCliente.setGestor(gestor);
        }
        if (operacionMax >= 0){
            gestor = new Gestor(nombreGestor, telefonoGestor, operacionMax);
            nuevoCliente.setGestor(gestor);
        }
    }
}