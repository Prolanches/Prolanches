package br.com.ProjecJava.model;

public class FornecedorSuprimento {

	private int codigo;
	private Fornecedor fornecedor;
	private Suprimento suprimento;
	
	public FornecedorSuprimento(int codigo, Fornecedor fornecedor, Suprimento suprimento) {
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Suprimento getSuprimento() {
		return suprimento;
	}

	public void setSuprimento(Suprimento suprimento) {
		this.suprimento = suprimento;
	}
	
	
	
}
