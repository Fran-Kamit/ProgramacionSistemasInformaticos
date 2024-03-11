package Unidad01;
import java.util.*;

public class actividadAplicacion1_19 {
    public static void main(String[] args) {
        System.out.println("Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que \nhay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el \nusuario). Existen dos tipos de entrada: infantiles, que cuestan 15,50 €; y de adultos, que cuestan 20 €.En el \ncaso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento del 5 %.\n");
        int entInfantil, entAdulto;
        double totalInfantil, totalAdulto, total, totalDesc;

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        System.out.print("Introduce cuantas entradas infantiles necesitas: ");
        entInfantil = sc.nextInt();

        System.out.print("Introduce cuantas entradas para adultos necesitas: ");
        entAdulto = sc.nextInt();

        totalInfantil = entInfantil * 15.50;
        totalAdulto = entAdulto * 20;
        total = totalAdulto + totalInfantil;

        if (total >= 100){
            totalDesc = (total * 5) / 100;
            total = total - totalDesc;
            System.out.println("El total a pagar con un 5% de descuento es de " + total + " €.");
        }else{
            System.out.println("El total a pagar es de " + total + " €.");
        }
    }
}