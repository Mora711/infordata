import java.util.Date;
public class Pedido {
    private Date fechaAdquisicion;
    private int cantidad;
    Producto producto;
    Proveedor proveedor;

    public Pedido(Date fechaAdquisicion, int cantidad, Producto producto, Proveedor proveedor) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.cantidad = cantidad;
        this.producto = producto;
        this.proveedor = proveedor;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "fechaAdquisicion=" + fechaAdquisicion +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                ", proveedor=" + proveedor +
                '}';
    }
}
