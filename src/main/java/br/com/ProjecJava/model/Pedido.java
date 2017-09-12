/**
 * Este é o pacote resposanvel pelas Classes Model 
 */
package br.com.ProjecJava.model;

import java.util.Date;

/**
 * Esta é a classe responsavel pelo Pedido
 * 
 * @author Noturno
 *
 */
public class Pedido {
	/**
	 * Este são os atributos do Pedido
	 */

	private int codigo;
	private Date dataPedido;
	private Tipo_Operacao tipoOperacao;
	private double valor;

	/**
	 * Este é o construtor de Pedido, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            id do Bando de Dados
	 * @param dataPedido
	 *            Data do Pedido
	 * @param tipoOperacao
	 *            implementação da Classe Tipo_Operacao (Mesa/Balção)
	 * @param valor
	 *            valor do Pedido
	 */
	public Pedido(int codigo, Date dataPedido, Tipo_Operacao tipoOperacao, double valor) {
		super();
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Tipo_Operacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(Tipo_Operacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
