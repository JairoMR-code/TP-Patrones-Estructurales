package Facade;

public class Main {
    public static void main(String[] args){
        //El patron Facade es reflejado en la clase FacadeTienda la cual suprime todas las
        //funcionalidades de las otras entidades asi dandole un control simplificado al usuario.

        Articulo art1 = new Articulo("Lapto", 2000, 2);
        Articulo art2 = new Articulo("Table S31", 4000, 1);
        Articulo art3 = new Articulo("Celular A31", 1500, 2);
        Carrito carrito = new Carrito();
        Envio envio = new Envio();
        PagoTarjeta tarjeta = new PagoTarjeta();

        FacadeTienda facade = new FacadeTienda(carrito,tarjeta,envio);
        facade.elegirArticulos(art1);
        facade.elegirArticulos(art2);

        facade.realizarCompra("Mendoza","QR");

        Articulo art4 = new Articulo("Celular TCL", 2000,3);
        Articulo art5 = new Articulo("Celular j4", 1000,1);

        facade.elegirArticulos(art5);
        facade.elegirArticulos(art3);

        facade.realizarCompra("Lujan De Cuyo","tarjeta");
    }
}
