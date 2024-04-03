package unidad07.Actividad7_10.Class.Maquinaria;

import unidad07.Actividad7_10.Class.Personal.Mecanico;

public class Locomotora {
    private String matricula;
    private int potencia;
    private int anyoFabricacion;
    private Mecanico mecanicoAsignado; //Dentro de la clase locomotora, se crea una instancia de la clase Mecánico


    /**
     * Constructor vacío
     */
    public Locomotora() {
    }

    /**
     * Método Constructor
     * @param matricula
     * @param potencia
     * @param anyoFabricacion
     * @param mecanicoAsignado
     */
    public Locomotora(String matricula, int potencia, int anyoFabricacion, Mecanico mecanicoAsignado) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anyoFabricacion = anyoFabricacion;
        this.mecanicoAsignado = mecanicoAsignado;
    }


    /**
     * Getter y Setter
     * @return
     * @Param
     */
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }

    public void setAnyoFabricacion(int anyoFabricacion) {
        this.anyoFabricacion = anyoFabricacion;
    }

    public Mecanico getMecanicoAsignado() {
        return mecanicoAsignado;
    }

    public void setMecanicoAsignado(Mecanico mecanicoAsignado) {
        this.mecanicoAsignado = mecanicoAsignado;
    }


    /**
     * Método toString
     * @return
     */
    @Override
    public String toString() {
        return "Locomotora{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", anyoFabricacion=" + anyoFabricacion +
                ", mecanicoAsignado=" + mecanicoAsignado +
                '}';
    }
}