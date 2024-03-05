package unidad4;
import java.util.Scanner;

public class Actividad4_5 {
    public static void main(String[] args) {
        System.out.println(" Crear una función que, mediante un booleano, indique si el carácter que se pasa" +
                "\ncomo parámetro de entrada corresponde con una vocal.\n");

        Scanner sc = new Scanner(System.in);
        char vocal;

        System.out.print("Introduzca la letra vocal comprobar: ");
        vocal = sc.next().charAt(0);

        System.out.println("¿La '" + vocal + "' es una vocal? " + esVocal(vocal));
    }
    static boolean esVocal (char vocal){
        boolean resultado;
        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ||
                vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U' ){
            resultado = true;
        } else {
            resultado = false;
        }
        return resultado;
    }
}