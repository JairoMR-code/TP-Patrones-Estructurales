package Composite;

public class Main {
    public static void main (String[] args){

        // La clase Menu refleja la funcionalidad del patrón Composite dado que Menu se puede trabajar
        //como una estructura y a la vez como componente que forma parte de una estructura.

        ComponenteMenu ensalada = new Plato("Ensalada", 5000);
        ComponenteMenu sopa = new Plato("Sopa", 5000);
        ComponenteMenu Mila = new Plato("Pure con Mila", 12000);
        ComponenteMenu pizza = new Plato("Pizza", 10000);
        ComponenteMenu torta = new Plato("Chocotorta", 3500);
        ComponenteMenu flan = new Plato("Flan", 3000);

        // Crear submenús
        Menu menuEntradas = new Menu("Entradas");
        menuEntradas.agregar(ensalada);
        menuEntradas.agregar(sopa);

        Menu menuPrincipales = new Menu("Platos Principales");
        menuPrincipales.agregar(Mila);
        menuPrincipales.agregar(pizza);

        Menu menuPostres = new Menu("Postres");
        menuPostres.agregar(torta);
        menuPostres.agregar(flan);

        // Crear menú infantil (submenú dentro de "Platos Principales")
        ComponenteMenu pure = new Plato("Pure de papa con nugges de pollo", 8000);
        ComponenteMenu papas = new Plato("Papas Fritas", 5000);
        Menu menuInfantil = new Menu("Menú Infantil");
        menuInfantil.agregar(pure);
        menuInfantil.agregar(papas);
        menuPrincipales.agregar(menuInfantil);

        // Crear menú principal
        Menu menuPrincipal = new Menu("Menú del Día");
        menuPrincipal.agregar(menuEntradas);
        menuPrincipal.agregar(menuPrincipales);
        menuPrincipal.agregar(menuPostres);

        // Mostrar el menú completo
        menuPrincipal.mostrar(0);

        // Calcular el precio total del menú
        System.out.printf("%nPrecio total del menú: $%.2f%n", menuPrincipal.getPrecio());
    }
}
