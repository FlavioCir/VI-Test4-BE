package it.epicode.flaviocirillo.D4S6.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.flaviocirillo.D4S6.entity.Ruolo;

@Repository
public interface RuoloRepository extends JpaRepository<Ruolo, Integer> {

}
