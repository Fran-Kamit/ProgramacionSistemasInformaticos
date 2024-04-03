package unidad07.Actividad7_12.Controller;

import unidad07.Actividad7_12.Class.Lista;

public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        l1.insertarPrincipio(4);l1.insertarFinal(6);l1.insertarFinal(10);
        l1.insertarFinal(45);l1.insertarFinal(74);l1.insertarFinal(11);

        Lista l2 = new Lista();
        l2.insertarPrincipio(45);l2.insertarFinal(25);l2.insertarFinal(18);
        l2.insertarFinal(14);l2.insertarFinal(16);l2.insertarFinal(19);


        //Creamos una tercera lista
        Lista concatenada = new Lista();
        concatenada = concatenada.concatenarTablas(l1,l2);
        concatenada.mostrarElementos();
    }
}