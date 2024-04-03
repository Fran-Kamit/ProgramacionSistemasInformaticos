package unidad07.Actividad7_13.Class;

import unidad07.Actividad7_12.Class.Lista;

public class Pila {
    private Lista lista;

    /**
     * Método constructor vacío
     */
    public Pila() {
        lista = new Lista(); //se crea el array en el momento de llamar el constructor
    }

    /**
     * Método para apilar
     * @param elemento
     */
    public void apilar (Integer elemento){
        lista.insertarPrincipio(elemento);
    }

    /**
     * Método desapilar, que elimina siempre el elemento con indice 0
     */
    public void desapilar (){
        lista.eliminarNum(0);
    }

    /**
     * Método que invoca el método mostrar de la clase Lista
     */
    public void mostrar() {
        lista.mostrarElementos();
    }
}