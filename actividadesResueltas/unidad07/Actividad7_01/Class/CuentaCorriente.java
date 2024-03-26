package unidad07.Actividad7_01.Class;

public class CuentaCorriente {
    public String nombreCliente;
    public String dni;
    double saldo;

    public CuentaCorriente() {
    }

    /**
     * Método Constructor
     * @param nombre
     * @param dni
     */

    public CuentaCorriente(String nombre, String dni) {
        this.dni = dni;
        this.nombreCliente = nombre;
        this.saldo = 0;
    }

    /**
     * Método para retirar dinero y validar si hay suficiente.
     * @param cantidad
     * @return
     */
    public boolean retiro(double cantidad){
        boolean operacionPosible;
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            operacionPosible = true;
        } else {
            System.out.println("No hay dinero suficiente.");
            operacionPosible = false;
        }
        return (operacionPosible);
    }

    /**
     * Método para añadir dinero a la cuenta
     * @param cantidad
     */
    public void ingreso(double cantidad){
        this.saldo += cantidad;
    }

    /**
     * Método para mostrar los valores almacenados
     */
    public void mostrarInfo(){
        System.out.println("Nombre -> " + this.nombreCliente +
                "\nDni -> " + this.dni +
                "\nSaldo -> " + this.saldo + "€");
    }

}