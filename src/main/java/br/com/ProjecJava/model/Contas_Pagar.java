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
	private Fornecedor_Suprimento forneSupri;
	private Date data;

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
	 * @param date
	 *            registro de data para geração de relatórios
	 */

	public Contas_Pagar(int codigo, double custo, Fornecedor_Suprimento forSup, Date data) {
		super();
		this.codigo = codigo;
		this.custo = custo;
		this.forneSupri = forSup;
		this.data = data;
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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Fornecedor_Suprimento getForneSupri() {
		return forneSupri;
	}

	public void setForneSupri(Fornecedor_Suprimento forneSupri) {
		this.forneSupri = forneSupri;
	}

}
