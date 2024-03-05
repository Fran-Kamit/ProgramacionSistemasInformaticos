package unidad2;
import java.util.Scanner;

public class Actividad2_14 {
    public static void main(String[] args) {
        System.out.println(" Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la fecha" +
                " correspondiente al \ndía siguiente. (Omitimos años bisiestos).\n");
        Scanner sc = new Scanner(System.in);
        byte d, m, diasMes;
        int a;
        boolean fechaOk = false;

        do {
            System.out.print("Introduzca el día (del 1 al 31): ");
            d = sc.nextByte();
        } while (d < 1 || d > 31);

        do {
            System.out.print("Introduzca el mes (del 1 al 12): ");
            m = sc.nextByte();
        } while (m < 1 || m > 12);

        do{
            System.out.print("Introduzca el año: ");
            a = sc.nextInt();
            if (a == 0){
                System.out.println("El año 0 no existe.");
            }
        } while (a == 0);

        if (m == 2 && d < 29){ //Comprobamos febrero.
            fechaOk = true;
        } else if ((m == 4 || m == 6 || m == 9 || m == 11) && d < 31){ // comprobamos mes con 30 días.
            fechaOk = true;
        } else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){//Comprobamos mes de 31 días.
            fechaOk = true;
        }

        if (fechaOk) {

            diasMes = switch (m) {
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> 31;
            };

            d++;

            if (d > diasMes) {
                d = 1;
                m++;

                if (m > 12) {
                    m = 1;
                    a++;
                }
            }

            if (a == 0) {
                a = 1;
            }

            System.out.println(d + "/" + m + "/" + a);
        } else {
            System.out.println("Fecha incorrecta.");
        }
    }
}