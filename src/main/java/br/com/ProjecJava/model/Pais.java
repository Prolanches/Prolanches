package br.com.ProjecJava.model;

public class Pais {

	private int codigo;
	private String pais;
	
	public Pais(int codigo, String pais) {
		this.codigo = codigo;
		this.pais = pais;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}
