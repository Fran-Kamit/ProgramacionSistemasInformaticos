package Clases;

public class Calculadora {
    private double numero1;
    private double numero2;
    private double resultado;

    /**
     * Método constructor vacío
     */
    public Calculadora() {
    }

    /**
     * Método utilizado para sumar
     */
    public void sumar(){
        resultado = this.numero1 + this.numero2;

        System.out.print("El resultado de " + this.numero1 + " + " + this.numero2 + " = " + COLOR_AMARILLO);
        System.out.println(resultado);
        System.out.print(COLOR_RESET);
    }

    /**
     * Método utilizado para restar
     */
    public void restar(){
        resultado = this.numero1 - this.numero2;

        System.out.print("El resultado de " + this.numero1 + " - " + this.numero2 + " = " + COLOR_AMARILLO);
        System.out.println(resultado);
        System.out.print(COLOR_RESET);
    }

    /**
     * Método utilizado para multiplicar
     */
    public void multiplicar (){
        resultado = this.numero1 * this.numero2;

        System.out.print("El resultado de " + this.numero1 + " * " + this.numero2 + " = " + COLOR_AMARILLO);
        System.out.println(resultado);
        System.out.print(COLOR_RESET);
    }

    /**
     * Método utilizado para dividir
     */
    public void dividir (){
        if (this.numero2 == 0) { //Condición que comprueba si el numero2 es 0, en caso de ser afirmativo, muestra un mensaje
            System.out.println(COLOR_ROJO + "Cualquier número dividido entre 0 tiene como resultado " +
                    "infinito." + COLOR_RESET);
        } else {
            resultado = this.numero1 / this.numero2;

            System.out.print("El resultado de " + this.numero1 + " / " + this.numero2 + " = " + COLOR_AMARILLO);
            System.out.println(resultado);
            System.out.print(COLOR_RESET);
        }
    }

    /**
     * Método utilizado para obtener el resto de la división
     */
    public void restoDivision (){
        resultado = this.numero1 % this.numero2;

        System.out.print("El resto obtenido de " + this.numero1 + " y " + this.numero2 + " es " + COLOR_AMARILLO);
        System.out.println(resultado);
        System.out.print(COLOR_RESET);
    }

    /**
     * Método utilizado para calcular el exponencial
     */
    public void exponente (){
        resultado = Math.pow(this.numero1, this.numero2);

        System.out.print("El resultado de " + this.numero1 + " elevado a " + this.numero2 + " = " + COLOR_AMARILLO);
        System.out.println(resultado);
        System.out.print(COLOR_RESET);
    }

    /**
     * Métodos Setter
     * @param
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //Variables para cambiar de color lo mostrado por el terminal
    public static final String COLOR_AMARILLO = "\u001B[33m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_RESET = "\u001B[0m";
}