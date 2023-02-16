package it.epicode.flaviocirillo.D4S6.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D4S6.entity.Edificio;
import it.epicode.flaviocirillo.D4S6.entity.Postazione;
import it.epicode.flaviocirillo.D4S6.entity.Prenotazione;
import it.epicode.flaviocirillo.D4S6.entity.Utente;

@Service
public class UtenteService {
	@Autowired
    private UtenteRepository utenteRepo;

    public Utente insertUtente(Utente u) {
        return utenteRepo.save(u);
    }
    
    public Optional<Utente> getById(int id) {
		return utenteRepo.findById(id);
	}
    
    public Utente save(Utente u) {
    	return utenteRepo.save(u);
    }
    
    public List<Utente> getAll() {
    	return utenteRepo.findAll();
    }
    
    public Page<Utente> getAll_page(Pageable pageable) {
		return utenteRepo.findAll(pageable);
	}
    
    public void delete(Utente u) {
		utenteRepo.delete(u);
	}

}
