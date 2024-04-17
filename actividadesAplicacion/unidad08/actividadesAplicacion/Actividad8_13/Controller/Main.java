package unidad08.actividadesAplicacion.Actividad8_13.Controller;

import unidad08.actividadesAplicacion.Actividad8_13.Class.Caja;
import unidad08.actividadesAplicacion.Actividad8_13.Class.Unidad;

public class Main {

    /*  La empresa de mensajería BiciExpress, que reparte en bicicleta, para disminuir el peso que transportan
      sus empleados solo utiliza cajas de cartón. El volumen de estas se calcula como el 80 % del volumen real,
      con el fin de evitar que se deformen y se rompan. Otra característica de las cajas de cartón es que sus
      medidas siempre están en centímetros. Por último, la empresa, para controlar costes, necesita saber cuál es
      la superficie total de cartón utilizado para construir todas las cajas.
        Escribe la clase CajaCarton heredando de la clase Caja.*/

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