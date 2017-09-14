package br.com.ProjecJava.dto;

public class MarcaDTO {

	private int codigo;
	private String nome;
	
	public MarcaDTO() {
	}

	public MarcaDTO(int codigo, String nome) {

		this.codigo = codigo;
		this.nome = nome;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
