package unidad08.actividadesAplicacion.Actividad8_12.Controller;

import unidad08.actividadesAplicacion.Actividad8_12.Class.Caja;
import unidad08.actividadesAplicacion.Actividad8_12.Class.Unidad;

public class Main {
    /*  Las empresas de transporte, para evitar daños en los paquetes, embalan todas sus mercancías en cajas
      con el tamaño adecuado. Una caja se crea expresamente con un ancho, un alto y un fondo y, una vez creada,
      se mantiene inmutable. Cada caja lleva pegada una etiqueta, de un máximo de 30 caracteres, con información
      útil como el nombre del destinatario, dirección, etc. Implementa la clase Caja con los siguientes métodos:
          - Caja(int ancho, int alto, int fondo, Unidad unidad): que construye una caja con las dimensiones
           especificadas, que pueden encontrarse en «cm» (centímetros) o «m» (metros).
          - double getVolumen(): que devuelve el volumen de la caja en metros cúbicos.
          - void setEtiqueta(String etiqueta): que modifica el valor de la etiqueta de la caja.
          - String toString(): que devuelve una cadena con la representación de la caja.*/

    public static void main(String[] args) {
        Caja c1, c2;
        String etiqueta;

        //Definimos Caja c1 pasándole los valores
        c1 = new Caja(10,200,200, Unidad.CM);
        etiqueta= "Jose López. Calle Ancha nº 2";
        c1.setEtiqueta(etiqueta);

        //Definimos Caja c2 pasándole los valores
        c2 = new Caja(1, 2, 1, Unidad.M);
        etiqueta = "Pepe González. Entregar antes de las 11:00h";
        c2.setEtiqueta(etiqueta);

        //Mostramos Caja c1
        System.out.println("\n\t*** Caja1 ***");
        System.out.println(c1);
        System.out.println("Volumen -> " + c1.getVolumen() + " m3\n");

        //Mostramos Caja c2
        System.out.println("\t*** Caja2 ***");
        System.out.println(c2);
        System.out.println("Volumen -> " + c2.getVolumen() + " m3");
    }
}