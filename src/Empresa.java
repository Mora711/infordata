public class Empresa {
    private String nombre;
    private String direccion;
    private int numeroEmpresa;

    public Empresa(String nombre, String direccion, int numeroEmpresa) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroEmpresa = numeroEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroEmpresa() {
        return numeroEmpresa;
    }

    public void setNumeroEmpresa(int numeroEmpresa) {
        this.numeroEmpresa = numeroEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroEmpresa=" + numeroEmpresa +
                '}';
    }
}
