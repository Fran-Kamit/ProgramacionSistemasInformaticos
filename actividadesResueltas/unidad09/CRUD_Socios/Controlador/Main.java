package unidad09.CRUD_Socios.Controlador;

import unidad09.CRUD_Socios.Modelo.Socio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Socio> lista = new ArrayList<>();

    public static void main(String[] args) {
        /**
         * Crear un menu, insertar los datos, despues guardarlos....ArrayList->Colección
         *
         *          C  R  U  D        CREAR - LEER - ACTUALIZAR -BORRAR
         *          R  E  P  E
         *          E  A  D  L
         *          A  D  A  E
         *          T     T  T
         *          E     E  E
         */
        menu();
    }
    static void menu() {
        byte opcion;

        do {
            System.out.println("\n\tC R U D   DE   SOCIOS");
            System.out.println("******************************");
            System.out.println(" 1. Alta de Socio");
            System.out.println(" 2. Listar Socios");
            System.out.println(" 3. Actualizar Socio por Id");
            System.out.println(" 4. Eliminar Socio por Id");
            System.out.println(" 0. Salir");
            System.out.println("******************************\n");
            System.out.print("Indique su opción-> ");

            do {
                opcion=sc.nextByte();
                if (opcion < 0 || opcion > 4){
                    System.out.print("Opción no válida. Introduzca otra opción -> ");
                }
            } while (opcion < 0 || opcion > 4);

            switch (opcion){
                case 1 -> {
                    lista.add(altaSocio());
                }
                case 2 -> {
                    mostrarLista();
                }
                case 3 -> {
                    int idA = leerId();
                    System.out.println(idA);
                    for (Socio socios : lista){
                        if (socios.getId() == idA){
                            System.out.println(socios.toString());
                            int posicion = lista.indexOf(socios);
                            System.out.println("Posicion -> " + posicion);
                            break;
                        }
                    }
                }
                case 4 -> {

                }
            }


        } while (opcion != 0);
    }

    public static int leerId(){
        int idLeido;

        System.out.print("Indique el Id del Socio -> ");
        idLeido=sc.nextInt();

        return idLeido;
    }

    public static Socio altaSocio(){
        int idSocio = leerId();

        System.out.print("Nombre -> ");
        String nombreSocio = sc.next();sc.nextLine();

        System.out.print("Fecha de Nacimiento (DD-MM-AAAA) -> ");
        String fechaNacimientoSocio = sc.next();sc.nextLine();

        Socio socioNuevo = new Socio(idSocio,nombreSocio,fechaNacimientoSocio);

        return socioNuevo;
    }

    public static void mostrarLista(){
        /*for (Socio socios : lista){
            System.out.println(socios + "\n");

        }*/
        System.out.println(lista.toString());
    }
}