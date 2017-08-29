package br.com.ProjecJava.model;

public class Marca {

	private int codigo;
	private String nomeMarca;
	
	public Marca(int codigo, String nomeMarca) {
		this.codigo = codigo;
		this.nomeMarca = nomeMarca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}
	
		
	
}
