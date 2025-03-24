package com.gkw.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
		
	}
	public void down() {
		System.out.println("Squat");
		
	}
	public void left() {
		System.out.println("Stop");
		
	}
	public void right() {
		System.out.println("Accelerate");
		
	}

}
