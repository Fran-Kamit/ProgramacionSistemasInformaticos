package Controlador;

import Clases.Calculadora;

import java.util.Scanner;

public class Main {
    /*Utilizando el paradigma de Programación Orientado a Objetos, realizar una aplicación donde simule una
    calculadora que calcule:
        1. Suma
        2. Resta
        3. Multiplicar
        4. Dividir
        5. Resto
        6. Exponencial

     Para llevar a cabo la actividad, el usuario debe seleccionar en un Menú la operación a Realizar y luego, la
     aplicación solicitar los datos necesarios para realizar la operación. Finalmente, mostrar el resultado.*/

    public static void main(String[] args) {

        menu();
    }

    static void menu(){
        Scanner sc = new Scanner(System.in);// Declaramos el escáner
        //Declaramos las variables.
        byte eleccion;
        double numero1, numero2;
        Calculadora nuevoCalculo = new Calculadora(); //Creamos un nuevo constructor de la clase Calculadora llamado nuevoCalculo

        do { //Bucle do-while para que se repita el pograma hasta que se le escriba 0
                System.out.println(COLOR_CYAN + "\n********** Calculadora **********");
                System.out.println("  1. Sumar");
                System.out.println("  2. Restar");
                System.out.println("  3. Multiplicar");
                System.out.println("  4. Dividir");
                System.out.println("  5. Resto");
                System.out.println("  6. Exponencial");
                System.out.println("  0. Salir");
                System.out.println("*********************************\n" + COLOR_RESET);

                System.out.print("Indique su opción -> ");
                do { //Bucle do-while para comprobar que el valor se pone correctamente para que no de error el switch
                    eleccion = sc.nextByte();
                    if(eleccion < 0 || eleccion > 6) { //Si el valor no es correcto muestra un mensaje y vuelve a pedir la elección.
                        System.out.print(COLOR_ROJO + "Opción no válida." + COLOR_RESET + " Vuelva a introducirla -> ");
                    }
                } while (eleccion < 0 || eleccion > 6);

                switch (eleccion){
                    case 0 -> { //Caso para salir de la calculadora y del programa.
                        sc.close(); //Cerramos el escáner creado.
                        System.out.println("\nCerrando la calculadora..........");
                    }

                    case 1 -> { //Caso para sumar dos valores
                        System.out.println("\n-- Suma --");
                        System.out.print("Introduzca el valor del número 1 -> ");
                        numero1 = sc.nextDouble();
                        System.out.print("Introduzca el valor del número 2 -> ");
                        numero2 = sc.nextDouble();

                        System.out.print("El resultado de " + numero1 + " + " + numero2 + " = " + COLOR_AMARILLO);
                        nuevoCalculo.sumar(numero1, numero2); //Invocamos el método sumar de la clase Calculadora
                        System.out.print(COLOR_RESET);
                    }

                    case 2 -> { //Caso para restar dos valores
                        System.out.println("\n-- Resta --");
                        System.out.print("Introduzca el valor del número 1 -> ");
                        numero1 = sc.nextDouble();
                        System.out.print("Introduzca el valor del número 2 -> ");
                        numero2 = sc.nextDouble();

                        System.out.print("El resultado de " + numero1 + " - " + numero2 + " = " + COLOR_AMARILLO);
                        nuevoCalculo.restar(numero1, numero2);//Invocamos el método restar de la clase Calculadora
                        System.out.print(COLOR_RESET);
                    }

                    case 3 -> { //Caso para multiplicar dos valores
                        System.out.println("\n-- Multilpicación --");
                        System.out.print("Introduzca el valor del número 1 -> ");
                        numero1 = sc.nextDouble();
                        System.out.print("Introduzca el valor del número 2 -> ");
                        numero2 = sc.nextDouble();

                        System.out.print("El resultado de " + numero1 + " * " + numero2 + " = " + COLOR_AMARILLO);
                        nuevoCalculo.multiplicar(numero1, numero2); //Invocamos el método multiplicar de la clase Calculadora
                        System.out.print(COLOR_RESET);
                    }

                    case 4 -> { //Caso para dividir dos valores
                        System.out.println("\n-- División --");

                        System.out.print("Introduzca el valor del número 1 -> ");
                        numero1 = sc.nextDouble();

                        System.out.print("Introduzca el valor del número 2 -> ");
                        numero2 = sc.nextDouble();

                        if (numero2 == 0) { //Condición que comprueba si el numero2 es 0, en caso de ser afirmativo, muestra un mensaje
                            System.out.println(COLOR_ROJO + "Cualquier número dividido entre 0 tiene como resultado " +
                                    "infinito." + COLOR_RESET);
                        } else {
                            System.out.print("El resultado de " + numero1 + " / " + numero2 + " = " + COLOR_AMARILLO);
                            nuevoCalculo.dividir(numero1, numero2); //Invocamos el método dividir de la clase Calculadora
                            System.out.print(COLOR_RESET);
                        }
                    }

                    case 5 -> { //Caso para obtener el resto de una división de dos valores
                        System.out.println("\n-- Resto de una división --");

                        System.out.print("Introduzca el valor del número 1 -> ");
                        numero1 = sc.nextDouble();

                        System.out.print("Introduzca el valor del número 2 -> ");
                        do { //Bucle do-while que se repite si numero2 es 0 y muestra un mensaje en caso afirmativo
                            numero2 = sc.nextDouble();
                            if (numero2 == 0) {
                                System.out.print(COLOR_ROJO + "El valor del número 2 no puede ser 0." +
                                        COLOR_RESET + " Introduzca otro valor -> ");
                            }
                        }while (numero2 == 0);

                        System.out.print("El resto obtenido de " + numero1 + " y " + numero2 + " es " + COLOR_AMARILLO);
                        nuevoCalculo.restoDivision(numero1, numero2); //Invocamos el método restoDivision de la clase Calculadora
                        System.out.print(COLOR_RESET);
                    }

                    case 6 -> { //Caso para calcular el exponente
                        System.out.println("\n-- Exponente --");

                        System.out.print("Introduzca el valor de la base -> ");
                        numero1 = sc.nextDouble();

                        System.out.print("Introduzca el valor de la potencia -> ");
                        numero2 = sc.nextDouble();

                        System.out.print("El resultado de " + numero1 + " elevado a " + numero2 + " = " + COLOR_AMARILLO);
                        nuevoCalculo.exponente(numero1, numero2); //Invocamos el método restoDivision de la clase Calculadora
                        System.out.print(COLOR_RESET);
                    }
                }
        }while (eleccion != 0);
    }

    public static final String COLOR_CYAN = "\u001B[36m";
    public static final String COLOR_AMARILLO = "\u001B[33m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_RESET = "\u001B[0m";
}