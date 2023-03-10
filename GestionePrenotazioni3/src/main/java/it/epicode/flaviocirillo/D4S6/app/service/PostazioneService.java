package it.epicode.flaviocirillo.D4S6.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import it.epicode.flaviocirillo.D4S6.app.entity.Edificio;
import it.epicode.flaviocirillo.D4S6.app.entity.Postazione;
import it.epicode.flaviocirillo.D4S6.app.entity.TipoPostazione;
import it.epicode.flaviocirillo.D4S6.app.repository.PostazioneRepository;

@Service
public class PostazioneService {
	
	@Autowired
    private PostazioneRepository postazioneRepo;
	
	public Postazione save(Postazione p) {
		return postazioneRepo.save(p);
	}
	

    public void insertPostazione(Postazione pos) {
        postazioneRepo.save(pos);
        System.out.println("Postazione inserita correttamente!");
    }

    public List<Postazione> getAllPostazioni() {
		return postazioneRepo.getAll();
	}
    public List<Postazione> getAll() {
    	return postazioneRepo.findAll();
    }
    public List<Postazione> getFromTipoAndCitta(String tipo, String citta) {
    	return postazioneRepo.findByTipoPostazioneAndCitt√†(tipo, citta);
    }
    
    public Optional<Postazione> getById(int id) {
		return postazioneRepo.findById(id);
	}
    
    public List<Postazione> getByTipo(String tipo) {
    	return postazioneRepo.findByTipoPostazione(tipo);
    }
    public List<Postazione> getByCitta(String citta) {
    	return postazioneRepo.findByCittaPostazione(citta);
    }
    
    public Page<Postazione> getAll_page(Pageable pageable) {
		return postazioneRepo.findAll(pageable);
	}
	
	public void delete(Postazione p) {
		postazioneRepo.delete(p);
	}
}
