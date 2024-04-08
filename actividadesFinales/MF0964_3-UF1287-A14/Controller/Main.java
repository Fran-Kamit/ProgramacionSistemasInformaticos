package Controller;

import Class.Calendario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, anyo;
        byte eleccion;

        System.out.println("\n********** Calendario ***********");
        do{
            /* Introducimos y validamos "día" */
            System.out.print(" Introduzca el día -> ");
            dia = sc.nextInt();

            while (dia < 1 || dia > 31) {
                System.out.print(COLOR_ROJO + "Introduzca un día válido -> " + COLOR_RESET);
                dia = sc.nextInt();
            }

            /* Introducimos y validamos "mes" */
            System.out.print(" Introduzca el mes -> ");
            mes = sc.nextInt();

            while (mes < 1 || mes > 12) {
                System.out.print(COLOR_ROJO + "Introduzca un mes válido -> " + COLOR_RESET);
                mes = sc.nextInt();
            }

            /* Introducimos y validamos "año" */
            System.out.print(" Introduzca el año -> ");
            anyo = sc.nextInt();

            while (anyo == 0) {
                System.out.print(COLOR_ROJO + "El año 0 no es un año válido. " + COLOR_RESET + "Introduzca otro año -> ");
                anyo = sc.nextInt();
            }
            /*Validamos fecha y si no es correcta, muestra mensaje*/
            if (!comprobarFecha(dia, mes,anyo)){
                System.out.println(COLOR_ROJO + "\nEsa fecha no existe. Vuelva a introducirla." + COLOR_RESET);
            }
        } while (!comprobarFecha(dia, mes,anyo));

        Calendario fecha = new Calendario(dia, mes, anyo); // Clase y constructor

        do { //bucle do-while que se rompe cuando eleccion = 0
            do { //bucle do-while que se repite muestras la elección sea del 1 al 5
                System.out.println("\n****************** Menú ******************");
                System.out.println("  1. Incrementar día");
                System.out.println("  2. Incrementar mes");
                System.out.println("  3. Incrementar año");
                System.out.println("  4. Comprobar si es igual a otra fecha");
                System.out.println("  5. Mostrar fecha");
                System.out.println("  0. Salir");
                System.out.println("******************************************");
                System.out.print("\nIndique su opción -> ");
                eleccion = sc.nextByte();

                /*Validamos "eleccion" para que concuerde con el menú*/
                while (eleccion < 0 || eleccion > 5) {
                    System.out.print(" Introduzca una elección válida -> ");
                    eleccion = sc.nextByte();
                }

                switch (eleccion) {
                    case 0 -> System.out.println("\nCerrando calendario.........");
                    case 1 -> {
                        System.out.println(COLOR_AMARILLO + "\n Incrementando un día..." + COLOR_RESET);
                        fecha.incrementarDia();
                    }
                    case 2 -> {
                        System.out.println(COLOR_AMARILLO + "\n Incrementando un mes..." + COLOR_RESET);
                        fecha.incrementarMes();
                    }
                    case 3 -> {
                        int increAnyo;
                        System.out.print("\n ¿Cuántos años desea incrementar? ");
                        increAnyo = sc.nextInt();
                        fecha.incrementarAnyo(increAnyo);
                        System.out.println(COLOR_AMARILLO + " Incrementando año..." + COLOR_RESET);
                    }
                    case 4 -> {
                        int compDia, compMes, compAnyo;
                        System.out.println("\n Introduzca la fecha a comparar");

                        do {
                            /* Introducimos y validamos "día" */
                            System.out.print(" Introduzca el día -> ");
                            compDia = sc.nextInt();

                            while (compDia < 1 || compDia > 31) {
                                System.out.print(COLOR_ROJO + "Introduzca un día válido -> " + COLOR_RESET);
                                compDia = sc.nextInt();
                            }

                            /* Introducimos y validamos "mes" */
                            System.out.print(" Introduzca el mes -> ");
                            compMes = sc.nextInt();

                            while (compMes < 1 || compMes > 12) {
                                System.out.print(COLOR_ROJO + "Introduzca un mes válido -> " + COLOR_RESET);
                                compMes = sc.nextInt();
                            }

                            /* Introducimos y validamos "año" */
                            System.out.print(" Introduzca el año -> ");
                            compAnyo = sc.nextInt();

                            while (compAnyo == 0) {
                                System.out.print(COLOR_ROJO + "El año 0 no es un año válido. " + COLOR_RESET + "Introduzca otro año -> ");
                                compAnyo = sc.nextInt();
                            }
                            /*Validamos fecha y si no es correcta, muestra mensaje*/
                            if (!comprobarFecha(compDia, compMes, compAnyo)){
                                System.out.println("\nEsa fecha no existe. Vuelva a introducirla.");
                            }
                        }while (!comprobarFecha(compDia, compMes, compAnyo));
                        fecha.iguales(compDia, compMes, compAnyo);
                        System.out.println("\n ¿Las fechas son iguales? " + fecha.comprueba());
                    }
                    case 5 -> {
                        System.out.print("\n La fecha es -> " + COLOR_AZUL);
                        fecha.mostrar();
                        System.out.println(COLOR_RESET);
                    }
                }
            }while (eleccion < 0 || eleccion > 5);
        } while (eleccion != 0);
        sc.close();
    }

    static boolean comprobarFecha(int dia, int mes, int anyo){
        boolean fechaCorrecta = true;

        if((dia > 28 && mes == 2 && anyo % 4 != 0) || (dia > 29 && mes == 2 && anyo % 4 == 0) || (dia > 30 &&
                (mes == 4 || mes == 6 || mes == 9 || mes == 11))){
            fechaCorrecta = false;
        }
        return fechaCorrecta;
    }

    /*Cambio colores mensaje terminal*/
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_AZUL = "\u001B[34m";
    public static final String COLOR_AMARILLO = "\u001B[33m";
    public static final String COLOR_RESET = "\u001B[0m";
    /////////////////////////////////////////////////////////
}