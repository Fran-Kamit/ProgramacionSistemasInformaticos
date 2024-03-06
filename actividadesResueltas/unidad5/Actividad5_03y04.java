package unidad5;

import java.util.Scanner;

public class Actividad5_03y04 {
    public static void main(String[] args) {
        System.out.println(" Aplicación que solicite al usuario cuántos números desea introducir." +
                "\nA continuación, introducir por teclado esa cantidad de números enteros," +
                "\ny por últimos, mostrar en el orden inverso al introducido.\n");

        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("¿Cuántos nºs desea introducir? ");
            n = sc.nextInt();
        }while (n < 1);

        int t [] = new int [n];

        for (int i = 0; i < t.length; i++){
            System.out.print("Introduzca un nº -> ");
            t[i] = sc.nextInt();
        }

        System.out.println("\nLos nºs en orden inverso al introducido son:");
        for (int i = t.length - 1; i >= 0; i--){
            System.out.print(t[i] + ", ");
        }
////////////////////////////*Actividad 5.4*/////////////////////////////////////
        System.out.println("\n\nEl nº más alto es " + max(t));
    }

    static  int max(int t[]){
        int max = t[0];
        for (int e : t){
            if (e > max) {
                max = e;
            }
        }
        return (max);
    }
}