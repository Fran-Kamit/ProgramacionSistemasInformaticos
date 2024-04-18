package unidad09.CRUD_Socios.Modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
    private int id;
    private String nombre;
    LocalDate fechaNacimiento;

    public Socio(int id, String nombre, String fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
    }

    public int edad(){
        return (int) this.fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    //Método Getter
    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Object otro){
        int resulado;

        Socio otroS = (Socio) otro;

        resulado = this.nombre.compareTo(otroS.nombre);

        return resulado;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Socio -> " +
                "id = " + id +
                ", nombre = " + nombre  +
                ", fechaNacimiento = " + fechaNacimiento.format(f) +
                ", edad = " + edad() + "\n";
    }
}