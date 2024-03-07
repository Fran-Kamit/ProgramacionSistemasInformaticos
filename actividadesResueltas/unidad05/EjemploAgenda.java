package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploAgenda {
    static Scanner sc = new Scanner(System.in);
    static String[][] agenda = new String[0][0];

    public static void main(String[] args) {
        menu();

    }

    static void menu(){
        System.out.println("*****AGENDA*****\n");
        byte eleccion;

        do {
            System.out.print("Agenda vacía. "
                    + "¿Desea añadir un contacto? 1- Sí, 2- No -> ");
            eleccion = sc.nextByte();
        } while (eleccion < 1 || eleccion > 2);

        if (eleccion == 1) {
            do {
                switch (eleccion) {
                    case 1 -> {
                        System.out.println("\nAñadir nombre y teléfono.");
                        int x = agenda.length;
                        agenda = Arrays.copyOf(agenda, agenda.length + 1);
                        agenda[x] = new String[2];
                        agenda = agregarNombreTel(agenda);
                        System.out.println("El contacto se ha añadido correctamente.");
                    }

                    case 2 -> {
                        System.out.println("\nBuscar teléfono a partir de nombre.");
                        buscarAgenda(agenda);
                    }

                    case 3 -> {
                        System.out.println("\nMostrando la información de la agenda.");
                        agenda = ordenarAgenda(agenda);
                        mostrarAgenda(agenda);
                    }

                    case 4 -> {
                        System.out.println("\nEditar teléfono de un contacto.");
                        editarTelefono(agenda);
                    }

                    case 5 -> {
                        System.out.println("\nEliminar un contacto.");
                        agenda = eliminarContacto(agenda);
                    }
                }

                do {
                    System.out.print("\n¿Qué desea realizar? 1- Añadir, 2- Buscar, "
                            + "3- Mostrar, 4- Editar teléfono, 5- Eliminar contacto, 0- Salir -> ");
                    eleccion = sc.nextByte();
                } while (eleccion < 0 || eleccion > 5);
            } while (eleccion >= 1 && eleccion <= 5);
        }
        System.out.println("\nSaliendo del programa...");
    }

    static String[][] agregarNombreTel(String agenda[][]) {
        Scanner sc = new Scanner(System.in);
        String n1, n2;
        boolean existe;

        /*Eje X*/
        int x = agenda.length - 1;

        /*Eje Y*/
        int y = 0;
        System.out.print("Introduzca el nombre -> ");
        agenda[x][y] = sc.nextLine();
        /*Transformamos el nombre, la primera en mayúscula y el resto en minúsculas.*/
        n1 = agenda[x][y].substring(0, 1) .toUpperCase();
        n2 = agenda[x][y].substring(1, agenda[x][y].length()) .toLowerCase();
        agenda[x][y] = n1 + n2;

        y++;

        System.out.print("Introduzca el teléfono -> ");
        String telefono = sc.next();

        while (telefono.length() != 9) {
            System.out.print("Error. Introduzca un teléfono válido -> ");
            telefono = sc.next();
        }
        agenda[x][y] = telefono;

        return agenda;
    }

    static void buscarAgenda(String agenda[][]) {
        if (comprobacionAgenda(agenda) == false){
            System.out.println("La agenda está vacía.");
        } else {
            Scanner sc = new Scanner(System.in);
            String nombre, n1, n2;
            int pos = -1;

            System.out.print("Introduzca el nombre -> ");
            nombre = sc.nextLine();
            /*Transformamos el nombre, la primera en mayúscula y el resto en minúsculas.*/
            n1 = nombre.substring(0, 1).toUpperCase();
            n2 = nombre.substring(1, nombre.length()).toLowerCase();
            nombre = n1 + n2;

            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i][0].equals(nombre)) {
                    pos = i;
                }
            }

            if (pos > -1) {
                System.out.println(agenda[pos][0] + " tiene el número " + agenda[pos][1]);
            } else {
                System.out.println("No hay ningún contacto que se llame " + nombre);
            }
        }
    }

    static String[][] ordenarAgenda(String agenda[][]) {
        int x = agenda.length;
        String auxNombre, auxTel;
        for (int i = 0; i < x - 1; i++) { //"x-1" Por el length de la agenda
            for (int j = i + 1; j < x; j++) {
                if (agenda[i][0].compareToIgnoreCase(agenda[j][0]) > 0) { //Compara ignorando mayúsculas de los nombres
                    auxNombre = agenda[j][0];
                    auxTel = agenda[j][1];
                    agenda[j][0] = agenda[i][0];
                    agenda[j][1] = agenda[i][1];
                    agenda[i][0] = auxNombre;
                    agenda[i][1] = auxTel;
                }
            }
        }
        return agenda;
    }

    static boolean comprobacionAgenda(String agenda[][]){
        boolean comprobacionAgenda = false;
        int comprobacionCadena = agenda.length -1;
        if (comprobacionCadena >= 0){
            comprobacionAgenda = true;
        }
        return comprobacionAgenda;
    }

    static void mostrarAgenda(String agenda[][]) {
        if (comprobacionAgenda(agenda) == false){
            System.out.println("La agenda está vacía.");
        } else {
            for (String[] agenda1 : agenda) {
                System.out.println(Arrays.toString(agenda1));
            }
        }
    }

    static String [][] editarTelefono(String agenda [][]){
        if (comprobacionAgenda(agenda) == false){
            System.out.println("La agenda está vacía.");
        } else {
            Scanner sc = new Scanner(System.in);
            String nombre, n1, n2;
            int pos = -1;

            System.out.print("Introduzca el nombre -> ");
            nombre = sc.nextLine();
            /*Transformamos el nombre, la primera en mayúscula y el resto en minúsculas.*/
            n1 = nombre.substring(0, 1).toUpperCase();
            n2 = nombre.substring(1, nombre.length()).toLowerCase();
            nombre = n1 + n2;

            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i][0].equals(nombre)) {
                    pos = i;
                }
            }

            if (pos > -1) {
                System.out.print("Introduzca el nuevo número -> ");
                String telefono = sc.next();

                while (telefono.length() != 9) {
                    System.out.print("Error. Introduzca un teléfono válido -> ");
                    telefono = sc.next();
                }

                agenda[pos][1] = telefono;

                System.out.println(agenda[pos][0] + " se ha modificado el número a " + agenda[pos][1]);
            } else {
                System.out.println("No hay ningún contacto que se llame " + nombre);
            }
        }
        return agenda;
    }

    static String [][] eliminarContacto(String agenda[][]){
        if (comprobacionAgenda(agenda) == false){
            System.out.println("La agenda está vacía.");
        } else {
            Scanner sc = new Scanner(System.in);
            String nombre, n1, n2;
            byte confirmar;
            int pos = -1;

            System.out.print("Introduzca el nombre -> ");
            nombre = sc.nextLine();
            /*Transformamos el nombre, la primera en mayúscula y el resto en minúsculas.*/
            n1 = nombre.substring(0, 1).toUpperCase();
            n2 = nombre.substring(1, nombre.length()).toLowerCase();
            nombre = n1 + n2;

            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i][0].equals(nombre)) {
                    pos = i;
                }
            }
            if (pos > -1) {
                do {
                    System.out.print("¿Está seguro de eliminar el contacto " + nombre + " (1- Sí, 2- No) -> ");
                    confirmar = sc.nextByte();
                } while (confirmar < 1 || confirmar > 2);
                ///////
                if (confirmar == 1) {
                    agenda[pos] = agenda[agenda.length - 1];
                    agenda = Arrays.copyOf(agenda, agenda.length - 1);
                } else {
                    System.out.println("El contacto " + nombre + " no se ha eliminado.");
                }/////

            } else {
                System.out.println("No hay ningún contacto que se llame " + nombre);
            }
        }
        return agenda;
    }
}