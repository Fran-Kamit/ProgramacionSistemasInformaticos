package unidad07.Actividad7_10.Class.Personal;

public class Mecanico {
    private String nombre;
    private String telefono;
    private Especialidad especialidad;


    /**
     * Constructor vacío
     */
    public Mecanico() {
    }

    /**
     * Método Constructor
     * @param nombre
     * @param telefono
     * @param especialidad
     */
    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }


    /**
     * Getter y Setter
     * @return
     * @Param
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }


    /**
     * Método ToString
     * @return
     */
    @Override
    public String toString() {
        return "Mecanico{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}