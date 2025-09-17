package Proxy;

public class ArchivoProxy implements Archivo{
    private ArchivoReal archivoReal;
    private String nombre;
    private String usuario;

    public ArchivoProxy(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }

    @Override
    public void leerArchivo() {
        if (usuario.equals("admin")) { // Verifica permisos
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombre); // Carga diferida
            }
            archivoReal.leerArchivo();
        } else {
            System.out.println("Acceso denegado. Solo el usuario 'admin' puede leer el archivo.");
        }
    }
}
