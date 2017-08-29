package br.com.ProjecJava.model;

public class Estado {

	private int codigo;
	private String nomeEstado;
	private Pais pais;
	
	public Estado(int codigo, String estado, Pais pais) {
		this.codigo = codigo;
		this.nomeEstado = estado;
		this.pais = pais;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return nomeEstado;
	}

	public void setEstado(String estado) {
		this.nomeEstado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
}
