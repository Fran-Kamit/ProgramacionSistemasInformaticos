package unidad07.Actividad7_02.Class;

public class CuentaCorriente {
    private String nombreDni;
    private String dni;
    private double saldo;

    /**
     * Constructor vacío
     */
    public CuentaCorriente() {
    }

    /**
     * Método Constructor
     * @param dni
     * @param saldo
     */
    public CuentaCorriente(String dni, double saldo) {
        this.dni = dni;
        this.saldo = saldo;
    }

    /**
     * Método Constructor
     * @param nombreCliente
     * @param dni
     * @param saldo
     */
    public CuentaCorriente(String nombreCliente, String dni, double saldo) {
        this.nombreDni = nombreCliente;
        this.dni = dni;
        this.saldo = saldo;
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
     * Booleano para comprobar si el DNI está vacío
     * @return
     */
    public boolean dniVacio(){
        boolean dniVacío = false;
        if (dni != null){
            dniVacío = true;
        }
        return dniVacío;
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
        System.out.println("Nombre -> " + this.nombreDni +
                "\nDni -> " + this.dni +
                "\nSaldo -> " + this.saldo + "€");
    }

}