public class App {
    public static void main(String[] args) {
        testCuentaAhorro();
        testCuentaCorriente();
    }

    public static void testCuentaAhorro() {
        CuentaAhorro cuenta = new CuentaAhorro("Tester Ahorro", 0, 1001, 0.5);

        cuenta.realizarDeposito(1000);
        verificar("Ahorro - Deposito", 1000.0, cuenta.getSaldo());

        cuenta.realizarGiro(200);
        verificar("Ahorro - Giro OK", 800.0, cuenta.getSaldo());

        cuenta.realizarGiro(1000); 
        verificar("Ahorro - Giro Insuficiente", 800.0, cuenta.getSaldo());
    }

    public static void testCuentaCorriente() {
        CuentaCorriente cuenta = new CuentaCorriente("Tester Corriente", 0, 2001, 1000);

        cuenta.realizarDeposito(500);
        verificar("Corriente - Deposito", 500.0, cuenta.getSaldo());

        cuenta.realizarGiro(1000); 
        verificar("Corriente - Sobregiro Saldo", 0.0, cuenta.getSaldo());
        verificar("Corriente - Sobregiro Linea", 500.0, cuenta.getLineaSobregiro());
    }

    public static void verificar(String prueba, double esperado, double actual) {
        if (Math.abs(esperado - actual) < 0.001) {
            System.out.println("[OK] " + prueba);
        } else {
            System.out.println("[ERROR] " + prueba + " | Esperado: " + esperado + " | Actual: " + actual);
        }
    }
}