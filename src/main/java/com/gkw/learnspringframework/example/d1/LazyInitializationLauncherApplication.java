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
package com.gkw.learnspringframework.example.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some init logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext
				(LazyInitializationLauncherApplication.class)) {
//			Arrays.stream(context.getBeanDefinitionNames())
//			.forEach(System.out::println);

			System.out.println("Initialization logic is complete");
			context.getBean(ClassB.class).doSomething();
		}
	}

}
