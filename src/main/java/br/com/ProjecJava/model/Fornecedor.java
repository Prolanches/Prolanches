/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pelos Fornecedores
 * 
 * @author Noturno
 *
 */

public class Fornecedor {
	/**
	 * Este são os atributos dos Fornecedores
	 */
	private int codigo;
	private String nome;
	private String cnpj;
	private Endereco endereco;
	private String telefone;
	private String email;

	/**
	 * Este é o construtor de Fornecedores, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            id do Bando de Dados
	 * @param nome
	 *            nome do Fornecedor
	 * @param cnpj
	 *            cnpj do Fornecedor
	 * @param endereco
	 *            implementação da Classe Endereco
	 * @param telefone
	 *            telefone do Fornecedor
	 * @param email
	 *            e-mail do Fornecedor
	 */
	public Fornecedor(int codigo, String nome, String cnpj, Endereco endereco, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	/**
	 * Este é o construtor de Fornecedores, abaixo estão seus parametros
	 * 
	 * @param nome
	 *            - nome do Fornecedor
	 * @param cnpj
	 *            - cnpj do Fornecedor
	 * @param endereco
	 *            - implementação da Classe Endereco
	 * @param telefone
	 *            - telefone do Fornecedor
	 * @param email
	 *            - e-mail do Fornecedor
	 */
	public Fornecedor(String nome, String cnpj, Endereco endereco, String telefone, String email) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
