package unidad08.Actividad8_03.Class;

import unidad08.Actividad8_03.Class.Hora;

public class HoraExacta  extends Hora {
    protected int segundo;
    protected String segundo1;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (!setSegundos(segundo)){
            System.out.println("Segundos incorrectos.");
        }
    }

    public boolean setSegundos(int segundo) {
        boolean correcto = false;
        if (segundo >= 0 && segundo <= 59){
            this.segundo = segundo;
            correcto = true;

            if (segundo < 10) {
                segundo1 = "0" + segundo;
            }
        }
        return correcto;
    }

    @Override
    public void incrementar(){
        this.segundo++;
        if (this.segundo > 59){
            this.segundo = 0;
            super.incrementar();
        }
    }

    @Override
    public String toString() {
        String result = super.toString();
        if (this.segundo < 10) {
            result += ":" + segundo1;
        } else {
            result += ":" + segundo;
        }
        return result;
    }

    /*@Override
    public boolean equals(Object o) {
        HoraExacta
    }*/
}