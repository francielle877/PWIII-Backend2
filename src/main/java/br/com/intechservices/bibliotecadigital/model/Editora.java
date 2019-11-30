package br.com.intechservices.bibliotecadigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "editora")
public class Editora {
	@Id
	@GeneratedValue
	@Column(name = "id_editora")
	private int id;
		
	@Column(name = "nm_editora")
	private String nome;
}
