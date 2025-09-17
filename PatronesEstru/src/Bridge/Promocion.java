package Bridge;

import java.time.LocalDate;
import java.util.Date;

public class Promocion extends Notificacion{
    private String nameEmpresa;
    private LocalDate fecha;
    private String promo;

    public Promocion(String nameEmpresa, LocalDate fecha, String promo, MedioEnvio forma, String name) {
        super(forma, name);
        this.nameEmpresa = nameEmpresa;
        this.fecha = fecha;
        this.promo = promo;

    }

    @Override
    public void notificar() {
        System.out.println("$ NO TE PIERDAS ESTA PROMOCION $ \n");
        System.out.println(nameEmpresa+ " te ofrece por esta ocacion, una promo imperdible \n");
        System.out.println(new StringBuilder().append("La promocion consta de: ").append(promo).append(". Esta promocion tiene validez hasta: ").append(fecha).toString());
    }
}
