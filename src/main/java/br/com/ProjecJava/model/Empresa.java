/**
 * Este é o pacote responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pelo cadastro de Empresa usuária do Software
 * @author Noturno
 *
 */

public class Empresa {
/**
 * Este são os atributos da Empresa usuária do Software
 */
	private int codigo;
	private String nome;
	private Endereco endereco;
	private String cnpj;
	private String telefone;
	private String email;
	/**
	 * Este é o construtor da Empresa, abaixo estão os paramentros
	 * @param codigo id do Banco de Dados 
	 * @param nome nome da Empresa usuária do Software
	 * @param endereco endereço da Empresa usuária do Software
	 * @param cnpj cnpj da Empresa usuária do Software
	 * @param telefone telefone da Empresa usuária do Software
	 * @param email e-mail da Empresa usuária do Software
	 */
	public Empresa(int codigo, String nome, Endereco endereco, String cnpj, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
