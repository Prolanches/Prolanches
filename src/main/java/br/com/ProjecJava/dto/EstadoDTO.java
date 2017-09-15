package br.com.ProjecJava.dto;

public class EstadoDTO {

	private Integer codigo;
	private String nome;
	private String uf;
	private String pais;

	public EstadoDTO(int codigo, String estado, String pais, String sigla) {
		this.codigo = codigo;
		this.nome = estado;
		this.uf = sigla;
		this.pais = pais;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
}
