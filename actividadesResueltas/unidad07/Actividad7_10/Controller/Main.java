package unidad07.Actividad7_10.Controller;


import unidad07.Actividad7_10.Class.Maquinaria.Locomotora;
import unidad07.Actividad7_10.Class.Maquinaria.Tren;
import unidad07.Actividad7_10.Class.Maquinaria.Vagon;
import unidad07.Actividad7_10.Class.Personal.Especialidad;
import unidad07.Actividad7_10.Class.Personal.JefeEstacion;
import unidad07.Actividad7_10.Class.Personal.Maquinista;
import unidad07.Actividad7_10.Class.Personal.Mecanico;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        principal();
    }

    static void principal(){

        //Creamos el personal
        Mecanico mc1 = new Mecanico("Jose", "926301477", Especialidad.MOTOR);
        JefeEstacion jE1 = new JefeEstacion("Manuel", "02458721E", LocalDateTime.now());
        Maquinista mq1 = new Maquinista("Pedro", "32458217A", 2500, "Junior");

        System.out.println("*** Nuestro personal ***");
        System.out.println(mc1 + "\n" + jE1 + "\n" + mq1);


        //Creamos las maquinarias
        Locomotora lm1 = new Locomotora("888WQD", 15000, 2021, mc1);
        Vagon vagon = new Vagon(15, 15000, 200, "Ropa");
        Tren tren = new Tren(lm1, mq1);
        tren.engancharVagon(18000, 5000, "Electrónica");
        tren.engancharVagon(vagon);
        System.out.println("\n**** Mostramos maquinaria ****");
        System.out.println(lm1);
        System.out.println(vagon);
        System.out.println(tren);

        //Colecciones -> Agrupar una serie de datos tipo ARRAY

        ArrayList<Mecanico> losMecanicos = new ArrayList<>();
        Mecanico mc2 = new Mecanico("Luis", "926101010", Especialidad.HIDRAULICA);
        losMecanicos.add(mc1);
        losMecanicos.add(mc2);
        System.out.println("\n*** ArrayList de Mecánico ***\n" + losMecanicos);
    }
}