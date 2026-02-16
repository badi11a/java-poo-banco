public class App {
    public static void main(String[] args) {
        CuentaAhorro cuenta = new CuentaAhorro("Cliente A", 500000, 101, 0.5);
        Seguro seguroVida = new Seguro("Vida Total", 15000);
        System.out.println("--- REPORTE CONSOLIDADO DEL CLIENTE ---");
        
        mostrarDatos(cuenta);
        mostrarDatos(seguroVida);
    }

    public static void mostrarDatos(IMostrable cuenta) {
        cuenta.imprimir();
    }

}