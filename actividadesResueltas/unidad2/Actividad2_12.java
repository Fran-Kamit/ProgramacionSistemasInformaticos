package unidad2;
import java.util.Scanner;

public class Actividad2_12 {
    public static void main(String[] args) {
        System.out.println("Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. (No se " +
                "considerarán los años bisiestos).\n");
        Scanner sc = new Scanner(System.in);
        byte dia, mes ;
        int anyo;
        boolean fechaOk = false;

        do {
            System.out.print("Introduzca un día (1 al 31): ");
            dia = sc.nextByte();
        } while (dia < 1 || dia > 31);

        do {
            System.out.print("Introduzca un mes (1 al 12): ");
            mes = sc.nextByte();
        } while (mes < 1 || mes > 12);

        System.out.print("Introduzca el año: ");
        anyo = sc.nextInt();

        if (mes == 2 && dia < 29){ //Comprobamos febrero.
            fechaOk = true;
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31){ // comprobamos mes con 30 días.
            fechaOk = true;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){//Comprobamos mes de 31 días.
            fechaOk = true;
        }

        if (fechaOk && anyo != 0) { // el año 0 no existe.
            System.out.println("\nFecha OK: " + dia + "/" + mes + "/" + anyo);
        } else {
            System.out.println("\nFecha incorrecta.");
        }
    }
}