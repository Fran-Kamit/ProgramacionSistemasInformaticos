package unidad07.Actividad7_10.Class.Maquinaria;

public class Vagon {
    private int numID;
    private int cargaMax;
    private double cargaActual;
    private String mercancia;


    /**
     * Constructor vacío
     */
    public Vagon() {
    }

    /**
     * Método Constructor
     * @param numID
     * @param cargaMax
     * @param cargaActual
     * @param mercancia
     */
    public Vagon(int numID, int cargaMax, double cargaActual, String mercancia) {
        this.numID = numID;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }


    /**
     * Getter y Setter
     * @return
     * @Param
     */
    public int getNumID() {
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }


    /**
     * Método toString
     * @return
     */
    @Override
    public String toString() {
        return "\nVagon{" +
                "numID=" + numID +
                ", cargaMax=" + cargaMax +
                ", cargaActual=" + cargaActual +
                ", mercancia='" + mercancia + '\'' +
                '}';
    }
}