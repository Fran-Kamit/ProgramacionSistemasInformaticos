package unidad04;
import java.util.Scanner;

public class Ejemplo_02 {
    public static void main(String[] args) {
        String nombre, apellido;
        byte edad;

        Scanner sc = new Scanner(System.in);

        System.out.print(" Escribe tu nombre: ");
        nombre = sc.nextLine();

        System.out.print(" Escribe tu apellido: ");
        apellido = sc.nextLine();

        System.out.print(" Introduzca su edad: ");
        edad = sc.nextByte();

        incrementoEdad(nombre, apellido, edad);
    }

    static void incrementoEdad(String nombre, String apellido, byte edad) {
        edad += 10;
        System.out.println(nombre + " " + apellido + ". Tu edad dentro de 10 años será de " + edad + " años.");
    }
}