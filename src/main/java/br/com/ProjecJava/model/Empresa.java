package br.com.ProjecJava.model;

public class Empresa {

	private int codigo;
	private String nomeEmpresa;
	private Endereco endereco;
	private String cnpj;
	private String telefone;
	private String email;
	
	public Empresa(int codigo, String nomeEmpresa, Endereco endereco, String cpfCnpj, String telefone, String email) {
		this.codigo = codigo;
		this.nomeEmpresa = nomeEmpresa;
		this.endereco = endereco;
		this.cnpj = cpfCnpj;
		this.telefone = telefone;
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCpfCnpj() {
		return cnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cnpj = cpfCnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
