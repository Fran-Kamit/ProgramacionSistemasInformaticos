package unidad07.Actividad7_08.Class;

public class SintonizadorFM {
    private double frecuencia;


    /**
     * Método Constructor vacío
     */
    public SintonizadorFM() { //Constructor vacío para iniciar en 80Hz en caso de que no se le pase valor
        this.frecuencia = 80;
    }

    /**
     * Método Constructor
     * @param frecuencia
     */
    public SintonizadorFM(double frecuencia) {
        //Validamos la frecuencia que esté comprendida entre 80 y 108
        if (frecuencia < 80) {
            this.frecuencia = 80;
        } else if (frecuencia > 108) {
            this.frecuencia = 108;
        } else {
            this.frecuencia = frecuencia;
        }
    }

    /**
     * Método para subir la frecuencia
     * @return
     */
    public double up(){
        this.frecuencia += 0.5;
        comprobarFrecuencia();
        return this.frecuencia;
    }

    /**
     * Método para disminuir la frecuencia;
     * @return
     */
    public double down(){
        this.frecuencia -= 0.5;
        comprobarFrecuencia();
        return this.frecuencia;
    }

    /**
     * Método para comprobar la frecuencia
     */
    public void comprobarFrecuencia(){
        //trabajamos directamente con el atributo de la clase.
        if(this.frecuencia < 80) {
            this.frecuencia = 108;
        } else if (this.frecuencia > 108) {
            this.frecuencia = 80;
        }
    }

    /**
     * Método para mostrar la frecuencia sintonizada
     */
    public void display(){
        System.out.println("Sintonizando " + this.frecuencia + " MHz");
    }
}