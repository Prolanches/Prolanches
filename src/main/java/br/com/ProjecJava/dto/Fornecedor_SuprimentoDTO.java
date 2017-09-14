package br.com.ProjecJava.dto;

public class Fornecedor_SuprimentoDTO {

	private int codigo;
	private String fornecedor;
	private String suprimento;
	
	public Fornecedor_SuprimentoDTO() {
	}

	public Fornecedor_SuprimentoDTO(int codigo, String fornecedor, String suprimento) {
		this.codigo = codigo;
		this.fornecedor = fornecedor;
		this.suprimento = suprimento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getSuprimento() {
		return suprimento;
	}

	public void setSuprimento(String suprimento) {
		this.suprimento = suprimento;
	}
}