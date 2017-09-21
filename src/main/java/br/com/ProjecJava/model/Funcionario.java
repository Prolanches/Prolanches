/**
 * Este é o pacote resposanvel pelas Classes Model 
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.FuncionarioDTO;

/**
 * Esta é a classe responsavel pelos Funcionários que iram utilizar o sistema
 * 
 * @author Noturno
 *
 */

public class Funcionario {
	/**
	 * Estes são os atributos do Funcionário
	 */

	private Integer codigo;
	private String nome;
	private Funcao funcao;
	private Empresa empresa;

	/**
	 * Este é o construtor da classe Funcionário, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            id Banco de Dados
	 * @param nome
	 *            nome do Funcionário
	 * @param funcao
	 *            função do Funcionário implementado pela classe Funcao
	 * @param empresa
	 *            empresa do Funcionário implementado pela classe Empresa
	 */
	public Funcionario() {
	}
	public Funcionario(Integer codigo, String nome, Funcao funcao, Empresa empresa) {
		this.codigo = codigo;
		this.nome = nome;
		this.funcao = funcao;
		this.empresa = empresa;
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

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public FuncionarioDTO toDTO() {
		return new FuncionarioDTO(this.getCodigo(), this.getNome(), this.getFuncao().getCodigo(),
				this.getFuncao().getNome(), this.getEmpresa().getCodigo(), this.getEmpresa().getNome(),
				this.getEmpresa().getEndereco().getCodigo(), this.getEmpresa().getEndereco().getRua(),
				this.getEmpresa().getEndereco().getCidade().getCodigo(),
				this.getEmpresa().getEndereco().getCidade().getNome(),
				this.getEmpresa().getEndereco().getCidade().getEstado().getCodigo(),
				this.getEmpresa().getEndereco().getCidade().getEstado().getNome(),
				this.getEmpresa().getEndereco().getCidade().getEstado().getUf(),
				this.getEmpresa().getEndereco().getCidade().getEstado().getPais().getCodigo(),
				this.getEmpresa().getEndereco().getCidade().getEstado().getPais().getNome(),
				this.getEmpresa().getEndereco().getCidade().getEstado().getPais().getSigla(),
				this.getEmpresa().getCnpj(), this.getEmpresa().getTelefone(), this.getEmpresa().getEmail());

	}
}
