public class Proveedor {
    private int nit;
    private String direccion;
    private String tipoProducto;

    public Proveedor(int nit, String direccion, String tipoProducto) {
        this.nit = nit;
        this.direccion = direccion;
        this.tipoProducto = tipoProducto;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nit=" + nit +
                ", direccion='" + direccion + '\'' +
                ", tipoProducto='" + tipoProducto + '\'' +
                '}';
    }
}
