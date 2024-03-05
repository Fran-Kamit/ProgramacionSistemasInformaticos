package unidad5;

import java.util.Scanner;

public class ActividadPropuesta5_3 {
    public static void main(String[] args) {
        System.out.println("Solicita por teclado cuantos nºs e introducirlos." +
                "\nRealiza la media de los nºs positivos, la media de los negativos y cuantos 0.\n");

        Scanner sc = new Scanner(System.in);
        int n, contNeg = 0, contCero = 0, contPos = 0;
        double mediaPos = 0, mediaNeg = 0;


        do {
            System.out.print("¿Cuántos números va a introducir? ");
            n = sc.nextInt();
        }while (n < 1);

        int numero[] = new int [n];
        for (int i = 0; i < n; i++){
            System.out.print("Introduzca el número " + (i+1) + " -> ");
            numero[i] = sc.nextInt();

            if (numero[i] < 0) {
                contNeg++;
                mediaNeg += numero[i];
            } else if (numero[i] > 0){
                contPos++;
                mediaPos += numero[i];
            } else {
                contCero++;
            }
        }
        mediaNeg /= contNeg;
        mediaPos /= contPos;

        System.out.println();
        if (contPos != 0){
            System.out.println("La media de los " + contPos + " números positivos es " + mediaPos);
        }
        if (contNeg != 0) {
            System.out.println("La media de los " + contNeg + " números negativos es " + mediaNeg);
        }
        if (contCero != 0) {
            System.out.println("Ceros totales " + contCero);
        }
    }
}