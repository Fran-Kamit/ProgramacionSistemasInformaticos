/*
Clase Persona, que se crea con sus atributos o características(variables) y sus métodos o comportamientos (funciones).
 */
package Ejemplo1.Clases;

public class Persona {
    ///// Atributos de una clase /////
    public String nombre;
    public String dni;
    public byte edad = 0;
    public double estatura = 0, peso = 0;
    //////////////////////////////////

    //Métodos o comportamientos

    public void cumplirAnyo(){
        System.out.println("\n¡Feliz Cumpleaños, " + nombre + "!");
        System.out.println("Te edad ahora es " + (edad + 1) + " años.");
    }

    public void saludar(){
        System.out.println("Hola, mi nombre es " + nombre);
    }

    public void crecer(double incremento){
        estatura += incremento; //reemplazamos el dato inicial de estatura
        //System.out.println("Tu estatura es " + estatura);
    }


}