package br.com.ProjecJava.model;

public class Funcao {

	private int codigo;
	private String nomeFuncao;
	
	public Funcao(int codigo, String nomeFuncao) {
		this.codigo = codigo;
		this.nomeFuncao = nomeFuncao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeFuncao() {
		return nomeFuncao;
	}

	public void setNomeFuncao(String nomeFuncao) {
		this.nomeFuncao = nomeFuncao;
	}
	
	
	
	
}
