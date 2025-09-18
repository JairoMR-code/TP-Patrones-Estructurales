package Bridge;

import java.time.LocalDate;
import java.util.Date;

public class Recordatorio extends Notificacion{
    private String name;
    private String contenido;
    private LocalDate fecha;

    public Recordatorio(String name,String contenido, LocalDate fecha ,MedioEnvio forma) {
        super(forma, name);
        this.contenido =contenido;
        this.fecha = fecha;
    }

    @Override
    public void notificar() {
        System.out.println("* Recordatorio * ");
        System.out.println(new StringBuilder().append("El examen es un ").append(super.name).append(". El cual se dictara el dia:  ").append(fecha).toString());
        System.out.println(contenido);
    }

}
