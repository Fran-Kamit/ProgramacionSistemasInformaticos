package unidad02;
import java.util.Scanner;

public class ActividadPropuesta2_03 {
    public static void main(String[] args) {
        System.out.println(" Escribe una aplicación que pida al usuario dos números enteros y muestre: true, si ambos" +
                " son distintos \nentre sí o alguno de ellos es cero; y false en caso contrario.\n");
        Scanner sc = new Scanner(System.in);
        int a, b;
        boolean comp;
        System.out.print("Introduzca un número entero: ");
        a = sc.nextInt();
        System.out.print("Introduzca otro número entero: ");
        b = sc.nextInt();
        comp = a!=b;
        if(comp || a == 0 || b == 0){
            System.out.println(comp);
        } else {
            System.out.println(comp);
        }
    }
}
