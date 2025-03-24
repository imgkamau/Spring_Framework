/*
 * This class is responsible for running the game.
 * The GameRunner class has a dependency on MarioGame.
 * It has a constructor that accepts a MarioGame object and assigns it to the game variable
 * The run() method prints a message indicating that the game is running
 * */
package com.gkw.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole game;

	public GameRunner(@Qualifier("SuperContraGame@Qualifier") GamingConsole game) {
		this.game = game;
	}
	

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();

	}
}
