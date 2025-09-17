package Adapter;

public class ImpresoraTexto implements Impresora {
    private ImpresoraAdapter impresoraAdapter;

    @Override
    public void imprimir(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("Text")) {
            System.out.println("El archivo de texto " + fileName + " se imprimio correctamente ");
        } else {
            impresoraAdapter = new ImpresoraAdapter();
            impresoraAdapter.imprimir(fileType, fileName);
        }
    }
}