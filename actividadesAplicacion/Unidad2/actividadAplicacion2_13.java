package Unidad2;
import java.util.*;

public class actividadAplicacion2_13 {
    public static void main(String[] args) {
        System.out.println(" En una granja se compra diariamente una cantidad de comida para los animales. El número de" +
                " animales que \nalimentar y sabemos que cada animal come una media x.\n Diseña un programa que solicite" +
                " al usuario los valores anterior y determine si disponemos de alimento \nsuficiente para cada animal. " +
                "En caso negativo, ha de calcular cuál es la ración que corresponde a cada uno \nde los animales.\n");
        Scanner sc = new Scanner(System.in) .useLocale(Locale.US);
        int numAnimales;
        double comidaDiaria, kilosPorAnimal, comidaFalta, racionAnimal;

        do {
            System.out.print("Introduzca la cantidad de comida diaria comprada: ");
            comidaDiaria = sc.nextDouble();
        } while (comidaDiaria <= 0);

        do {
            System.out.print("Introduzca la cantidad de animales: ");
            numAnimales = sc.nextInt();
        } while (numAnimales < 1);

        do {
            System.out.print("Introduzca (en kilos) la cantidad que come cada animal: ");
            kilosPorAnimal = sc.nextDouble();
        } while (kilosPorAnimal <= 0);

        if (comidaDiaria < numAnimales * kilosPorAnimal) {
            comidaFalta = numAnimales * kilosPorAnimal - comidaDiaria;
            System.out.println("\nNo hay suficiente comida. Faltan " + comidaFalta + " kilos.");
            racionAnimal = kilosPorAnimal / numAnimales;
            System.out.println("La ración correspondiente es de " + racionAnimal + " kilos por cada animal.");
        } else {
            System.out.println("\nHay suficiente comida.");
        }
    }
}