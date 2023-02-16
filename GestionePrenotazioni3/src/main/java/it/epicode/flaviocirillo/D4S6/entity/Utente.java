package it.epicode.flaviocirillo.D4S6.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "utenti")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Scope("prototype")
@Builder
public class Utente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int utente_id;
	private String username;
	private String nome;
	private String email;
	private String password;
	private boolean attivo;
	
	@OneToMany(mappedBy = "utente")
	private Set<Prenotazione> prenotazioni;
	
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
			name = "utente_ruolo",
			joinColumns = @JoinColumn(name = "utente_id"),
			inverseJoinColumns = @JoinColumn(name = "ruoloid")
	)
	private Set<Ruolo> ruoli = new HashSet<>();
}
