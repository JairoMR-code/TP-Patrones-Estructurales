package Bridge;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Alerta alerta1 = new Alerta("Parcial", "21:00", "Se acerca un parcial importante ", new SMS());
        Promocion promo1 = new Promocion("Movistar", LocalDate.of(2025,9,12), "Descuento en portabilidad del 85%",new Email(),"Descuento fin del mes");
        Recordatorio recor1 = new Recordatorio("Parcial N°1", "Desde unidad 1 hasta unidad 4",LocalDate.of(2025,9,26),new Email());

        alerta1.notificar();
        promo1.notificar();
        recor1.notificar();

    }
}
