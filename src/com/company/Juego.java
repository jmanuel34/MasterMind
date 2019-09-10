package com.company;

public class Juego {
    public boolean compararCombinacion;
    private int ancho = 5;
    private int largo = 10;
    private char [] ficha = {'R','B','Y','G','O','P'};
    int resultado[];
    char combinacionSecreta[];
 //   char combinacionPropuesta[];
    public Juego() {
        this.construirTablero(ancho,largo);
        resultado = new int[0];
    }

    public int[] compararCombinacion(char [] combinacionPropuesta) {
        for (int i= 0; i<ancho; i++){
            for (int j= 0; j<ancho;j++) {
                if (combinacionPropuesta[j] == combinacionSecreta[i]) {
                    if (i==j) {
                        int blancas = resultado[0];
                        resultado[0]= 1 + resultado[0];
                    }
                    else {
                        resultado[1] = 1+resultado[1];
                    }
                }
            }
        }
        return resultado;
    }

    public int getLargo() {
        return largo;
    }

    private  void construirTablero(int ancho, int largo) {
        char[][] tablero = new char[ancho +1][largo];
        for (int i=0; i<ancho; i++) {
            int numero = (int) (Math.random() * largo);
            System.out.println(numero);
            combinacionSecreta[i] = ficha[numero];
            System.out.prinln (combinacionSecreta[i]);
        }
    }
}
