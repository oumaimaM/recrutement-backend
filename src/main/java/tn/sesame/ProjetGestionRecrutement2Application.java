package tn.sesame;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;






@SpringBootApplication

public class ProjetGestionRecrutement2Application {
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(ProjetGestionRecrutement2Application.class, args);
	}


}