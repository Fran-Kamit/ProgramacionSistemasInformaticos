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
     * @param numero1
     * @param numero2
     */
    public void sumar(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

        resultado = this.numero1 + this.numero2;
        System.out.println(resultado);
    }

    /**
     * Método utilizado para restar
     * @param numero1
     * @param numero2
     */
    public void restar(double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

        resultado = this.numero1 - this.numero2;
        System.out.println(resultado);
    }

    /**
     * Método utilizado para multiplicar
     * @param numero1
     * @param numero2
     */
    public void multiplicar (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

        resultado = this.numero1 * this.numero2;
        System.out.println(resultado);
    }

    /**
     * Método utilizado para dividir
     * @param numero1
     * @param numero2
     */
    public void dividir (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

        resultado = this.numero1 / this.numero2;
        System.out.println(resultado);
    }

    /**
     * Método utilizado para obtener el resto de la división
     * @param numero1
     * @param numero2
     */
    public void restoDivision (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

        resultado = this.numero1 % this.numero2;
        System.out.println(resultado);
    }

    /**
     * Método utilizado para calcular el exponencial
     * @param numero1
     * @param numero2
     */
    public void exponente (double numero1, double numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;

        resultado = Math.pow(this.numero1, this.numero2);
        System.out.println(resultado);
    }
}