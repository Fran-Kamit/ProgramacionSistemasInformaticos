package unidad07.Actividad7_10.Class.Personal;

public class Maquinista {
    private String nombre;
    private String dni;
    private double sueldo;
    private String rango;


    /**
     * Constructor vacío
     */
    public Maquinista() {
    }

    /**
     * Método Contructor
     * @param nombre
     * @param dni
     * @param sueldo
     * @param rango
     */
    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }


    /**
     * Getter y Setter
     * @return
     * @param
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    /**
     * Método toString
     * @return
     */
    @Override
    public String toString() {
        return "Maquinista{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", sueldo=" + sueldo +
                ", rango='" + rango + '\'' +
                '}';
    }
}