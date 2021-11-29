package com.sarra.livres.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long idCl;
	private String nomCl;
	private String descriptionCl;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Livre> livres;
	
	
	public List<Livre> getLivres() {
		return livres;
	}
	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}
	
	public Long getIdCl() {
		return idCl;
	}
	public void setIdCl(Long idCl) {
		this.idCl = idCl;
	}
	public String getNomCl() {
		return nomCl;
	}
	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}
	public String getDescriptionCl() {
		return descriptionCl;
	}
	public void setDescriptionCl(String descriptionCl) {
		this.descriptionCl = descriptionCl;
	}
	
	
	
	
	
}
