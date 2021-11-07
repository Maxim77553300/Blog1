package by.euromaxima.blog1.blog1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Blog1Application {

	private static final Logger logger = Logger.getGlobal();

	public static void main(String[] args) {
		SpringApplication.run(Blog1Application.class, args);
	}

}
