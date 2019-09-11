package com.company;

public class MasterMind {

    private Result result;
    private SecretCombination secretCombination;
    private UserCombination userCombination;
    private GameView gameView;
    private GameModel gameModel;
    int ancho = 5;
    int largo = 10;



    private void play(){
        do {
            secretCombination = new SecretCombination();
            userCombination = new UserCombination();
            secretCombination.compare(userCombination);

        } while (!seguir);
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
