package br.com.ProjecJava.dto;

public class PaisDTO {

	private int codigoPais;
	private String nomePais;
	private String siglaPais;


	public PaisDTO() {
	}
	public PaisDTO(int codigoPais, String nomePais, String siglaPais) {
		super();
		this.codigoPais = codigoPais;
		this.nomePais = nomePais;
		this.siglaPais = siglaPais;
	}
	public int getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(int codigoPais) {
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
}

