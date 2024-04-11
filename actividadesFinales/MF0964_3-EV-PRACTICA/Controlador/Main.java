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

    static Calculadora nuevoCalculo = new Calculadora(); //Creamos un nuevo constructor de la clase Calculadora llamado nuevoCalculo
    static Scanner sc = new Scanner(System.in);// Declaramos el escáner

    static void menu(){
        //Declaramos las variables.
        byte eleccion;

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
                        leerDatos(eleccion);//Llamamos al método leerDatos

                        nuevoCalculo.sumar(); //Invocamos el método sumar de la clase Calculadora
                    }

                    case 2 -> { //Caso para restar dos valores
                        System.out.println("\n-- Resta --");
                        leerDatos(eleccion);

                        nuevoCalculo.restar();//Invocamos el método restar de la clase Calculadora
                    }

                    case 3 -> { //Caso para multiplicar dos valores
                        System.out.println("\n-- Multilpicación --");
                        leerDatos(eleccion);


                        nuevoCalculo.multiplicar(); //Invocamos el método multiplicar de la clase Calculadora
                    }

                    case 4 -> { //Caso para dividir dos valores
                        System.out.println("\n-- División --");
                        leerDatos(eleccion);

                        nuevoCalculo.dividir(); //Invocamos el método dividir de la clase Calculadora
                    }

                    case 5 -> { //Caso para obtener el resto de una división de dos valores
                        System.out.println("\n-- Resto de una división --");
                        leerDatos(eleccion);

                        nuevoCalculo.restoDivision(); //Invocamos el método restoDivision de la clase Calculadora
                    }

                    case 6 -> { //Caso para calcular el exponente
                        System.out.println("\n-- Exponente --");
                        leerDatos(eleccion);

                        nuevoCalculo.exponente(); //Invocamos el método restoDivision de la clase Calculadora
                    }
                }
        } while (eleccion != 0);
    }

    static void leerDatos(byte eleccion){ //Método para leer los valores
        if (eleccion == 5){ //Condición para que si se elige el caso 5 varíe el sout
            System.out.print("Introduzca el valor del número 1 -> ");
            nuevoCalculo.setNumero1(sc.nextDouble());//Almacenamos en la variable numero1 el valor introducido

            System.out.print("Introduzca el valor del número 2 -> ");
            double numero2;
            do { //Bucle do-while que se repite si numero2 es 0 y muestra un mensaje en caso afirmativo
                numero2 = sc.nextDouble();
                if (numero2 == 0) {
                    System.out.println();
                    System.out.print(COLOR_ROJO + "El valor del número 2 no puede ser 0." +
                            COLOR_RESET + " Introduzca otro valor -> ");
                } else {
                    nuevoCalculo.setNumero2(numero2); //Almacenamos en la variable numero2 el valor introducido
                }
            } while (numero2 == 0);

        } else if (eleccion == 6) {//Condición para que si se elige el caso 6 varíe el sout
            System.out.print("Introduzca el valor de la base -> ");
            nuevoCalculo.setNumero1(sc.nextDouble()); //Almacenamos en la variable numero1 el valor introducido
            System.out.print("Introduzca el valor de la potencia -> ");
            nuevoCalculo.setNumero2(sc.nextDouble()); //Almacenamos en la variable numero2 el valor introducido

        } else {
            System.out.print("Introduzca el valor del número 1 -> ");
            nuevoCalculo.setNumero1(sc.nextDouble()); //Almacenamos en la variable numero1 el valor introducido
            System.out.print("Introduzca el valor del número 2 -> ");
            nuevoCalculo.setNumero2(sc.nextDouble()); //Almacenamos en la variable numero2 el valor introducido
        }
    }

    //Variables para cambiar de color lo mostrado por el terminal
    public static final String COLOR_CYAN = "\u001B[36m";
    public static final String COLOR_ROJO = "\u001B[31m";
    public static final String COLOR_RESET = "\u001B[0m";
}