package br.com.ProjecJava.dto;


public class Produto_PedidoDTO {

	private int codigo;
	private String pedido;
	private String produto;
	private String nomeCliente;
	
	public Produto_PedidoDTO() {
	}


	public Produto_PedidoDTO(int codigo, String pedido, String produto, String nomeCliente) {

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

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}
