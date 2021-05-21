package com.sobrecarga;

public class Main {
    public static void main( String[] args ) {
        Carro nuevo = new Carro("KJAGHD", "asdfa", "masdfasarca", "kjagsdjkh", 10.0);
        Carro usado = new Carro("ASDFC", "oiuyiu", "4325rfe", "vsdfvs", 19.0, 1543.15);

        
        nuevo.imprimirReporte();
        usado.imprimirReporte();
    }
}


