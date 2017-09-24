/**
 * Este é o pacote responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pela ligação entre as tabelas Fornecedor e
 * Suprimento
 * 
 * @author Noturno
 *
 */

public class Fornecedor_Suprimento {
	/**
	 * Este são os atributos do Fornecedor_Suprimento
	 */
	private Integer codigo;
	private Fornecedor fornecedor;
	private Suprimento suprimento;

	/**
	 * Este é o construtor do Fornecedor Suprimento, abaixo estão seus
	 * parametros
	 * 
	 * @param codigo
	 *            id do Banco de Dados
	 * @param fornecedor
	 *            implementação da classe Fornecedor
	 * @param suprimento
	 *            implementação da classe Suprimento
	 */
	public Fornecedor_Suprimento() {

	}

	public Fornecedor_Suprimento(Integer codigo, Fornecedor fornecedor, Suprimento suprimento) {
		super();
		this.codigo = codigo;
		this.fornecedor = fornecedor;
		this.suprimento = suprimento;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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
