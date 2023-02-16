package it.epicode.flaviocirillo.D4S6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import it.epicode.flaviocirillo.D4S6.entity.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class UtenteConfig {
	
	@Bean
	@Scope("prototype")
	public Utente user(String username, String nome, String email, String password) {
		return Utente.builder()
				.username(username)
				.nome(nome)
				.email(email)
				.password(password)
				.attivo(true)
				.build();
	}

}
