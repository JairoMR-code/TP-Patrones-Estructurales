package Decorator;

public class Main {
    public static void main (String[] args) {
        //Las funcionalidades añadidas con la que caracteriza al patrón Decorator se ve en evidencia
        //en las clase PlanHD, PlanUltraAD y PlanOffline ya que estas agregan unas funcionalidad a cualquiera
        //de las otras clases y sobre todo a la clase PlanBase.

        Subcripcion sub1 = new PlanBase();

        System.out.println(sub1.nombreSub() + " tiene un precio de $" + sub1.cuota());
        sub1 = new PlanHD(sub1);
        sub1 = new PlanOffline(sub1);
        sub1 = new PlanUltraHD(sub1);

        System.out.println(sub1.nombreSub() + " tiene un precio de $"+sub1.cuota());
    }
}
