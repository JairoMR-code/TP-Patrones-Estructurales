package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    public final Map<String, Arbol> lista = new HashMap<>();

    public Arbol sumarArbol (String nombre,String  textura, String color){
        String clave = nombre + textura +color;
        if(!lista.containsKey(clave)){
            lista.put(clave,new ArbolReal(nombre, textura, color));
        }
        return lista.get(clave);
    }
}
