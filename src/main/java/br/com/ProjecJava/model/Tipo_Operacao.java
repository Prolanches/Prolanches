package br.com.ProjecJava.model;


import br.com.ProjecJava.dto.Tipo_OperacaoDTO;

public class Tipo_Operacao {

	private Integer codigo;
	private String nomeOPeracao;
	
	public Tipo_Operacao() {
		
	}
	
	public Tipo_Operacao(Integer codigo, String nomeOPeracao) {
		this.codigo = codigo;
		this.nomeOPeracao = nomeOPeracao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNomeOPeracao() {
		return nomeOPeracao;
	}

	public void setNomeOPeracao(String nomeOPeracao) {
		this.nomeOPeracao = nomeOPeracao;
	}
	
	public Tipo_OperacaoDTO toDTO() {
		return new Tipo_OperacaoDTO(this.getCodigo(),this.getNomeOPeracao());
		
	}
	
}
