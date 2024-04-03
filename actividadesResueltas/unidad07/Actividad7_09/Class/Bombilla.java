package unidad07.Actividad7_09.Class;

public class Bombilla {
    private boolean interruptor;
    private static boolean interruptorGeneral = true;


    /**
     * Contructor vacío
     */
    public Bombilla() {
        this.interruptor = false;
    }

    ///// Get del interruptor general //////////////
    public static boolean isInterruptorGeneral() {
        return interruptorGeneral;
    }
    ////////////////////////////////////////////////////////

    /**
     * Método para encender o apagar interruptor general
     */
    public static void encenderOapagarGeneral(){
        interruptorGeneral = !interruptorGeneral;
        /*if (interruptorGeneral){
            interruptorGeneral = false;
        } else {
            interruptorGeneral = true;
        }*/
    }
    /**
     * Método encender o apagar interruptor
     */
    public void encenderOApagar(){
        this.interruptor = !this.interruptor;
        /*if (this.interruptor) {
            this.interruptor = false;
        } else {
            this.interruptor = true;
        }*/
    }

    /**
     * Validamos si el interruptor general y el interruptor de la bombilla están encendidos
     */
    public boolean estado(){
        return interruptorGeneral && interruptor;
        /*if (interruptorGeneral && interruptor){
            return true;
        } else {
            return false;
        }*/
    }

    /**
     * Método para mostrar el estado.
     */
    public String mostrarEstado(){
        if (estado()) {
            return "ON";
        } else {
            return "OFF";
        }
    }
}