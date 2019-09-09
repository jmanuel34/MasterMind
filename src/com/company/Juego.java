package com.company;

public class Juego {
    private int longitud = 6;
    private enum claseFicha {R,B,Y,G,O,P};
    public Juego() {
        this.construirTablero(longitud);

    }
    public void jugar(){

    }
    private  void construirTablero(int longitud) {
        numero = (int) (Math.random() * longitud);
        System.out.println (numero);
    }
}
