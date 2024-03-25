/**
 * @Description Aplicación para tomar comandas en un restaurante. Exámen UF1287_E3
 * @author Francisco José González Sánchez de la Blanca
 * @version 1.0 18/03/2024
 */
package Examen;


import java.util.Arrays;
import java.util.Scanner;

public class UF1287_E3_FJG {
    /*Desarrolla un programa java para ser usado por los camareros de un restaurante, que sirva para tomar nota de los
    menús que los clientes van a tomar.
    Primero, realiza un menú, por ejemplo-> [1. Crear Orden | 2. Modificar Orden | 3. Salir]
    Primer dato a introducir por el camarero es el número de comensales que tendrá que estar en el rango de 1-6, ya
    que no hay mesas de más de cinco comensales. El valor introducido debe asegurarse de que se encuentra en el
    rango definido.
    Entonces el camarero tiene que introducir el menú seleccionado por cada cliente.
    Tenemos tres menús: #1,#2 y #3. Puedes identificar cada menú por el número: menú 1, menú 2 o menú 3.
    Una vez introducidos todos los datos, el programa imprimirá por pantalla los menús solicitados por cada comensal.
    Tienes que emplear un array para registrar los menús que tomará cada comensal. Ten en cuenta que la dimensión de
    dicho array tendrá que definirse en ejecución, ya que no sabemos a priori cuántos comensales vamos a tener.
    Adicional, confirma la orden con los comensales y si existe alguna modificación, tener la posibilidad de cambiar
    la orden.*/

    static int nota[];
    static int contadorOrden = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();

    }

    static void menu(){
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        byte opcion;

        //Desarrollamos el menú
        while (!salir) {
            System.out.println("\n\t****** COMANDAS ******");
            System.out.println("\t 1. Crear orden");
            System.out.println("\t 2. Salir");
            System.out.println("\t**********************\n");

            do { //Bucle para comprobar que se introduce la opcion correcta.
                System.out.print("Indique opción -> ");
                opcion = sc.nextByte();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1 -> {
                    //Crear la orden.
                    contadorOrden++;
                    nota = crearOrden(nota, contadorOrden);
                    System.out.println("\nMenú " + contadorOrden);
                    mostrarMenu(nota);
                }
                case 2 -> {
                    //Salimos del programa
                    System.out.println("\nSaliendo del programa.....");
                    salir = true;}
            }
        }
    }

    /**
     * Método para crear la orden.
     * @param orden
     * @param contadorOrden
     * @return
     */
    static int [] crearOrden(int [] orden, int contadorOrden){
        byte comensales, menuElegido, correcto = 2;
        System.out.print("Introduzca el número de comensales (máx 5) -> ");

        do { /*Comprobamos que el número de comensales está dentro de rango y hacemos un bucle hasta que se introduzca
            un número válido*/
            comensales = sc.nextByte();

            if (comensales < 1 || comensales > 5) {
                System.out.print("Número de comensales fuera de rango. Por favor vuelva a introducir el valor -> ");
            }
        } while (comensales < 1 || comensales > 5);

        int tablaComensal [] = new int [comensales]; //Creamos la tabla con los números de comentales.

        System.out.println("\n\t------------------- Menú -------------------");
        System.out.println("\t [1] Patatas fritas con albóndigas");
        System.out.println("\t [2] Salmón ahumado con patatas horneadas");
        System.out.println("\t [3] Lentejas con chorizo");
        System.out.println("\t--------------------------------------------\n");

        for (int i = 0; i < comensales; i++) { //creamos un bucle para recorrer los comensales;
            System.out.print("Introduce el menú pedido por el comensal " + (i + 1) + " -> ");

            do { // Creamos un bucle para validar que el número del menú existe.
                menuElegido = sc.nextByte();
                if (menuElegido < 1 || menuElegido > 3){
                    System.out.print("El menú introducido no existe. Introduzca otro -> ");
                }
            } while (menuElegido < 1 || menuElegido > 3);

            tablaComensal[i] = menuElegido;
        }

        while (correcto == 2) {
            System.out.print("\n¿La orden es correcta? 1. Sí, 2. No -> ");
            do { //Validamos que sea correcto.
                correcto = sc.nextByte();
            } while (correcto < 1 || correcto > 2);


            if (correcto == 2) {// Hacemos la condición de que si no es correcto se modifique
                tablaComensal = modificarOrden(tablaComensal);
            }
        }

        return tablaComensal;
    }

    /**
     * Método para modificar la orden.
     * @param tablaComensal
     * @return
     */
    static int [] modificarOrden(int [] tablaComensal){
        byte comensal, menu;
        System.out.print("Introduzca el comensal que desea modificar -> ");

        do { // Comprobamos que el comensal que desea modificar, existe.
            comensal = sc.nextByte();
            if (comensal < 1 || comensal > tablaComensal.length) {
                System.out.print("El comensal no existe. Introduzca otro -> ");
            }
        } while (comensal < 1 || comensal > tablaComensal.length);

        System.out.print("Introduzca el menú del comensal " + comensal + " -> ");
        do { //Comprobamos que el menú existe
            menu = sc.nextByte();
            if (menu < 1 || menu > 3) {
                System.out.print("El menú no existe. Introduzca otro -> ");
            }
        } while (menu < 1 || menu > 3);

        tablaComensal[comensal-1] = menu;

        return tablaComensal;
    }

    /**
     * Método para mostrar el menú
     * @param menu
     */
    static void mostrarMenu(int menu []){
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Comensal " + (i + 1) + " va a tomar el menu -> ");
            System.out.println(Arrays.toString(new int[]{menu[i]}));
        }
    }
}