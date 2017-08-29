package br.com.ProjecJava.model;

public class Endereco {

	private int codigo;
	private String rua;
	private Cidade cidade;
	
	public Endereco(int codigo, String rua, Cidade nomeCidade) {
		this.codigo = codigo;
		this.rua = rua;
		this.cidade = nomeCidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Cidade getNomeCidade() {
		return cidade;
	}

	public void setNomeCidade(Cidade nomeCidade) {
		this.cidade = nomeCidade;
	}
	
	
	
}
