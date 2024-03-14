package Unidad05;

import java.util.Arrays;
import java.util.Scanner;

/*Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo. Los alumnos se organizan
en grupos compuestos por 5 personas. Leer las notas (números enteros) del primer, segundo y tercer trimestre de un
grupo. Debes mostrar al final la nota media del grupo en cada trimestre y la media del alumno que se encuentra en una
posición dada (que el usuario introduce por teclado).*/
public class actividadAplicacion5_15 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int notas[][] = altaNotas();
        mediaNotas(notas);
        mediaAlumno(notas);
    }
    static int [][] altaNotas(){
        byte comprobacion;
        int notas [][] = new int[3][5];

        for (int trimestre = 0; trimestre < 3; trimestre++) {
            for (int alumno = 0; alumno < 5; alumno++) {
                do {
                    System.out.print("Inserte la nota del alumno " + (alumno + 1) + " del trimestre " +
                            "" + (trimestre + 1) + " -> ");
                    comprobacion = sc.nextByte();
                }while (comprobacion < 0 || comprobacion > 10);

                notas[trimestre][alumno] = comprobacion;
            }
            System.out.println("\n" + Arrays.deepToString(notas));
        }
        return notas;
    }

    static void mediaNotas(int notas[][]){
        int media[]= new int [3];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                media[j] += notas[j][i];
            }
        }
        System.out.println("\nMedia del 1er trimestre -> " + (double)media[0]/5);
        System.out.println("Media del 2º trimestre -> " + (double)media[1]/5);
        System.out.println("Media del 3er trimestre -> " + (double) media[2]/5 + "\n");
    }

    static  void mediaAlumno (int notas[][]){
        byte eleccion;
        double media;

        do {
            System.out.print("¿De qué alumno desea sacar la media? (1 al 5) -> ");
            eleccion = sc.nextByte();
        } while (eleccion < 1 || eleccion > 5);

        eleccion--;

        media = (double) (notas[0][eleccion] + notas[1][eleccion] + notas[2][eleccion]) / 3;
        System.out.printf("%nMedia del alumno " + (eleccion + 1) + " -> " + "%.2f", media);
        System.out.println();
    }
}