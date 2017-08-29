package br.com.ProjecJava.model;

import java.sql.Date;

public class Pedido {

	private int codigo;
	private Date dataPedido;
	private double valor;
	private TipoOperacao tipoOperacao;
	
	public Pedido(int codigo, Date dataPedido, double valor, TipoOperacao tipoOperacao) {
		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
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

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}
	
	

}
