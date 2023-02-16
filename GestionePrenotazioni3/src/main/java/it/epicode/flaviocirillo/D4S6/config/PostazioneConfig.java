package it.epicode.flaviocirillo.D4S6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import it.epicode.flaviocirillo.D4S6.entity.Edificio;
import it.epicode.flaviocirillo.D4S6.entity.Postazione;
import it.epicode.flaviocirillo.D4S6.entity.TipoPostazione;

@Configuration
@PropertySource("classpath:application.properties")
public class PostazioneConfig {
	
	@Bean
    public Postazione pos() {
        Postazione pos = new Postazione();
        return pos;
    }

}
