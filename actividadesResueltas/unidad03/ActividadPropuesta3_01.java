package unidad03;
import java.util.Scanner;

public class ActividadPropuesta3_01 {
    public static void main(String[] args) {
        System.out.println("Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos. El " +
                "usuario \nintroducirá las edades y terminará escribiendo un -1.\n");
        Scanner sc = new Scanner(System.in);
        int edad, edadMax, edadMin;

        do {
            System.out.print("Introduzca la edad: ");
            edad = sc.nextInt();
            edadMax = edad;
            edadMin = edad;
        } while (edad < 0);

        do {
            do {
                while (edad != -1) {
                    if (edadMin > edad) {
                        edadMin = edad;
                    }
                    if (edadMax < edad) {
                        edadMax = edad;
                    }
                    System.out.print("Introduzca la edad: ");
                    edad = sc.nextInt();
                }

            } while (edad > -1);
        } while (edad > -1);
        System.out.println("La edad mínima ingresada es " + edadMin);
        System.out.println("La edad máxima igresada es " + edadMax);

    }
}