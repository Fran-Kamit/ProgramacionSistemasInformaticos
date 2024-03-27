package unidad07.Actividad7_06.Class;

public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;

    /////Métodos Get y Set/////
    public byte getHora() {
        return hora;
    }

    public void setHora(byte hora) {
        this.hora = hora;
    }

    public byte getMinuto() {
        return minuto;
    }

    public void setMinuto(byte minuto) {
        this.minuto = minuto;
    }

    public byte getSegundo() {
        return segundo;
    }

    public void setSegundo(byte segundo) {
        this.segundo = segundo;
    }
    //////////////////

    public void incrementaSegundo() {
        segundo++;
        if (segundo == 60){
            segundo = 0;
            minuto++;

            if (minuto == 60){
                minuto = 0;
                hora++;

                if (hora == 24){
                    hora = 0;
                }
            }
        }
    }
}