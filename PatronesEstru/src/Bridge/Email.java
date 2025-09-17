package Bridge;

public class Email implements MedioEnvio{
    @Override
    public String Canal() {
        return "La notificion sera evidenciada por la bandeja de entrada del Email";
    }
}
