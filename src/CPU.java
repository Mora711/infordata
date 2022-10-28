import java.util.Date;

public class CPU extends AltaTecnologia{
    private double memoriaPrincipal;

    public CPU(String paisOrigen, Date fechaFabricacion, Empresa empresa, double memoriaPrincipal) {
        super(paisOrigen, fechaFabricacion, empresa);
        this.memoriaPrincipal = memoriaPrincipal;
    }

    public double getMemoriaPrincipal() {
        return memoriaPrincipal;
    }

    public void setMemoriaPrincipal(double memoriaPrincipal) {
        this.memoriaPrincipal = memoriaPrincipal;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "empresa=" + empresa +
                ", memoriaPrincipal=" + memoriaPrincipal +
                '}';
    }
}
