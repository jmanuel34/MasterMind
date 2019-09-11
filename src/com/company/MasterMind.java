package com.company;

public class MasterMind {

    private Result result;
    private SecretCombination secretCombination;
    private UserCombination userCombination;
    int ancho = 5;
    int largo = 10;



    private void play(){
        construirTablero();

    }

    private  void construirTablero(int largo) {
        int numero = (int) (Math.random() * largo+1);
        System.out.println (numero);
    }
    public static void main(String[] args) {
        new MasterMind().play();
    }

}
