package Carmine.Gargiulo.FS0624_Unit5_Week1_Day1;

import Carmine.Gargiulo.FS0624_Unit5_Week1_Day1.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Fs0624Unit5Week1Day1Application {

	public static void main(String[] args) {
		SpringApplication.run(Fs0624Unit5Week1Day1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Fs0624Unit5Week1Day1Application.class);
		Menu menu =(Menu) ctx.getBean("menu");
		menu.stampaMenu();

	}

}
