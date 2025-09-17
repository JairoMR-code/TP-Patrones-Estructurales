package Composite;

public class Plato implements ComponenteMenu{
    private String nombre;
    private double precio;

    public Plato(String nombre,double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrar(int nivel) {
        System.out.println("  ".repeat(nivel) + "- " + nombre + " ($" + precio + ")");
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
