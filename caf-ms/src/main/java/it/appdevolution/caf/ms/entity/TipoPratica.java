package it.appdevolution.caf.ms.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="TIPO_PRATICA")
public class TipoPratica {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_TIPO_PRATICA")
	@SequenceGenerator(name = "SEQ_TIPO_PRATICA", sequenceName="SEQ_TIPO_PRATICA", allocationSize = 1)
	@Column(name="ID")
	private long id;

	@Column(name="CODICE")
	private String codice;

	@Column(name="NOME")
	private String nome;

	@Column(name="DESCRIZIONE")
	private String descrizione;
	
	@Column(name="prezzo")
	private BigDecimal prezzo;

	@Column(name="abilitata")
	private boolean abilitata;
	
	
}