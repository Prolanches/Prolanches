package br.com.ProjecJava.model;

import java.sql.Date;

public class ContaAReceber {

	private int codigo;
	private double totaPedidos;
	private Date data;
	private Pedido pedido;
	
	public ContaAReceber(int codigo, double totaPedidos, Date data, Pedido pedidio) {
		super();
		this.codigo = codigo;
		this.totaPedidos = totaPedidos;
		this.data = data;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getTotaPedidos() {
		return totaPedidos;
	}
	public void setTotaPedidos(double totaPedidos) {
		this.totaPedidos = totaPedidos;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
}
