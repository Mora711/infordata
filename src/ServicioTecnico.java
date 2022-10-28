public class ServicioTecnico {
    private Cliente cliente;
    private Impresora impresora;
    private double totalFacturado;

    public ServicioTecnico(Cliente cliente, Impresora impresora, double totalFacturado) {
        this.cliente = cliente;
        this.impresora = impresora;
        this.totalFacturado = totalFacturado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Impresora getImpresora() {
        return impresora;
    }

    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

    public double getTotalFacturado() {
        return totalFacturado;
    }

    public void setTotalFacturado(double totalFacturado) {
        this.totalFacturado = totalFacturado;
    }

    @Override
    public String toString() {
        return "ServicioTecnico{" +
                "cliente=" + cliente +
                ", impresora=" + impresora +
                ", totalFacturado=" + totalFacturado +
                '}';
    }
}
