package br.com.ProjecJava.model;

import java.sql.Date;

public class ProdutoPedido {
	
		private int codigo;
		private Date dataPedido;
		private Pedido pedido;
		private Produto produto;
		private String nomeCliente;
		
		public ProdutoPedido(int codigo, Date dataPedido, Pedido pedido, Produto produto, String nomeCliente) {
			this.codigo = codigo;
			this.dataPedido = dataPedido;
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

		public Date getDataPedido() {
			return dataPedido;
		}

		public void setDataPedido(Date dataPedido) {
			this.dataPedido = dataPedido;
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
