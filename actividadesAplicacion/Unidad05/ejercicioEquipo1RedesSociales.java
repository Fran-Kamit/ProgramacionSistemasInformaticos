package Unidad05;

import java.util.Arrays;
import java.util.Scanner;

/* Crear una encuesta para saber que red social es la más utilizada
* */
public class ejercicioEquipo1RedesSociales {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String tabla [][];
        tabla = crearEncuesta();
        tabla = ordenarCreciente(tabla);
        mostrarResultados(tabla);
    }


    static String [][] crearEncuesta(){
        String tablaContador[][] = new String [5][2]; //creamos la tabla con 5 filas y 2 columnas
        byte respuesta;
        byte contadorInstagram=0, contadorTwitter=0, contadorFacebook=0, contadorTiktok=0, contadorYoutube=0;

        for (int i = 0; i < 8; i++) { //creamos un bucle para recorrer las 8 filas,ya que habrá 8 encuestados
            mostrar("\nEncuestado nº" + (i+1));
            for (int j = 0; j < 5; j++) { //creamos un bucle para recorrer las columnas con las 5 redes sociales
                switch (j){ //En función del bucle fori de j, elige de forma automática la pregunta de la red social
                    case 0 -> {
                        do { //Se utiliza el bucle do-while para validar si es correcto el valor
                            mostrarSinLn("¿Utilizas Instagram? 1. Si | 2. No -> ");
                            respuesta = sc.nextByte();
                        } while (respuesta < 1 || respuesta > 2);
                        if (respuesta == 1) { //si la respuesta es afirmativa se suma +1 al contador de dicha red social
                            contadorInstagram++;
                        }
                    }
                    case 1 -> {
                        do {
                            mostrarSinLn("¿Utilizas Twitter? 1. Si | 2. No -> ");
                            respuesta = sc.nextByte();
                        } while (respuesta < 1 || respuesta > 2);
                        if (respuesta==1){
                            contadorTwitter++;
                        }
                    }
                    case 2 -> {
                        do {
                            mostrarSinLn("¿Utilizas Facebook? 1. Si | 2. No -> ");
                            respuesta = sc.nextByte();
                        }while (respuesta < 1 || respuesta > 2);
                        if (respuesta==1){
                            contadorFacebook++;
                        }
                    }
                    case 3 -> {
                        do {
                            mostrarSinLn("¿Utilizas TikTok? 1. Si | 2. No -> ");
                            respuesta = sc.nextByte();
                        } while (respuesta < 1 || respuesta > 2);
                        if (respuesta == 1) {
                            contadorTiktok++;
                        }
                    }
                    case 4 -> {
                        do {
                            mostrarSinLn("¿Utilizas YouTube? 1.Si | 2.No -> ");
                            respuesta = sc.nextByte();
                        }while (respuesta < 1 || respuesta > 2);
                        if (respuesta == 1){
                                contadorYoutube++;
                        }
                    }
                }

                //Asociamos los campos de la tabla, enlazando cada red social con su contador correspondiente
                tablaContador [0][0] = "Instagram";
                tablaContador[0][1] = String.valueOf(contadorInstagram);
                tablaContador [1][0] = "Twitter";
                tablaContador[1][1] = String.valueOf(contadorTwitter);
                tablaContador [2][0] = "Facebook";
                tablaContador[2][1] = String.valueOf(contadorFacebook);
                tablaContador [3][0] = "TikTok";
                tablaContador[3][1] = String.valueOf(contadorTiktok);
                tablaContador [4][0] = "YouTube";
                tablaContador[4][1] = String.valueOf(contadorYoutube);
            }
        }
        //mostrar(Arrays.deepToString(contador));
        return tablaContador;
    }

    //Método para ordenar de mayor a menor en función de los contadores.
    static String[][] ordenarCreciente(String tabla[][]) {
        int x = tabla.length;
        String auxNombre, auxCont;
        for (int i = 0; i < x - 1; i++) { //"x-1"
            for (int j = i + 1; j < x; j++) {
                if (tabla[i][1].compareToIgnoreCase(tabla[j][1]) < 0) { //Compara de mayor a menor ignorando mayúsculas
                    auxNombre = tabla[j][0];
                    auxCont = tabla[j][1];
                    tabla[j][0] = tabla[i][0];
                    tabla[j][1] = tabla[i][1];
                    tabla[i][0] = auxNombre;
                    tabla[i][1] = auxCont;
                }
            }
        }
        return tabla;
    }

    //Método para recorrer el array ordenado mostrándolo por pantalla
    static void mostrarResultados(String resultados[][]){
        System.out.println();
        mostrar("··········· R R S S ············");
        for (int i = 0; i < resultados.length; i++) {
            mostrar(Arrays.deepToString(resultados[i]));
            mostrar("································");
        }
        System.out.println(); //finalmente, mostrando el primer posicionado ya que va a ser el mayor
        mostrar("La red social que más se utiliza es... 🥁🥁🥁🥁 ¡¡¡¡" + resultados [0][0] + "!!!!");
    }


    /******************** TEXTO ********************/
    static void mostrar (String texto){ System.out.println("\t"+texto);}
    static void mostrarSinLn (String texto) {System.out.print("\t"+texto);}
}