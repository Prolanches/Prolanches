package br.com.ProjecJava.model;

import java.sql.Date;

public class ContasAPagar {
	
	private int codigo;
	private Suprimento suprimento;
	private double valorConta;
	private Date data;
	
	public ContasAPagar(int codigo, Suprimento nomeConta, double valorConta, Date data) {
		this.codigo = codigo;
		this.suprimento = nomeConta;
		this.valorConta = valorConta;
		this.data = data;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Suprimento getNomeConta() {
		return suprimento;
	}

	public void setNomeConta(Suprimento nomeConta) {
		this.suprimento = nomeConta;
	}

	public double getValorConta() {
		return valorConta;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
