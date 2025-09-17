package Adapter;

public class ImpresoraAdapter implements Impresora{
    private ImpresoraColor impresoraAcolor;

    public ImpresoraAdapter (){
        impresoraAcolor = new ImpresoraColor();
    }

    @Override
    public void imprimir(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("PDF")){
            impresoraAcolor.imprimirPDF(fileName);
        }else  {
            impresoraAcolor.imprimirWord(fileName);
        }
    }
}
