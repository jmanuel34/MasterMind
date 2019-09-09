package com.company;

import java.io.IOException;

public class Interfaz {
    public Interfaz(){
        this.menuPrincipal();
    }
    private void menuPrincipal() {
        char respuesta='s';
        do {
            Juego juego = new Juego();
            juego.jugar();
            System.out.println("Desea jugar otra vez? s/n");
            try {
                respuesta = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (respuesta !='n');

    }
}
