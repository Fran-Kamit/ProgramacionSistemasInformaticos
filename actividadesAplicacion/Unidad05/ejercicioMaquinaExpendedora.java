/**
 * @Description Aplicación para una máquina expendedora de golosinas. Tema: Array
 * @author Francisco José González
 * @version 1.0 14/03/2024
 */

package Unidad05;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioMaquinaExpendedora {
    public static void main(String[] args) {
        menu();
    }

    //Muestra el menú de la aplicación
    static void menu(){
        //Array de las golosinaas
        String golosinas [][] = {
                {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
                {"Kinder Bueno", "Bolsa Haribo", "Chettos", "Twix"},
                {"Oreo", "M&M's", "Patatas fritas", "Chicles de menta"},
                {"Milkybar", "KitKat blanco", "Oreo fresa", "Huesitos"}
        };

        //Array de precios
        double precios [][] = {
                {1.5, 1.0, 1.65, 1.10},
                {2.0, 2.20, 1.0, 1.05},
                {1.25, 2.0, 2.50, 1.0},
                {3.0, 1.50, 1.25, 1.50}
        };

        //Array stock
        int stock [][] = new int [4][4];
        //lamamos la función de rellanar la máquina
        stock = rellenarMaquina(stock, 5);

        //System.out.println(Arrays.deepToString(stock));
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        double totalVentas = 0, dinero;
        byte opcion, cantStock;
        int pos, posFila, posColum;

        //Desarrollamos el menú
        while(!salir){ //mientras salir sea falso, el bucle se repite.
            System.out.println("\n\t***** MÁQUINA DE GOLOSINAS *****");
            System.out.println("\t  1. Pedir golosinas");
            System.out.println("\t  2. Mostrar golosinas");
            System.out.println("\t  3. Rellenar stock (Admin)");
            System.out.println("\t  4. Apagar máquina");
            System.out.println("\t*******************************\n");

            do {
                System.out.print("Indique su opción -> ");
                opcion = sc.nextByte();
            } while (opcion < 1 || opcion > 4);

            switch (opcion){
                case 1 -> {
                    //Pedir las golosinas
                    System.out.print("\nIndique el código de la golosina -> ");
                    pos = sc.nextInt();
                    if (pos >= 0 && pos <= 3 || pos >= 10 && pos <= 13 || pos >= 20 && pos <= 23
                            || pos >= 30 && pos <= 33) {
                        //calculamos el valor de la fila
                        posFila = (pos % 100) / 10;
                        posColum = pos % 10;

                        //llamamos un método booleano que controle el stock.
                        if (controlStock(stock, posFila, posColum)){
                            //Bucle por si introducen menos dinero del que vale el producto para que vuelvan
                            // a introducirlo.
                            do {
                                System.out.print("Ingrese la cantidad de " + precios[posFila][posColum] + "€ -> ");
                                dinero = sc.nextDouble();
                                if (dinero < precios[posFila][posColum]){
                                    System.out.println("Dinero introducido insuficiente....\n");
                                }
                            } while (dinero < precios[posFila][posColum]);

                            System.out.println("Disfrute de " + golosinas[posFila][posColum]);
                            stock[posFila][posColum]--;
                            totalVentas += precios[posFila][posColum];

                            //condición si el dinero introducido es superior al precio para que calcule la diferencia
                            if (dinero > precios[posFila][posColum]){
                                dinero -= precios[posFila][posColum];
                                System.out.print("Recoja su cambio ");
                                System.out.printf("%.2f", dinero);
                                System.out.println("€");
                            }
                        } else {
                            System.out.println("\nNo hay " + golosinas[posFila][posColum] + " en la máquina.\n");
                        }
                    } else {
                        System.out.println("\nNo existe ningún producto con ese código.\n");
                    }
                }
                case 2 -> {
                    //Mostrar todos los códigos, nombres y precios de las golosinas.
                    mostrarGolosinas(golosinas, precios);
                }
                case 3 -> {
                    //Solicitará la contraseña al técnic y luego llama la función rellenar.
                    System.out.print("Ingrese la contraseña autorizada -> ");
                    String pass = sc.next();sc.nextLine();
                    //validamos que el técnico introduce la contraseña correcta
                    if (pass.equals("chuch3s")){
                        System.out.println("\nReponiendo la máquina...............");
                        rellenarMaquina(stock, 5);
                    } else {
                        System.out.println("\nUsuario no autorizado\n");
                    }
                }
                case 4 -> {
                    //Mostrar lo recolectado en las ventas de la máquina (cierre de caja)
                    System.out.println("\nLa máquina ha vendido -> " + totalVentas + "€");
                    salir = true;
                }
            }
        }
    }

    /**
     * Método que controla el stock mediante booleano.
     * @param stock
     * @param posFila
     * @param posColum
     * @return
     */
    static boolean controlStock(int stock[][], int posFila, int posColum){
        if (stock[posFila][posColum] == 0){
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método para mostrar las posiciones, los nombres y los precios de las golosinas.
     * @param golosinas
     * @param precios
     */
    static void mostrarGolosinas(String golosinas[][], double precios[][]){
        System.out.println("\n...Mostrando las golosinas y sus precios...");
        for (int i = 0; i < golosinas.length; i++) {
            for (int j = 0; j < golosinas[i].length; j++) {
                System.out.println(i + "" + j + " " + golosinas[i][j] + " " + precios[i][j] + "€");
            }
        }
        System.out.println("..........................................");
    }

    /**
     * Método que se utiliza para rellenar el stock de la máquina
     * al inicio y cuando va el técnico a reponer stock.
     * @param stock
     * @param valor
     * @return stock
     */
    static int [][] rellenarMaquina(int stock[][], int valor){
        //inicializamos el array de stock de cada golosina en 5
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j] = valor;
            }
        }
        return stock;
    }
}