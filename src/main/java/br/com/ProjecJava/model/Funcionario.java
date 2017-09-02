/**
 * Este é o pacote resposanvel pelas Classes Model 
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pelos Funcionários que iram utilizar o sistema
 * @author Noturno
 *
 */

public class Funcionario {
	/**
	 * Estes são os atributos do Funcionário
	 */
	

	private int codigo;
	private String nome;
	private Funcao funcao;
	private Empresa empresa;
	/**
	 * Este é o construtor da classe Funcionário, abaixo estão seus parametros
	 * @param codigo id Banco de Dados 
	 * @param nome nome do Funcionário 
	 * @param funcao função do Funcionário implementado pela classe Funcao 
	 * @param empresa empresa do Funcionário implementado pela classe Empresa
	 */
	
	public Funcionario(int codigo, String nome, Funcao funcao, Empresa empresa) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.funcao = funcao;
		this.empresa = empresa;
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
	
}
