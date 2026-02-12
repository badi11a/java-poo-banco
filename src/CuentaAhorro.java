public class CuentaAhorro extends Cuenta {
    private double tasaInteresAnual;
    private int girosEfectuados;

    public CuentaAhorro(String nombreTitular, double saldo, int numeroCuenta, double tasaInteresAnual) {
        super(nombreTitular, saldo, numeroCuenta);
        this.tasaInteresAnual = tasaInteresAnual;
    }

    @Override
    protected void procesarDeposito(double monto) {
        setSaldo(getSaldo() + monto);
    }

    @Override
    protected void procesarGiro(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
            girosEfectuados++;
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Tasa Interes: %.1f%% | Giros Efectuados: %d", tasaInteresAnual, girosEfectuados);
    }
}