package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ComponenteMenu{
    private String nombre;
    private List<ComponenteMenu> items = new ArrayList<>();

    public Menu(String nombre) {
        this.nombre = nombre;
    }

    public void agregar(ComponenteMenu item){
        items.add(item);
    }

    @Override
    public void mostrar(int nivel) {
        System.out.println("  ".repeat(nivel) + "+ " + nombre);
        for (ComponenteMenu item : items) {
            item.mostrar(nivel + 1);
        }
    }

    @Override
    public double getPrecio() {
        double total = 0;
        for (ComponenteMenu item : items) {
            total += item.getPrecio();
        }
        return total;
    }
}
