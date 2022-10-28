public class Monitor extends Alquilable{
    private String resolucionMaxima;

    public Monitor(String modelo, String codigo, double precioHora, String resolucionMaxima) {
        super(modelo, codigo, precioHora);
        this.resolucionMaxima = resolucionMaxima;
    }

    public String getResolucionMaxima() {
        return resolucionMaxima;
    }

    public void setResolucionMaxima(String resolucionMaxima) {
        this.resolucionMaxima = resolucionMaxima;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolucionMaxima='" + resolucionMaxima + '\'' +
                ", modelo='" + modelo + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
