package Adapter;

public class Main {
    public static void main(String[] args){
        // El patrón Adapte queda expresado mediante la interfaz impresora la cual es la clase
        // "enchufe" entre la impresora a texto con la una imprisora a color.

    ImpresoraTexto impr = new ImpresoraTexto();

    impr.imprimir("Text", "TXT");
    impr.imprimir("Word", "Patron Adapter");
    impr.imprimir("PDF", "Formulario");


    }
}
