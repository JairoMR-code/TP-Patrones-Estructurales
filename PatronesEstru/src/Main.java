import Composite.*;
import Decorator.*;
import Facade.*;
import Flyweight.*;
import Proxy.*;

import java.util.Random;

public class Main {
    public static void main (String[] args){
            /*  Decorator
            Subcripcion sub1 = new PlanBase();

            System.out.println(sub1.nombreSub() + " tiene un precio de $"+sub1.cuota());

            sub1 = new PlanHD(sub1);
            sub1 = new PlanOffline(sub1);
            sub1 = new PlanUltraHD(sub1);

            System.out.println(sub1.nombreSub() + " tiene un precio de $"+sub1.cuota());
        */

           //Facade

            Articulo art1 = new Articulo("Lapto", 2000, 2);
            Articulo art2 = new Articulo("Table S31", 4000, 1);
            Articulo art3 = new Articulo("Celular A31", 1500, 2);

            Carrito carrito = new Carrito();
            Envio envio = new Envio();
            PagoTarjeta tarjeta = new PagoTarjeta();

            FacadeTienda facade = new FacadeTienda(carrito,tarjeta,envio);
            facade.elegirArticulos(art1);
            facade.elegirArticulos(art2);

            facade.realizarCompra("Mendoza","QR");

            Articulo art4 = new Articulo("Celular TCL", 2000,3);
            Articulo art5 = new Articulo("Celular j4", 1000,1);

            facade.elegirArticulos(art5);
            facade.elegirArticulos(art3);

            facade.realizarCompra("Lujan De Cuyo","tarjeta");

            //Flyweight

//        FabricaDeArboles fabrica = new FabricaDeArboles();
//        Random random = new Random();
//
//        String[] tipos = {"Pino", "Roble", "Abeto"};
//        String[] texturas = {"Rugosa", "Lisa"};
//        String[] colores = {"Verde", "Marrón"};
//        long inicio = System.currentTimeMillis();
//        for (int i =0; i<=1000000; i++){
//            // Seleccionar aleatoriamente propiedades intrínsecas
//            String tipo = tipos[random.nextInt(tipos.length)];
//            String textura = texturas[random.nextInt(texturas.length)];
//            String color = colores[random.nextInt(colores.length)];
//
//            // Obtener o reutilizar instancia Flyweight
//            Arbol arbol = fabrica.sumarArbol(tipo, textura, color);
//
//            // Pasar estado extrínseco (posición y tamaño aleatorios)
//            arbol.posicionar(random.nextInt(1000), random.nextInt(1000), random.nextInt(50) + 10);
//
//        }
//
//        long fin = System.currentTimeMillis();
//        System.out.printf("Creados 1,000,000 árboles en %d ms%n", fin - inicio);
//        System.out.printf("Instancias únicas creadas: %d%n", fabrica.lista.size());

    //Proxy

//        Archivo archivo1 = new ArchivoProxy("documento_secreto.txt", "admin");
//        archivo1.leerArchivo();
//
//        Archivo archivo2 = new ArchivoProxy("documento_secreto.txt", "invitado");
//        archivo2.leerArchivo();

        //Composite

//        ComponenteMenu ensalada = new Plato("Ensalada", 5000);
//        ComponenteMenu sopa = new Plato("Sopa", 5000);
//        ComponenteMenu Mila = new Plato("Pure con Mila", 12000);
//        ComponenteMenu pizza = new Plato("Pizza", 10000);
//        ComponenteMenu torta = new Plato("Chocotorta", 3500);
//        ComponenteMenu flan = new Plato("Flan", 3000);
//
//        // Crear submenús
//        Menu menuEntradas = new Menu("Entradas");
//        menuEntradas.agregar(ensalada);
//        menuEntradas.agregar(sopa);
//
//        Menu menuPrincipales = new Menu("Platos Principales");
//        menuPrincipales.agregar(Mila);
//        menuPrincipales.agregar(pizza);
//
//        Menu menuPostres = new Menu("Postres");
//        menuPostres.agregar(torta);
//        menuPostres.agregar(flan);
//
//        // Crear menú infantil (submenú dentro de "Platos Principales")
//        ComponenteMenu pure = new Plato("Pure de papa con nugges de pollo", 8000);
//        ComponenteMenu papas = new Plato("Papas Fritas", 5000);
//        Menu menuInfantil = new Menu("Menú Infantil");
//        menuInfantil.agregar(pure);
//        menuInfantil.agregar(papas);
//        menuPrincipales.agregar(menuInfantil);
//
//        // Crear menú principal
//        Menu menuPrincipal = new Menu("Menú del Día");
//        menuPrincipal.agregar(menuEntradas);
//        menuPrincipal.agregar(menuPrincipales);
//        menuPrincipal.agregar(menuPostres);
//
//        // Mostrar el menú completo
//        menuPrincipal.mostrar(0);
//
//        // Calcular el precio total del menú
//        System.out.printf("%nPrecio total del menú: $%.2f%n", menuPrincipal.getPrecio());
    }

}
