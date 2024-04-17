package unidad08.actividadesAplicacion.Actividad8_13.Class;

public class CajaCarton extends  Caja{
    static double cartonTotal = 0;
    protected double area;

    /**
     * Método Caja para guardar los valores introducidos y calcular el volumen de la caja
     *
     * @param ancho
     * @param alto
     * @param fondo
     * @param unidad
     */
    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, unidad);
    }
}