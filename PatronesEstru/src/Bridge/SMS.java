package Bridge;

public class SMS implements MedioEnvio{

    @Override
    public String Canal() {
        return "La notificacion se esta transmitiendo por SMS";
    }
}
