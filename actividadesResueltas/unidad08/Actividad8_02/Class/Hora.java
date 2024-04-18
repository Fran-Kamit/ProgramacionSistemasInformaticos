package unidad08.Actividad8_02.Class;

public class Hora {
    protected int hora, minutos;
    protected String hora1, minutos1;

    public Hora (int hora, int minutos) {
        this.hora = 0;
        this.minutos = 0;
        if (!setHora(hora)) {
            System.out.println("La hora es incorrecta.");
        }

        if (!setMinutos(minutos)) {
            System.out.println("La minutos no son válidos.");
        }
    }

    public void incrementar() {
        this.minutos++;
        if (this.minutos > 59) {
            this.minutos = 0;
            this.hora++;
            if (this.hora > 23) {
                this.hora = 0;
            }
        }
    }

    public boolean setHora(int hora){
        boolean correcto = false;

        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            correcto = true;

            if (hora < 10) {
                hora1 = "0" + hora;
            }
        }
        return correcto;
    }

    public boolean setMinutos(int minutos){
        boolean correcto = false;

        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            correcto = true;

            if (minutos < 10) {
                minutos1 = "0" + minutos;
            }
        }
        return correcto;
    }

    @Override
    public String toString() {
        String result;

        if (this.hora < 10 && this.minutos < 10) {
            result = hora1 + ":" + minutos1;
        }
        else if (this.hora < 10) {
            result = hora1 + ":" + this.minutos;
        }
        else if (this.minutos < 10) {
            result = this.hora + ":" + minutos1;
        }
        else {
            result = this.hora + ":" + this.minutos;
        }
        return result;
    }
}