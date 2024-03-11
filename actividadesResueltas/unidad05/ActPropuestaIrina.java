package unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class ActPropuestaIrina {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Crear un Array para los 13 alumnos y que contenga nombre, apellido, profesión y email. " +
                "Ordenada por nombre y en forma de tabla.\n");

        ordTablaAlumnos(datosAlumnos());
    }

    static String [][] datosAlumnos(){
        String alumnos [][] = new String[13][4];

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 0){
                    System.out.print("Introduce el nombre -> ");
                    alumnos[i][j] = sc.next();sc.nextLine();
                }
                if (j == 1) {
                    System.out.print("Introduce el apellido -> ");
                    alumnos[i][j] = sc.next(); sc.nextLine();
                }
                if (j == 2) {
                    System.out.print("Introduce la profesión -> ");
                    alumnos[i][j] = sc.next(); sc.nextLine();
                }
                if (j == 3) {
                    System.out.print("Introduce el email -> ");
                    alumnos[i][j] = sc.next(); sc.nextLine();
                }
            }
            System.out.println();
        }
        return alumnos;
    }

    static void ordTablaAlumnos(String alumnos [][]){
        int x = alumnos.length;
        String auxNombre, auxApellido, auxprof, auxEmail;
        for (int i = 0; i < x - 1; i++) { //"x-1" Por el length de la agenda
            for (int j = i + 1; j < x; j++) {
                if (alumnos[i][0].compareToIgnoreCase(alumnos[j][0]) > 0) { //Compara ignorando mayúsculas de los nombres
                    auxNombre = alumnos[j][0];
                    auxApellido = alumnos[j][1];
                    auxprof = alumnos[j][2];
                    auxEmail = alumnos[j][3];
                    alumnos[j][0] = alumnos[i][0];
                    alumnos[j][1] = alumnos[i][1];
                    alumnos[j][2] = alumnos[i][2];
                    alumnos[j][3] = alumnos[i][3];
                    alumnos[i][0] = auxNombre;
                    alumnos[i][1] = auxApellido;
                    alumnos[i][2] = auxprof;
                    alumnos[i][3] = auxEmail;
                }
            }
        }
        System.out.println("|  Nombre  |  Apellido  |  Profesión  |  Email  |");
        for (String fila[] : alumnos) {
            System.out.print("|  ");
            for (String columna : fila) {
                System.out.print(columna + "  |  ");
            }
            System.out.println();
        }
    }
}