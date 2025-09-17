package Decorator;

public class PlanUltraHD extends Decorador{
    public PlanUltraHD(Subcripcion subs) {
        super(subs);
    }

    @Override
    public int cuota(){
        return subs.cuota() + 1000;
    }

    @Override
    public String nombreSub (){
        return subs.nombreSub() +" mas UltraHD";
    }
}
