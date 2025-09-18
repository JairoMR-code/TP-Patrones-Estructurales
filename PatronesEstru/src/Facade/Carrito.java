package Facade;


import java.util.HashSet;
import java.util.Set;

public class Carrito {
    private Articulo art;
    private Set<Articulo> articulos = new HashSet<>();

    public void addArticulo (Articulo art){
        articulos.add(art);
        System.out.println(" Se agrego el articulo "+art.getNombre());
    }
    public void eliminarArticulo (Articulo art){
        articulos.remove(art);
        System.out.println("El articulo "+ art.getNombre()+ " se ha eliminado del carrito");
    }
    public void mostrarCarrito (){
        System.out.println("\n+ Los articulos que se encuentran en el carrito son: \n");
        for (Articulo articulo : articulos){
            System.out.println("* "+articulo);
            System.out.println("\n");
        }
    }
    public void vaciarCarrito (){
        articulos.clear();
        System.out.println("El carrito se vacio por completo "+ articulos);
    }
    public Set<Articulo> getCarrito(){
        return articulos;
    }
    public double calcularCarrito (){
        double total= 0;
        for (Articulo articulo : articulos){
           total += articulo.subTotal();
        }
        return total;
    }
}
