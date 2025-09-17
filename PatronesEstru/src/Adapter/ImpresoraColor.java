package Adapter;

public class ImpresoraColor {

    public void imprimirPDF (String fileName){
        System.out.println("El archivo de tipo PDF llamado "+ fileName +" se imprimio correctamente a color");
    }

    public void imprimirWord (String fileName){
        System.out.println("El arachivo de tipo Word llamado "+fileName+ " se imprimio correctamente a color ");
    }
}
