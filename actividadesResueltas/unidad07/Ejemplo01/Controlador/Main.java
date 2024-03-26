package unidad07.Ejemplo01.Controlador;

import unidad07.Ejemplo01.Clases.Persona;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona(); //Estoy declarando que p1 es un objeto de tipo Persona

        p1.nombre = "Fran";
        p1.edad = 32;
        p1.peso = 105.5;
        p1.estatura = 1.78;
        p1.dni = "47210534P";

        mostrarPersona(p1);

        p1.crecer(-0.08);
        System.out.println(p1.nombre + " ahora mide " + p1.estatura);


        Persona p2 = new Persona();

        p2.nombre = "Isabel";
        p2.edad = 35;
        p2.peso = 65;
        p2.estatura = 1.65;
        p2.dni = "08521454B";
        Persona.hoy = "Martes";

        mostrarPersona(p2);

        p2.cumplirAnyo();
        p2.saludar();

        //Línea a partir del método constructor
        Persona p3 = new Persona("Enrique", "21487532A", (byte)21, 1.87, 84);

        mostrarPersona(p3);
    }


    static void mostrarPersona(Persona pers){
        System.out.println("\nNombre -> " + pers.nombre +
                "\nEdad -> " + pers.edad +
                "\nPeso -> " + pers.peso +
                "\nEstatura -> " + pers.estatura +
                "\nDNI -> " + pers.dni);
    }
}