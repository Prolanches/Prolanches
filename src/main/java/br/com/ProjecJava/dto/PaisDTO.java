package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Pais;

public class PaisDTO {

	private Integer codigoPais;
	private String nomePais;
	private String siglaPais;


	public PaisDTO() {
	}
	public PaisDTO(Integer codigoPais, String nomePais, String siglaPais) {
		super();
		this.codigoPais = codigoPais;
		this.nomePais = nomePais;
		this.siglaPais = siglaPais;
	}
	public Integer getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	public String getSiglaPais() {
		return siglaPais;
	}
	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}
	public Pais toPais() {
		return new Pais(this.codigoPais, this.nomePais, this.siglaPais);
}
}

