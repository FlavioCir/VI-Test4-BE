package it.epicode.flaviocirillo.D4S6.app.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicode.flaviocirillo.D4S6.app.entity.Postazione;
import it.epicode.flaviocirillo.D4S6.app.entity.Prenotazione;
import it.epicode.flaviocirillo.D4S6.app.entity.Utente;

@Configuration
@PropertySource("classpath:application.properties")
public class PrenotazioneConfig {
	
	@Bean
    public Prenotazione p() {
        Prenotazione p = new Prenotazione();
        return p;
    }

}
