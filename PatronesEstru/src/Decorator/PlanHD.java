package Decorator;

public class PlanHD extends Decorador{
    public PlanHD(Subcripcion subs) {
        super(subs);
    }
    @Override
    public int cuota(){
        return subs.cuota() + 500;
    }

    @Override
    public String nombreSub (){
        return subs.nombreSub() +", mas HD ";
    }
}
