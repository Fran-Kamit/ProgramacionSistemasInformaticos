package unidad07.Actividad7_10.Class.Maquinaria;

import unidad07.Actividad7_10.Class.Personal.Maquinista;

import java.util.Arrays;

public class Tren {
    private Locomotora locomotora;
    private Vagon vagones[]; //Array de vagones, no superior a 5
    private Maquinista maquinistaResponsable;
    private byte numVagones;


    /**
     * Constructor vacío
     */
    public Tren() {
    }

    /**
     * Método Contructor
     * @param locomotora
     * @param maquinistaResponsable
     */
    public Tren(Locomotora locomotora, Maquinista maquinistaResponsable) {
        this.locomotora = locomotora;
        this.maquinistaResponsable = maquinistaResponsable;
        //Crear el array con 5 vagones
        vagones = new Vagon[5];
        numVagones = 0;
    }


    /**
     * Métodos Constructores
     * @param cargaMax
     * @param cargaActual
     * @param mercancia
     */
    public void engancharVagon(int cargaMax, double cargaActual, String mercancia){
        if(numVagones > 5){
            System.out.println("No es posible enganchar más vagones.");
        } else {
            Vagon v = new Vagon(numVagones, cargaMax, cargaActual, mercancia);
            vagones[numVagones] = v;
            numVagones++;
        }
    }

    public void engancharVagon(Vagon vagonListo){
        if (numVagones > 5){
            System.out.println("No es posible enganchar más vagones.");
        } else {
            vagones[numVagones] = vagonListo;
            numVagones++;
        }
    }

    /**
     * Método toString
     * @return
     */
    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ",\nvagones=" + Arrays.toString(vagones) +
                ",\nmaquinistaResponsable=" + maquinistaResponsable +
                ",\nnumVagones=" + numVagones +
                '}';
    }
}