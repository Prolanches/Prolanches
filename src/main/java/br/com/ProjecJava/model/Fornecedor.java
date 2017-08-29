package br.com.ProjecJava.model;

public class Fornecedor {

	private int codigo;
	private String nomeFornecedor;
	private Endereco endereco;
	private String email;
	private String telefone;
	private String cnpj;
	
		public Fornecedor(int codigo, String nomeFornecedor, Endereco endereco, String email, String telefone,
			String cnpj) {
		super();
		this.codigo = codigo;
		this.nomeFornecedor = nomeFornecedor;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.cnpj = cnpj;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
}
