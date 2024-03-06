package unidad03;
import java.util.Scanner;
public class SalidaAnticipadaContinue {
    public static void main(String[] args) {
        System.out.println(" Hacer una lista de 14 personas y saltar los que se llamen Manuel.\n");

        Scanner sc = new Scanner(System.in);
        String nombre, todosNombres = "";

        for (byte i = 1; i <= 14; i++) {
            System.out.print("Indica tu nombre: ");
            nombre = sc.nextLine();

            if(nombre.equals("Manuel") || nombre.equals("manuel")) {
                continue;
            }
            todosNombres += nombre + "\n";
        }
        System.out.println("\n***Alumnos***");
        System.out.println(todosNombres);
    }
}