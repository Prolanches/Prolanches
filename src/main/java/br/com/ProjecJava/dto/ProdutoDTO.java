package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Produto;

public class ProdutoDTO {

	private Integer codigo;
	private String nome;
	private Double margemLucro;
	private Double preco;

	public ProdutoDTO() {
	}

	public ProdutoDTO(Integer codigo, String nome, double margemLucro, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.margemLucro = margemLucro;
		this.preco = preco;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(Double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Produto toProduto() {
		return new Produto(this.codigo, this.nome, this.margemLucro, this.preco);
	}
}
