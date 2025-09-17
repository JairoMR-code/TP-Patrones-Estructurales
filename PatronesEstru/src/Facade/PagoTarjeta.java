package Facade;

import Adapter.ImpresoraAdapter;

public class PagoTarjeta {
    private QRAdapter adapter;

    public void pagar(double monto, String medio) {
        if (medio.equalsIgnoreCase("tarjeta")) {
            System.out.println("Pago realizado con tarjeta por $"+monto);
        } else {
            adapter = new QRAdapter();
            adapter.pagar(monto);
        }

    }
}
