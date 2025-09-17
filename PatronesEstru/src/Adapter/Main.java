package Adapter;

public class Main {
    public static void main(String[] args){
    ImpresoraTexto impr = new ImpresoraTexto();

    impr.imprimir("Text", "TXT");
    impr.imprimir("Word", "Patron Adapter");
    impr.imprimir("PDF", "Formulario");


    }
}
