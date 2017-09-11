/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

import java.util.Date;

/**
 * Esta é a classe responsavel pelo Contas à Pagar para geração de relatórios
 * 
 * @author Noturno
 *
 */
public class Contas_Pagar {
	/**
	 * Este são os atributos de Contas à Pagar
	 */
	private int codigo;
	private double custo;
	private Suprimento suprimento;
	private Date data;
	private Fornecedor fornecedor;

	/**
	 * Este é o construtor Contas_Pagar, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            ID do Bando de Dados
	 * @param custo
	 *            custo do agrupamento de valores do Suprimento para geração de
	 *            relatórios
	 * @param suprimento
	 *            implementação da Classe Suprimento para geração de relatórios
	 * @param data
	 *            registro de data para geração de relatórios
	 */

	public Contas_Pagar(int codigo, double custo, Suprimento suprimento, Date data,Fornecedor fornecedor) {
		super();
		this.codigo = codigo;
		this.custo = custo;
		this.suprimento = suprimento;
		this.data = data;
		this.fornecedor = fornecedor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public Suprimento getSuprimento() {
		return suprimento;
	}

	public void setSuprimento(Suprimento suprimento) {
		this.suprimento = suprimento;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

}
