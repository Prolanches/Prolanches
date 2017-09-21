package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Produto;

public class ProdutoDTO {

	private Integer codigo;
	private String nome;
	private Double margemLucro;
	private Double preco;

	public ProdutoDTO() {
	}

	public ProdutoDTO(int codigo, String nome, double margemLucro, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.margemLucro = margemLucro;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produto toProduto() {
		return new Produto(this.codigo, this.nome, this.margemLucro, this.preco);
	}
}
