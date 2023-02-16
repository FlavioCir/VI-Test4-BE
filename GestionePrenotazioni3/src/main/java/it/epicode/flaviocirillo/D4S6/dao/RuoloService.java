package it.epicode.flaviocirillo.D4S6.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D4S6.entity.Ruolo;

@Service
public class RuoloService {

	@Autowired
    private RuoloRepository ruoloRepo;

    public Ruolo insertRuolo(Ruolo r) {
        return ruoloRepo.save(r);
    }
	
}
