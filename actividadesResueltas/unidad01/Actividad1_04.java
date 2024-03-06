package unidad01;
import java.util.Scanner;

public class Actividad1_04 {
    public static void main(String[] args) {
        System.out.println("Escribir una aplicación que pida el año actual y el de nacimiento del usuario. Debe calcular su edad, " +
                "\nsuponiendo que en el año en curso el usuario ya ha cumplido años.\n");
        Scanner sc = new Scanner(System.in);
        int aActual;
        int aNacimiento;
        int edad;
        System.out.print("Año de nacimiento: ");
        aNacimiento = sc.nextInt();
        System.out.print("Año actual: ");
        aActual = sc.nextInt();
        edad = aActual - aNacimiento;
        System.out.println("Su edad es: " + edad + " años.");
    }
}
