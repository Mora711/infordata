public class DiscoDuro extends Alquilable{
    private int capacidad;

    public DiscoDuro(String modelo, String codigo, double precioHora, int capacidad) {
        super(modelo, codigo, precioHora);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "DiscoDuro{" +
                "capacidad=" + capacidad +
                ", modelo='" + modelo + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
