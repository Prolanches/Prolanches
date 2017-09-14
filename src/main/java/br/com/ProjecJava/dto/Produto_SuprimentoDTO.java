package br.com.ProjecJava.dto;


public class Produto_SuprimentoDTO {

	private int codigo;
	private String suprimento;
	private String produto;
	private double quantidade;
	private double custo;

	public Produto_SuprimentoDTO() {
	}


	public Produto_SuprimentoDTO(int codigo, String suprimento, String produto, double quantidade, double custo) {
		this.codigo = codigo;
		this.suprimento = suprimento;
		this.produto = produto;
		this.quantidade = quantidade;
		this.custo = custo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSuprimento() {
		return suprimento;
	}

	public void setSuprimento(String suprimento) {
		this.suprimento = suprimento;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
}