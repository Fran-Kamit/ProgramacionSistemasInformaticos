package unidad08.ejHerencia.Class;

import java.time.LocalDate;

public class Alumno extends Persona{
    static int idCont=1;
    private  static int idAlumno;
    private String curso;
    private String aula;
    private String nombreTutor;
    private String telefonoTutor;
    private String direccionTutor;
    private String emailTutor;
    private String alergias;
    private boolean comedor;
    private boolean beca;

    public Alumno() {
        super();
        this.idAlumno=asignarId();
    }

    public Alumno(String nombre, String telefono, String direccion, String sexo, LocalDate fechaNacimiento, String nacionalidad, int idAlumno, String curso, String aula, String nombreTutor, String telefonoTutor, String direccionTutor, String emailTutor, String alergias, boolean comedor, boolean beca) {
        super(nombre, telefono, direccion, sexo, fechaNacimiento, nacionalidad);
        this.idAlumno = asignarId();
        this.curso = curso;
        this.aula = aula;
        this.nombreTutor = nombreTutor;
        this.telefonoTutor = telefonoTutor;
        this.direccionTutor = direccionTutor;
        this.emailTutor = emailTutor;
        this.alergias = alergias;
        this.comedor = comedor;
        this.beca = beca;
    }

    public Alumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }
    public int asignarId(){
        return idCont++;
    }
    public void setIdAlumno(int idAlumno) {
        this.idAlumno = asignarId();
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getNombreTutor() {
        return nombreTutor;
    }

    public void setNombreTutor(String nombreTutor) {
        this.nombreTutor = nombreTutor;
    }

    public String getTelefonoTutor() {
        return telefonoTutor;
    }

    public void setTelefonoTutor(String telefonoTutor) {
        this.telefonoTutor = telefonoTutor;
    }

    public String getDireccionTutor() {
        return direccionTutor;
    }

    public void setDireccionTutor(String direccionTutor) {
        this.direccionTutor = direccionTutor;
    }

    public String getEmailTutor() {
        return emailTutor;
    }

    public void setEmailTutor(String emailTutor) {
        this.emailTutor = emailTutor;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public boolean isComedor() {
        return comedor;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }

    public boolean isBeca() {
        return beca;
    }

    public void setBeca(boolean beca) {
        this.beca = beca;
    }

    public void setTelefono(String telefono) {
        this.telefono = "000000000";
    }

    public boolean equals(Object otroAlumno){
        Alumno a= (Alumno) otroAlumno; //Cast de valor de otro objeto a tipo Alumno
        boolean iguales = false;

        if(this.emailTutor.equals(a.emailTutor)){
            iguales = true;
        }

        return iguales;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "idAlumno=" + idAlumno +
                ", curso='" + curso + '\'' +
                ", aula='" + aula + '\'' +
                ", nombreTutor='" + nombreTutor + '\'' +
                ", telefonoTutor='" + telefonoTutor + '\'' +
                ", direccionTudor='" + direccionTutor + '\'' +
                ", emailTutor='" + emailTutor + '\'' +
                ", alergias='" + alergias + '\'' +
                ", comedor=" + comedor +
                ", beca=" + beca +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", sexo='" + sexo + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}