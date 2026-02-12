public abstract class Cuenta {
    private String nombreTitular;
    private double saldo;
    private int numeroCuenta;

    protected Cuenta(String nombreTitular, double saldo, int numeroCuenta) {
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
    }

    public final void realizarDeposito(double monto) {
        procesarDeposito(monto);
    }

    public final void realizarGiro(double monto) {
        procesarGiro(monto);
    }

    protected abstract void procesarDeposito(double monto);
    protected abstract void procesarGiro(double monto);

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Titular: %s | Numero Cuenta: %d | Saldo: $%.2f", nombreTitular, numeroCuenta, saldo);
    }
}