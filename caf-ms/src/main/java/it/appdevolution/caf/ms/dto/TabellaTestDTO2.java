package it.appdevolution.caf.ms.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class TabellaTestDTO2 {


	private long id;

	private String codice;

	private String descrizione;

	private BigDecimal prezzo;
	
	@JsonProperty("descEstesa")
	public String getDescEstesa() {
		return this.codice + this.descrizione;
	}
	
	@JsonProperty("nomePrezzo")
	public String getNomePrezzo() {
		return this.codice +"_"+ this.prezzo;
	}
	

	
}