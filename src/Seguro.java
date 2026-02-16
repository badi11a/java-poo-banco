public class Seguro implements IMostrable {
    private String tipoSeguro;
    private double precioMensual;

    public Seguro(String tipoSeguro, double precioMensual) {
        this.tipoSeguro = tipoSeguro;
        this.precioMensual = precioMensual;
    }

    @Override
    public void imprimir() {
        System.out.println(">>> SEGURO: " + toString());
    }

    @Override
    public String toString() {
        return String.format("Tipo: %-15s | Prima Mensual: $%.2f", tipoSeguro, precioMensual);
    }
}