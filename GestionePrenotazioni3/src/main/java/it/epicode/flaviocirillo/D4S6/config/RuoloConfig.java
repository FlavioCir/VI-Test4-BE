package it.epicode.flaviocirillo.D4S6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import it.epicode.flaviocirillo.D4S6.entity.Ruolo;
import it.epicode.flaviocirillo.D4S6.entity.TipoRuolo;

@Configuration
public class RuoloConfig {

	@Bean
	@Scope("prototype")
	public Ruolo role(TipoRuolo rt) {
		return Ruolo.builder()
				.ruolo(rt)
				.build();
	}
	
}
