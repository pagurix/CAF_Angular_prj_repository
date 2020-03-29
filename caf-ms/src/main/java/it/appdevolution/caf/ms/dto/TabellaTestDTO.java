package it.appdevolution.caf.ms.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class TabellaTestDTO {
	
	private long id;

	private String codice;

	private String descrizione;

	@JsonProperty("descEstesa")
	public String getDescEstesa() {
		return this.codice +"_"+ this.descrizione;
	}
	
}