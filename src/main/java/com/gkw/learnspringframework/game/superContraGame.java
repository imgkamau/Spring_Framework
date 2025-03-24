package com.gkw.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGame@Qualifier")
public class superContraGame implements GamingConsole {
	
	public void up() {
		System.out.println("up");
		
	}
	public void down() {
		System.out.println("sit down");
		
	}
	public void left() {
		System.out.println("Go back");
		
	}
	public void right() {
		System.out.println("Shoot");
		
	}

}
