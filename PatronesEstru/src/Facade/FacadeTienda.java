package Facade;

public class FacadeTienda {
    private Carrito carrito;
    private PagoTarjeta pago;
    private Envio formaEnvio;

    public FacadeTienda (Carrito carrito, PagoTarjeta pago, Envio envio){
        this.carrito = carrito;
        this.pago = pago;
        this.formaEnvio = envio;
    }

    public void elegirArticulos (Articulo art){
        carrito.addArticulo(art);
    }
    public void realizarCompra ( String zona, String medio ){
        System.out.println("------------ Realiazando el proceso de compra -----------");
        pago.pagar(carrito.calcularCarrito(), medio);
        formaEnvio.mostrarTiempo(zona);
    }

}
