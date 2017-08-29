package br.com.ProjecJava.model;

public class Estado {

	private int codigo;
	private String estado;
	private Pais pais;
	
	public Estado(int codigo, String estado, Pais pais) {
		this.codigo = codigo;
		this.estado = estado;
		this.pais = pais;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
	
}
