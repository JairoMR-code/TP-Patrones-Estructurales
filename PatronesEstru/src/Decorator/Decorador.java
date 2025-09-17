package Decorator;

public abstract class Decorador implements Subcripcion{
    protected Subcripcion subs;

    public Decorador(Subcripcion subs) {
        this.subs = subs;
    }

    @Override
    public int cuota (){
        System.out.println("El precio Total de la subcripción es de: $");
        return subs.cuota();
    }

    @Override
    public String nombreSub (){
        return subs.nombreSub();
    }

}
