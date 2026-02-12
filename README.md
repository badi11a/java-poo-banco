## Banco Digital

Proyecto Java simple que modela cuentas bancarias y valida operaciones basicas mediante pruebas en consola.

## Clases del proyecto

- `App`: punto de entrada. Ejecuta pruebas de deposito, giro y sobregiro para validar comportamientos.
- `Cuenta`: clase base con datos comunes (titular, saldo, numero) y operaciones de deposito y giro.
- `CuentaAhorro`: extension de `Cuenta` con una tasa de interes o criterio propio de ahorro.
- `CuentaCorriente`: extension de `Cuenta` con linea de sobregiro.

## Estructura de carpetas

- `src`: codigo fuente
- `test`: pruebas (si aplica)
