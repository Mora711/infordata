public class Impresora extends Producto{
    private int velocidad;

    public Impresora(String modelo, String codigo, int velocidad) {
        super(modelo, codigo);
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Impresora{" +
                "velocidad=" + velocidad +
                '}';
    }
}