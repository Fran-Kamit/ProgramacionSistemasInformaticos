package Unidad01;
import java.util.*;

public class actividadAplicacion1_22 {
    public static void main(String[] args) {
        System.out.println("La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante \nescribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del \nconcurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee), pero para el \nranking solo se tiene en cuenta la longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento de \n12,3456 m (que son 1234,56 cm) solo se contabilizarán 1234 cm.Realiza un programa que solicite la longitud (en \nmetros) de un lanzamiento y muestre la parte entera correspondiente en centímetros.\n");
        double m;
        int cm;

        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);

        do{
            System.out.print("Introduce una distancia positiva en metros: ");
            m = sc.nextDouble();
        }while (m < 0);
        m = m * 100;

        cm = (int) m;

        System.out.println("La distancia del lanzamiento es de " + cm + " cm.");
    }
}