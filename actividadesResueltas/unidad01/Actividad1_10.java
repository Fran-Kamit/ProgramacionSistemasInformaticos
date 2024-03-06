package unidad01;
import java.util.Scanner;

public class Actividad1_10  {
    public static void main(String[] args) {
        System.out.println("Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta \ndecisión: si está lloviendo y si hemos terminado nuestras tareas. Solo podremos salir a la calle si no está \nlloviendo y hemos finalizado nuestras tareas. Existe una opción en la que, indistintamente de lo anterior, \npodremos salir a la calle: el hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo, \nentregar un libro, etc.). Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y \nsi necesita ir a la biblioteca. El algoritmo debe mostrar mediante un booleano (true o false) si es posible que \nse le otorgue permiso para ir a la calle.");
        boolean llueve, finalizadoTareas, irBiblioteca;
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Está lloviendo? (true/false): ");
        llueve = sc.nextBoolean();
        System.out.print("¿Has finalizado tus tareas? (true/false): ");
        finalizadoTareas = sc.nextBoolean();
        System.out.print("¿Tienes que ir a la biblioteca? (true/false): ");
        irBiblioteca = sc.nextBoolean();
        boolean salir = !llueve && finalizadoTareas || irBiblioteca;
        System.out.println("Puedes salir: " + salir);
    }
}
