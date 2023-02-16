package it.epicode.flaviocirillo.D4S6.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicode.flaviocirillo.D4S6.app.entity.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class UtenteConfig {
	
	@Bean
    public Utente u() {
        Utente u = new Utente();
        return u;
    }

}
