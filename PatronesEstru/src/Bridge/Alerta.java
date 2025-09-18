package Bridge;

public class Alerta extends Notificacion{
    private String hora;
    private String text;

    public Alerta(String name, String hora, String text , MedioEnvio forma) {
        super(forma, name);
        this.hora = hora;
        this.text = text;
        System.out.println(" Se ha programado alerta "+ name+ " para la hora "+ hora+ "\n Descripcion: "+text);
    }

    @Override
    public void notificar() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("ALERTA "+""+ name +""+": " + text);
        System.out.println("------------------------------------------------------------------------");

    }

}
