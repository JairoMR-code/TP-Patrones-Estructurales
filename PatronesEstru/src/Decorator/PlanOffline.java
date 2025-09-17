package Decorator;

public class PlanOffline extends Decorador{
    public PlanOffline(Subcripcion subs) {
        super(subs);
    }

    @Override
    public int cuota (){
        return subs.cuota() +700;
    }

    @Override
    public String nombreSub (){
        return subs.nombreSub() +" incluyendo la desacargas offline";
    }
}
