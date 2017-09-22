package br.com.ProjecJava.dto;

public class MarcaDTO {

	private Integer codigoMarca;
	private String nomeMarca;
	
	public MarcaDTO() {
	}

	public MarcaDTO(Integer codigoMarca, String nomeMarca) {
		this.codigoMarca = codigoMarca;
		this.nomeMarca = nomeMarca;
	}

	public Integer getCodigoMarca() {
		return codigoMarca;
	}

	public void setCodigoMarca(Integer codigoMarca) {
		this.codigoMarca = codigoMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
}
