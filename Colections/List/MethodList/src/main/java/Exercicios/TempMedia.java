package Exercicios;

public class TempMedia {

    private int temperatura;
    private String mes;

    public TempMedia(int temperatura, String mes) {
        this.temperatura = temperatura;
        this.mes = mes;
    }
    public String getMeses() {
        return mes;
    }
    public int getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "TempMedia{" +
                "temperatura=" + temperatura +
                ", meses=" + mes +
                '}';
    }

}
