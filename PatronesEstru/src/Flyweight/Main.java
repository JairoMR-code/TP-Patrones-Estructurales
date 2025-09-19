package Flyweight;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        //La clase FabricaDeArboles y la interfaz Arbol son las que ejecer la responsabilidad
        // de mostrar un determinado tipo de Arbol en cualquier posicion solo creando una instancia
        // de este sola una vez.

        FabricaDeArboles fabrica = new FabricaDeArboles();
        Random random = new Random();

        String[] tipos = {"Pino", "Roble", "Abeto"};
        String[] texturas = {"Rugosa", "Lisa"};
        String[] colores = {"Verde", "Marrón"};
        long inicio = System.currentTimeMillis();
        for (int i =0; i<=1000000; i++){
            // propiedades intrínsecas
            String tipo = tipos[random.nextInt(tipos.length)];
            String textura = texturas[random.nextInt(texturas.length)];
            String color = colores[random.nextInt(colores.length)];

            Arbol arbol = fabrica.sumarArbol(tipo, textura, color);

            arbol.posicionar(random.nextInt(1000), random.nextInt(1000), random.nextInt(50) + 10);

        }

        long fin = System.currentTimeMillis();
        System.out.printf("Creados 1,000,000 árboles en %d ms%n", fin - inicio);
        System.out.printf("Instancias únicas creadas: %d%n", fabrica.lista.size());
    }
}
