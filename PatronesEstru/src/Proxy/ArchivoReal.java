package Proxy;

public class ArchivoReal implements Archivo {
    private String nombre;

    public ArchivoReal (String nombre){
        this.nombre = nombre;
        cargarArchivo();
    }

    private void cargarArchivo (){
        System.out.println("El archivo "+ nombre + " se esta cargando");
    }

    @Override
    public void leerArchivo() {
        System.out.println("Leyendo archivo: "+ nombre);
    }
}
