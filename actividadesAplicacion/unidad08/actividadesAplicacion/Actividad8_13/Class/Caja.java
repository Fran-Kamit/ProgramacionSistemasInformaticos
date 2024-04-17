package unidad08.actividadesAplicacion.Actividad8_13.Class;

public class Caja {
    //definimos variables
    protected final int ancho, alto, fondo;
    protected final Unidad unidad;
    protected double volumen;
    public String etiqueta;

    /**
     * Método Caja para guardar los valores introducidos y calcular el volumen de la caja
     * @param ancho
     * @param alto
     * @param fondo
     * @param unidad
     */
    public Caja(int ancho, int alto, int fondo, Unidad unidad){
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.unidad = unidad;

        //Switch para calcular el volumen en función si la unidad está en cm ó m.
        switch (this.unidad){
            case CM->
                    this.volumen = ((double)this.ancho / 100) * ((double)this.alto / 100) * ((double)this.fondo/100);

            case M ->
                    this.volumen = (double)this.ancho * (double)this.alto * (double)this.fondo;
        }
    }

    /**
     * Método Getter de Volumen
     * @return
     */
    public double getVolumen(){
        return this.volumen;
    }

    /**
     * Método Setter de Etiqueta
     * @param etiqueta
     */
    public void setEtiqueta(String etiqueta) {
        if (etiqueta.length() < 30){
            this.etiqueta = etiqueta;
        } else {
            this.etiqueta = etiqueta.substring(0, 29);
        }
    }

    /**
     * Método toString
     * @return
     */
    @Override
    public String toString(){
        return "Etiqueta -> " + this.etiqueta +
                "\nMedidas -> " + this.ancho + "x" + this.alto + "x" + this.fondo + " " + this.unidad.toString();
    }
}