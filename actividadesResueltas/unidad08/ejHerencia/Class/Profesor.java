package unidad08.ejHerencia.Class;

import java.time.LocalDate;

public class Profesor extends Persona{
    private static int idCont=1;
    private int idProfesor;
    private String materia;
    private boolean tutor;
    private double sueldo;
    private LocalDate fechaAlta;
    private boolean personalFijo;
    private boolean equipoDirectivo;
    private String jornada;

    public Profesor() {
        super();
        this.idProfesor=asignarId();
    }

    private int asignarId() {
        return idCont++;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = asignarId();
    }

    public Profesor(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNacimiento, String nacionalidad, int idProfesor, String materia, boolean tutor, double sueldo, LocalDate fechaAlta, boolean personalFijo, boolean equipoDirectivo, String jornada) {
        super(nombre, telefono, direccion, sexo, fechaNacimiento, nacionalidad);
        this.idProfesor = idProfesor;
        this.materia = materia;
        this.tutor = tutor;
        this.sueldo = sueldo;
        this.fechaAlta = fechaAlta;
        this.personalFijo = personalFijo;
        this.equipoDirectivo = equipoDirectivo;
        this.jornada = jornada;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public boolean isTutor() {
        return tutor;
    }

    public void setTutor(boolean tutor) {
        this.tutor = tutor;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isPersonalFijo() {
        return personalFijo;
    }

    public void setPersonalFijo(boolean personalFijo) {
        this.personalFijo = personalFijo;
    }

    public boolean isEquipoDirectivo() {
        return equipoDirectivo;
    }

    public void setEquipoDirectivo(boolean equipoDirectivo) {
        this.equipoDirectivo = equipoDirectivo;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idProfesor=" + idProfesor +
                ", materia='" + materia + '\'' +
                ", tutor=" + tutor +
                ", sueldo=" + sueldo +
                ", fechaAlta=" + fechaAlta +
                ", personalFijo=" + personalFijo +
                ", equipoDirectivo=" + equipoDirectivo +
                ", jornada='" + jornada + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}