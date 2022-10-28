import java.util.Date;

public class SSD extends AltaTecnologia {
    private int capacidad;

    public SSD(String paisOrigen, Date fechaFabricacion, Empresa empresa, int capacidad) {
        super(paisOrigen, fechaFabricacion, empresa);
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
        return "SSD{" +
                "empresa=" + empresa +
                ", capacidad=" + capacidad +
                '}';
    }
}
