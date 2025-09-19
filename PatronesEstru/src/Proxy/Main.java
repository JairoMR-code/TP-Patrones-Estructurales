package Proxy;

public class Main {
    public static void  main(String[] args){
        //Ll patrón Proxy se refleja en la clase ArchivoProxy la cual es la encargada de verificar el
        // acceso del usuario al archivo

        Archivo archivo1 = new ArchivoProxy("documento_secreto.txt", "admin");
        archivo1.leerArchivo();

        Archivo archivo2 = new ArchivoProxy("documento_secreto.txt", "invitado");
        archivo2.leerArchivo();

    }
}
