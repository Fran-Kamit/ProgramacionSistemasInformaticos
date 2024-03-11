package Unidad04;
import java.util.Scanner;

public class actividadAplicacion4_13 {
    public static void main(String[] args) {
        System.out.println(" Crea una función que muestre por consola los primeros n números pares positivos.\n");

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Indique cuantos números desea que se muestren: ");
            n = sc.nextInt();
        } while (n < 0);

        muestraPares(n);
    }

    static void muestraPares(int n){
        int num = 0;

        for (int i = 0; i < n; i++){
            num +=2;
            System.out.print(num + " ");
        }
        System.out.println();
    }
}