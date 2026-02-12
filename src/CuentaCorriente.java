public class CuentaCorriente extends Cuenta {
    private double lineaSobregiro;
    private int puntosPesos;

    public CuentaCorriente(String nombreTitular, double saldo, int numeroCuenta, double lineaSobregiro) {
        super(nombreTitular, saldo, numeroCuenta);
        this.lineaSobregiro = lineaSobregiro;
    }

    @Override
    protected void procesarDeposito(double monto) {
        setSaldo(getSaldo() + monto);
        puntosPesos += 1;
    }

    @Override
    protected void procesarGiro(double monto) {
        if (monto <= getSaldo()) {
            setSaldo(getSaldo() - monto);
        } else {
            double diferencia = monto - getSaldo();
            if (diferencia <= lineaSobregiro) {
                setSaldo(0);
                lineaSobregiro -= diferencia;
            }
        }
        puntosPesos += 1;
    }

    public double getLineaSobregiro() {
        return lineaSobregiro;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Linea Disponible: $%.2f | Puntos Acumulados: %d", lineaSobregiro, puntosPesos);
    }
}