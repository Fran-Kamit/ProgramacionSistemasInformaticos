// Clase Persona, que se crea con sus atributos o características(variables) y sus métodos o comportamientos (funciones).


package unidad07.Ejemplo01.Clases;

public class Persona {

    ///// Atributos de una clase /////
    public String nombre;
    public String dni;
    public byte edad = 0;
    public double estatura = 0, peso = 0;
    public static String hoy;
    //////////////////////////////////

    //Método constructor -> crear una instancia mediante el paso de valores.
    //Pueden ser sobrecargados

    public Persona(){
        //vacío
    }

    public Persona(String nombre){

        this.nombre = nombre;
    }

    //Constructor
    public Persona(String nombre, String dni, byte edad, double estatura, double peso) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    /////////////////////////////////////////////////////////////////
    //Métodos o comportamientos
    public void cumplirAnyo() {
        System.out.println("\n¡Feliz Cumpleaños, " + this.nombre + "!");
        System.out.println("Te edad ahora es " + (this.edad + 1) + " años.");
    }



    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre);
    }

    public void crecer(double incremento) {
        this.estatura += incremento; //reemplazamos el dato inicial de estatura
        //System.out.println("Tu estatura es " + estatura);
    }
}