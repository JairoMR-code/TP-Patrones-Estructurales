package Decorator;

public class PlanBase implements Subcripcion{

    @Override
    public int cuota() {
        return 1000;
    }

    @Override
    public String nombreSub() {
        return "Plan Base";
    }
}
