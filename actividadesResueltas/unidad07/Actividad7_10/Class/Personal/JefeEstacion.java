package unidad07.Actividad7_10.Class.Personal;

import java.time.LocalDateTime;

public class JefeEstacion {
    private String nombre;
    private String dni;
    private LocalDateTime fechaNombramiento;


    /**
     * Constructor vacío
     */
    public JefeEstacion() {
    }

    /**
     * Método Constructor
     * @param nombre
     * @param dni
     * @param fechaNombramiento
     */
    public JefeEstacion(String nombre, String dni, LocalDateTime fechaNombramiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNombramiento = fechaNombramiento;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDateTime getFechaNombramiento() {
        return fechaNombramiento;
    }

    public void setFechaNombramiento(LocalDateTime fechaNombramiento) {
        this.fechaNombramiento = fechaNombramiento;
    }


    /**
     * Método toString
     * @return
     */
    @Override
    public String toString() {
        return "JefeEstacion{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaNombramiento=" + fechaNombramiento +
                '}';
    }
}