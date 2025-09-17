package Facade;

public class Articulo {
    private String nombre;
    private double precio;
    private int cant;

    public Articulo(String nombre, double precio, int cant) {
        this.nombre = nombre;
        this.precio = precio;
        this.cant = cant;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCant() {
        return cant;
    }

    public double subTotal (){
        return precio*cant;
    }

}
