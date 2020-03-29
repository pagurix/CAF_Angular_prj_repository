package it.appdevolution.caf.ms.domain;

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
@Table(name="TABELLA_TEST_2")
public class TabellaTest2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_TABELLA_TEST_2")
	@SequenceGenerator(name = "SEQ_TABELLA_TEST_2", sequenceName="SEQ_TABELLA_TEST_2", allocationSize = 1)
	@Column(name="ID")
	private long id;

	@Column(name="CODICE")
	private String codice;

	@Column(name="DESCRIZIONE")
	private String descrizione;
	
	@Column(name="prezzo")
	private BigDecimal prezzo;


}