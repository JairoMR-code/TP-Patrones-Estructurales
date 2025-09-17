package Bridge;

public abstract class Notificacion {
    protected MedioEnvio forma;
    protected String name;

    public Notificacion(MedioEnvio forma,String name ){
        this.forma= forma;
        this.name = name;
    }

    abstract void notificar();
}
