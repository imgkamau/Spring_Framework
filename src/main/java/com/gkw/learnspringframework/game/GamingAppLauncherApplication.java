/*
 * This is the main entry point of the application.
 * It imports the necessary classes from the game package.
 *Inside main(), it creates a MarioGame object.
 *Then, it passes the MarioGame object to GameRunner, following constructor-based dependency injection.
 *Finally, it calls gameRunner.run(), which prints a message.
 *Using var to simplify code
 *Its a new feature introduced in Java 10.
 *Type inference: Allows the compiler to infer the type of the variable based on the value assigned.
 *Readable code by reducing boilerplate 
		 * */
package com.gkw.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//
//import com.gkw.learnspringframework.game.GameRunner;
//import com.gkw.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.gkw.learnspringframework.game")
public class GamingAppLauncherApplication {

//	@Bean
//	public GamingConsole game() {
//		var game = new PacManGame();
//		return game;
//	}

//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		System.out.println("Parameter: " + game);
//		var gameRunner = new GameRunner(game);
//		return gameRunner;
//	}

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext
				(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}

}
