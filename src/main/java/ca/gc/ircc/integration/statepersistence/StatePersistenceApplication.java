package ca.gc.ircc.integration.statepersistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StatePersistenceApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(StatePersistenceApplication.class, args);
	}

}
