package unidad01;

public class Actividad1_05 {
    public static void main(String[] args) {
        System.out.println("El tipo short permite almacenar valores comprendidos entre −32 768 y 32 767. Escribir un programa \nque compruebe que el rango de valores de un tipo se comporta de forma cíclica, es decir, el valor \nsiguiente al máximo es el valor mínimo.\n");
        short num;
        num = 32767;
        System.out.println("Valor máximo para el tipo short: " + num);
        num ++;
        System.out.println("Valor mínimo para el tipo short: " + num);
    }
}