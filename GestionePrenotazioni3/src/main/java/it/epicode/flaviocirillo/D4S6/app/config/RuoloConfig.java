package it.epicode.flaviocirillo.D4S6.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import it.epicode.flaviocirillo.D4S6.app.entity.Ruolo;

@Configuration
public class RuoloConfig {

	@Bean
    public Ruolo r() {
        Ruolo r = new Ruolo();
        return r;
    }
}
