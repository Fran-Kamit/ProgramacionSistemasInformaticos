package Unidad01;
import java.util.*;

public class actividadAplicacion1_18 {
    public static void main(String[] args) {
        System.out.println("Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le \nayude a contabilizar el número de patas que tienen en total todos los animales capturados durante una jornada de \ntrabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:\nEl número de hormigas capturadas (6 patas).\nEl número de arañas capturadas (8 patas).\nEl número de cochinillas capturadas (14 patas).\nLa aplicación debe mostrar el número total de patas.\n");
        int horm, ara, cochi, total;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\nIntroduzca un nº mayor o igual a 0.");
            System.out.print("Introduzca el nº de hormigas capturadas: ");
            horm = sc.nextInt();

            System.out.print("Introduzca el nº de arañas capturadas: ");
            ara = sc.nextInt();

            System.out.print("Introduzca el nº de cochinillas capturadas: ");
            cochi = sc.nextInt();
        }while (horm < 0 || ara < 0 || cochi < 0);

            horm = horm * 6;
            ara = ara * 8;
            cochi = cochi * 14;

            total= horm + ara + cochi;

            System.out.println("El nº total de patas es: " + total);

    }
}