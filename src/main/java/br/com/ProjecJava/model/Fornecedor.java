package br.com.ProjecJava.model;

public class Fornecedor {

	private int codigo;
	private String nomeFornecedor;
	private Endereco endereco;
	private String email;
	
	public Fornecedor(int codigo, String nomeFornecedor, Endereco endereco, String email) {
		this.codigo = codigo;
		this.nomeFornecedor = nomeFornecedor;
		this.endereco = endereco;
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
