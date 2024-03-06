package unidad03;

import java.util.Scanner;

public class SalidaAnticipadaBreak {
    public static void main(String[] args) {
        System.out.println(" Ejemplo: Indica la edad para entrar al pub, sólo pueden entrar los mayores de 18 años, " +
                "\n el aforo es de 100 personas, pero el límite está en 5.\n");

        Scanner sc = new Scanner(System.in);
        byte edad;

        for (byte i = 1; i <= 100; i++){
            System.out.print("Indica la edad de la persona " + i + ": ");
            edad = sc.nextByte();
            if(edad < 18) {
                System.out.println("No tiene permitido entrar.");
                i--;
            }
            if (i == 5) {
                System.out.println("*** Límite alcanzado ***");
                break;
            }
        }
    }
}
