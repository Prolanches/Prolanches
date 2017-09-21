/**
 * Este é o pacote responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.EmpresaDTO;


/**
 * Esta é a classe responsavel pelo cadastro de Empresa usuária do Software
 * 
 * @author Noturno
 *
 */

public class Empresa {
	/**
	 * Este são os atributos da Empresa usuária do Software
	 */
	private Integer codigo;
	private String nome;
	private Endereco endereco;
	private String cnpj;
	private String telefone;
	private String email;

	/**
	 * Este é o construtor da Empresa, abaixo estão os paramentros
	 * 
	 * @param codigo
	 *            id do Banco de Dados
	 * @param nome
	 *            nome da Empresa usuária do Software
	 * @param endereco
	 *            endereço da Empresa usuária do Software
	 * @param cnpj
	 *            cnpj da Empresa usuária do Software
	 * @param telefone
	 *            telefone da Empresa usuária do Software
	 * @param email
	 *            e-mail da Empresa usuária do Software
	 */
	public Empresa() {
	}

	public Empresa(Integer codigo, String nome, Endereco endereco, String cnpj, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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

	public EmpresaDTO toDTO() {
		return new EmpresaDTO(this.getCodigo(), this.getNome(), this.getEndereco().getCodigo(),
				this.getEndereco().getRua(), this.getEndereco().getCidade().getCodigo(),
				this.getEndereco().getCidade().getNome(), this.getEndereco().getCidade().getEstado().getCodigo(),
				this.getEndereco().getCidade().getEstado().getNome(),
				this.getEndereco().getCidade().getEstado().getUf(),
				this.getEndereco().getCidade().getEstado().getPais().getCodigo(),
				this.getEndereco().getCidade().getEstado().getPais().getNome(),
				this.getEndereco().getCidade().getEstado().getPais().getSigla(), this.getCnpj(), this.getTelefone(),
				this.getEmail());

	}
}
