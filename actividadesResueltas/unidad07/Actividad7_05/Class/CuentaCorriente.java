package unidad07.Actividad7_05.Class;

public class CuentaCorriente {
    public String nombreCliente; //Público para cualquier clase.
    String dni; //Sólo visible para clase vecina.
    private double saldo; //Sólo visible en su propia clase.
    static private String nombreBanco = "Banco PSI";
    Gestor gestor; //Referencia al objeto tipo Gestor

    public CuentaCorriente() {
    }

    /**
     * Método Constructor
     * @param nombreCliente
     * @param dni
     */
    public CuentaCorriente(String nombreCliente, String dni) {
        this.nombreCliente = nombreCliente;
        this.dni = dni;
        this.saldo = 0;
        this.nombreBanco = "Banco PSI";
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
     * Métodos para mostrar los valores almacenados
     */
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

    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    /*Método que muestra los valores de una clase y se hace automáticamente toString()*/
    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", dni='" + dni + '\'' +
                ", saldo=" + saldo +
                '}';
    }
    public void mostrarInfo(){
        System.out.println("\n\t-- Información de la cuenta --" +
                "\nNombre -> " + this.nombreCliente +
                "\nDni -> " + this.dni +
                "\nSaldo -> " + this.saldo + "€" +
                "\nNombre del banco -> " + this.nombreBanco);
        //Tenemos que validar que exista un gestor, para mostrar la información
        if (gestor.nombreGestor == null) {
            System.out.println("\nCuenta sin gestor asignado.");
        } else {
            System.out.println(gestor.toString());
        }
    }
}