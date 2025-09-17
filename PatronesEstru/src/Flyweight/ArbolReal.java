package Flyweight;

public class ArbolReal implements Arbol {
    private final String nombre, textura, color;

    public ArbolReal(String nombre, String textura, String color) {
        this.nombre = nombre;
        this.textura = textura;
        this.color = color;
        System.out.println("Se ha creado un nuevo tipo de arbol");
    }

    @Override
    public void posicionar(int x, int y, int tamaño) {
       // System.out.println("Colocando el arbol en la posicion: "+ x + " , " + y + "on un tamaño de: "+ tamaño + " metros");
    }
}
