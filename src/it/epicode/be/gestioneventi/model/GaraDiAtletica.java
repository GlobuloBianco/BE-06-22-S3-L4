package it.epicode.be.gestioneventi.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class GaraDiAtletica extends Evento{
	
	@ManyToMany
	private Set<Persona> setAtleti;
	
	@ManyToOne
	private Persona vincitore;
}
