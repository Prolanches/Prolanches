/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

import java.sql.Date;

/**
 * Esta é a classe responsavel pelo Contas à Receber aonde será gerado
 * relatórios
 * 
 * @author Noturno
 *
 */
public class Contas_Receber {
	/**
	 * Este são os atributos de Contas à Receber
	 */
	private int codigo;
	private Pedido pedido;
	private Date data;
	private double valor;

	/**
	 * Este é o construtor Contas_Receber, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            ID do Bando de Dados
	 * @param pedido
	 *            implementação da Classe Pedido
	 * @param data
	 *            registro de data para filtro de relatórios
	 * @param valor
	 *            agrupamento de valores dos relatórios
	 */
	public Contas_Receber(int codigo, Pedido pedido, Date data, double valor) {
		super();
		this.codigo = codigo;
		this.pedido = pedido;
		this.data = data;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}