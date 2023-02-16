package it.epicode.flaviocirillo.D4S6.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D4S6.app.entity.Ruolo;
import it.epicode.flaviocirillo.D4S6.app.repository.RuoloRepository;

@Service
public class RuoloService {

	@Autowired
	RuoloRepository rr;
	
	public Ruolo insertRuolo(Ruolo r) {
        return rr.save(r);
    }
	

}
