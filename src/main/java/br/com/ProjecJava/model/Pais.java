package br.com.ProjecJava.model;

public class Pais {

	private int codigo;
	private String nomePais;
	
	public Pais(int codigo, String pais) {
		this.codigo = codigo;
		this.nomePais = pais;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPais() {
		return nomePais;
	}

	public void setPais(String pais) {
		this.nomePais = pais;
	}
	
	
	
}
