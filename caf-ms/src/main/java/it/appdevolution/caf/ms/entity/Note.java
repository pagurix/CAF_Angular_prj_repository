package it.appdevolution.caf.ms.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="NOTE")
public class Note {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;

	@Column(name="CODICE")
	private String codice;

	@Column(name="NOME")
	private String nome;

	@Column(name="DESCRIZIONE")
	private String descrizione;

	@ManyToMany
	@JoinTable(name = "tipo_pratica_x_note", 
				joinColumns = @JoinColumn(name = "nota_id"), 
				inverseJoinColumns = @JoinColumn(name = "tipo_pratica_id"))	
	private List<TipoPratica> tipiPratica;

	
}