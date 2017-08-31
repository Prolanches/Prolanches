/*
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;


/**
 * Esta é a classe responsavel pela ligação entre Produto e Pedido
 * 
 * @author Noturno
 *
 */
public class Produto_Pedido {
	/**
	 * Este são os atributos do Produto_Pedido
	 */
	private int codigo;
	private Pedido pedido;
	private Produto produto;
	private String nomeCliente;

	/**
	 * Este é o construtor do Produto_Pedido, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            id do Bando de Dados
	 * @param pedido
	 *            implementação da Classe Pedido
	 * @param produto
	 *            implementação da Classe Produto
	 * @param nomeCliente
	 *            nome do Cliente do Pedido
	 */
	public Produto_Pedido(int codigo, Pedido pedido, Produto produto, String nomeCliente) {
		super();
		this.codigo = codigo;
		this.pedido = pedido;
		this.produto = produto;
		this.nomeCliente = nomeCliente;
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

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}
