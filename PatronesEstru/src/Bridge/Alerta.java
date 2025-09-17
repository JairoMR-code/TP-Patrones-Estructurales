package Bridge;

public class Alerta extends Notificacion{
    private String hora;
    private String text;

    public Alerta(String name, String hora, String text , MedioEnvio forma) {
        super(forma, name);
        this.hora = hora;
        this.text = text;
    }

    @Override
    public void notificar() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("ALERTA "+""+ name +""+": " + text);
        System.out.println("------------------------------------------------------------------------");

       // Esto iria en el programar alarma
        // System.out.println("La alarma "+ name + "esta programada para las "+hora+" hs y tiene una duracion de "+ duracion+ " min");
    }

    public void programarAlerta (String name, String hora, String contenido){
        System.out.println(" Se ha programado alerta "+ name+ " para la hora "+ hora);
    }
}
