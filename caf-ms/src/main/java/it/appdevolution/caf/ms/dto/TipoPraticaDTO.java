package it.appdevolution.caf.ms.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoPraticaDTO {
	
	private long id;

	private String codice;
	
	private String nome;

	private String descrizione;

	private BigDecimal prezzo;

	private boolean abilitata;
	
}