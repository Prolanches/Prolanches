package br.com.ProjecJava.model;

public class Cidade {

	private int codigo;
	private String nomeCidade;
	private Estado estado;
	
	public Cidade(int codigo, String nomeCidade, Estado nomeEstado) {
		this.codigo = codigo;
		this.nomeCidade = nomeCidade;
		this.estado = nomeEstado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Estado getNomeEstado() {
		return estado;
	}

	public void setNomeEstado(Estado nomeEstado) {
		this.estado = nomeEstado;
	}
	
	
	
}
