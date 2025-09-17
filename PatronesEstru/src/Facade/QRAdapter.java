package Facade;

public class QRAdapter implements Pago{
    private PagoQR pagoQR;

    public QRAdapter() {
        pagoQR = new PagoQR();
    }

    @Override
    public void pagar(double monto) {
        pagoQR.hacerPago(monto);
    }
}
