package br.com.ProjecJava.model;

public class Produto {

	private int codigo;
	private String nomeProduto;
	private double preco;
	private double margemLucro;
	
	public Produto(int codigo, String nomeProduto, double preco, double margemLucro) {
		this.codigo = codigo;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.margemLucro = margemLucro;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	
	
}
