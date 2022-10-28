public class SoporteTecnico {
    Empresa empresa;
    private double precio;

    public SoporteTecnico(Empresa empresa, double precio) {
        this.empresa = empresa;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SoporteTecnico{" +
                "empresa=" + empresa +
                ", precio=" + precio +
                '}';
    }
}
