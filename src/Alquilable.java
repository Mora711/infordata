public class Alquilable extends Producto{
    private double precioHora;

    public Alquilable(String modelo, String codigo, double precioHora) {
        super(modelo, codigo);
        this.precioHora = precioHora;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    @Override
    public String toString() {
        return "Alquilable{" +
                "precioHora=" + precioHora +
                '}';
    }
}
