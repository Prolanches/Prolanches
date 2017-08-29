package br.com.ProjecJava.model;

public class TipoOperacao {

	private int codigo;
	private String nomeOPeracao;
	
	public TipoOperacao(int codigo, String nomeOPeracao) {
		this.codigo = codigo;
		this.nomeOPeracao = nomeOPeracao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeOPeracao() {
		return nomeOPeracao;
	}

	public void setNomeOPeracao(String nomeOPeracao) {
		this.nomeOPeracao = nomeOPeracao;
	}
	
	
	
}
