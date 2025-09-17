package Facade;

import java.time.LocalDate;

public class Envio {
    LocalDate fechaActual = LocalDate.now();

    public void mostrarTiempo(String zona){
        if(zona.equalsIgnoreCase("Mendoza")) {
            System.out.println("Para esta zona: " + zona + " la compra llegara " + fechaActual.toString());
        }else{
            System.out.println("Su compra llegara a "+zona + "para el dia "+fechaActual.toString()+2);
        }
    }
}
