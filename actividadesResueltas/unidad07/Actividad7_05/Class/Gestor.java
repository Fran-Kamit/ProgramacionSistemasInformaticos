package unidad07.Actividad7_05.Class;

public class Gestor {
    public String nombreGestor;
    private String telefonoGestor;
    double operacionMax;


    public Gestor() {
    }

    /**
     * Método constructor con los tres atributos.
     * @param nombreGestor
     * @param telefono
     * @param operacionMax
     */
    public Gestor(String nombreGestor, String telefono, double operacionMax) {
        this.nombreGestor = nombreGestor;
        this.telefonoGestor = telefono;
        this.operacionMax = operacionMax;
    }

    /**
     * Método Constructor con dos atributos y operacionMax de 10000€
     * @param nombreGestor
     * @param telefono
     */
    public Gestor(String nombreGestor, String telefono) {
        this.nombreGestor = nombreGestor;
        this.telefonoGestor = telefono;
        this.operacionMax = 10000.0;
    }

    /**
     * Método Get para devolver el teléfono
     * @return
     */
    public String getTelefonoGestor() {
        return telefonoGestor;
    }

    /**
     * Método toString para devolver los valores registrados.
     * @return
     */
    @Override
    public String toString() {
        return "\n\t-- Gestor --" +
                "\nNombre -> " + nombreGestor +
                "\nTeléfono -> " + telefonoGestor +
                "\nOperación máxima -> " + operacionMax + "€";
    }
}