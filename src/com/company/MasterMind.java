package com.company;

public class MasterMind {

  private View view;
  private Game game;


  private MasterMind() {
	  this.game = new Game();
	  this.view = new View(this.game);
  }
  
    private void play(){
    	view.interact();
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
