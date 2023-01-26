package it.epicode.be.gestioneventi.model;
import javax.persistence.Entity;


import lombok.Getter;

import lombok.Setter;

@Entity
@Getter
@Setter
public class PartitaDiCalcio extends Evento {
	
	private String squadraDiCasa;
	private String squadraOspite;
	private String squadraVincente;
	private Integer numGolCasa = 0;
	public String getSquadraDiCasa() {
		return squadraDiCasa;
	}
	
}
