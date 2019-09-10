package com.company;

import java.io.IOException;

public class Interfaz {
    public Interfaz(){
        this.menuPrincipal();
    }
    private void menuPrincipal() {
        char respuesta='s';
        int numeroIntentos=0;
        boolean acertado = false;

        int [] resultado;
        do {
            char [] combinacionPropuesta = new char[5];
            Juego juego = new Juego();
            while (numeroIntentos < juego.getLargo() && !acertado) {
                combinacionPropuesta = proponerCombinacion();
                resultado = juego.compararCombinacion(combinacionPropuesta);
                presentarResultado();
                numeroIntentos++;
            }
            System.out.println("Desea jugar otra vez? s/n");
            try {
                respuesta = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (respuesta !='n');

    }

    private void presentarResultado() {
    }

    private char[] proponerCombinacion() {
        char respuesta;
        ayudaCombinacion();
        char [] combinacionPropuesta = new char[5];
        for (int i=0; i<combinacionPropuesta.length; i++) {
            System.out.println("Introduce elemento : " + i + 1);
            try {
                respuesta = (char) System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return combinacionPropuesta;
    }
    private void ayudaCombinacion() {
        System.out.println("Insertar cualquier combinacion valida de 5 elementos de:");
        System.out.println("R,B,Y,G,O,P");
        System.out.println ("R(Rojo) B(Blue) Y(Yellow) G(Grey) 0(Orange) P(Purple)");
    }
}
