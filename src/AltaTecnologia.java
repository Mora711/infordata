import java.util.Date;
public class AltaTecnologia {
    private String paisOrigen;
    private Date fechaFabricacion;
    Empresa empresa;

    public AltaTecnologia(String paisOrigen, Date fechaFabricacion, Empresa empresa) {
        this.paisOrigen = paisOrigen;
        this.fechaFabricacion = fechaFabricacion;
        this.empresa = empresa;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "AltaTecnologia{" +
                "paisOrigen='" + paisOrigen + '\'' +
                ", fechaFabricacion=" + fechaFabricacion +
                ", empresa=" + empresa +
                '}';
    }
}
