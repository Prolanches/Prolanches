package br.com.ProjecJava.model;

public class TipoUnidade {

	private int codigo;
	private double tipoUnidade;
	private String nome;
	
	public TipoUnidade(int codigo, double tipoUnidade, String nome) {
		this.codigo = codigo;
		this.tipoUnidade = tipoUnidade;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(double tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
