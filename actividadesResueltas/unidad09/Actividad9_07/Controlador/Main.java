package unidad09.Actividad9_07.Controlador;

import unidad09.Actividad9_07.Modelo.Socio;

public class Main {
    public static void main(String[] args) {
        Socio s1 = new Socio(3, "Anselmo", "11-07-2002");
        Socio s2 = new Socio(1, "Josefa", "21-11-2001");

        int resultado = s1.compareTo(s2);
        System.out.println(resultado);
    }
}