package br.com.ProjecJava.model;

public class Historico {

	private int codigo;
	private Pedido pedido;
	private Funcionario funcionario;
	private StatusPedido statusPedido;
	
	public Historico(int codigo, Pedido pedido, Funcionario funcionario, StatusPedido statusPedido) {
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}
	
	
	
}
