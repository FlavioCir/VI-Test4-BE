package it.epicode.flaviocirillo.D4S6.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.flaviocirillo.D4S6.app.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

}
