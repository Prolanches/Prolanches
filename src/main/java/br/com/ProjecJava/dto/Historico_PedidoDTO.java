package br.com.ProjecJava.dto;


public class Historico_PedidoDTO {

	private int codigo;
	private String pedido;
	private String funcionario;
	private String statusPedido;

	public Historico_PedidoDTO() {
	}

	public Historico_PedidoDTO(int codigo, String pedido, String funcionario, String statusPedido) {
		this.codigo = codigo;
		this.pedido = pedido;
		this.funcionario = funcionario;
		this.statusPedido = statusPedido;
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

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public String getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(String statusPedido) {
		this.statusPedido = statusPedido;
	}

}
