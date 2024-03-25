package Ejemplo1.Controlador;

import Ejemplo1.Clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona(); //Estoy declarando que p1 es un objeto de tipo Persona

        p1.nombre = "Fran";
        p1.edad = 32;
        p1.peso = 105.5;
        p1.estatura = 1.78;
        p1.dni = "47210534P";

        System.out.println("\nNombre -> " + p1.nombre +
                "\nEdad -> " + p1.edad +
                "\nPeso -> " + p1.peso +
                "\nEstatura -> " + p1.estatura +
                "\nDNI -> " + p1.dni);

        p1.crecer(-0.08);
        System.out.println(p1.nombre + " ahora mide " + p1.estatura);


        Persona p2 = new Persona();

        p2.nombre = "Isabel";
        p2.edad = 35;
        p2.peso = 65;
        p2.estatura = 1.65;
        p2.dni = "08521454B";

        System.out.println("\nNombre -> " + p2.nombre +
                "\nEdad -> " + p2.edad +
                "\nPeso -> " + p2.peso +
                "\nEstatura -> " + p2.estatura +
                "\nDNI -> " + p2.dni);

        p2.cumplirAnyo();
        p2.saludar();
    }
}