import java.util.Date;
public class Producto {
    protected String modelo;
    protected String codigo;

    public Producto(String modelo, String codigo) {
        this.modelo = modelo;
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "modelo='" + modelo + '\'' +
                ", codigo='" + codigo + '\'';
    }
}
