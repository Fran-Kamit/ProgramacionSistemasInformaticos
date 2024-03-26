package unidad07.Actividad7_03_04.Class;

public class CuentaCorriente {
    public String nombreCliente; //Público para cualquier clase.
    String dni; //Sólo visible para clase vecina.
    private double saldo; //Sólo visible en su propia clase.
    //---Ejercicio 04---////////
    static private String nombreBanco = "Banco PSI";
    ///////----------////////

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
                "\nSaldo -> " + this.saldo + "€" +
                "\nNombre del banco -> " + this.nombreBanco);
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    ///////-----Ejercicio 04---////////////////
    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }
    /////////////////------------////////////////////

    /*Método que muestra los valores de una clase y se hace automáticamente toString()*/
    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dni='" + dni + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}