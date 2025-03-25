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
package com.gkw.learnspringframework.example.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
	
	
}

@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
	
}
@Configuration
@ComponentScan
public class BeanScopestLauncherApplication {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext
				(BeanScopestLauncherApplication.class)) {
			
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));

		}
	}

}
