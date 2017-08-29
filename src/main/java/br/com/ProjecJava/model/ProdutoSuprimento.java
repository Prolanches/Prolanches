package br.com.ProjecJava.model;

public class ProdutoSuprimento {

	private int codigo;
	private Produto produto;
	private Suprimento suprimento;
	private int quantidade;
	private double custo;
	private TipoUnidade tipoUnidade;
	
	public ProdutoSuprimento(int codigo, Produto produto, Suprimento suprimento, int quantidade, double custo,
			TipoUnidade tipounidade) {
		this.codigo = codigo;
		this.produto = produto;
		this.suprimento = suprimento;
		this.quantidade = quantidade;
		this.custo = custo;
		this.tipoUnidade = tipounidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Suprimento getSuprimento() {
		return suprimento;
	}

	public void setSuprimento(Suprimento suprimento) {
		this.suprimento = suprimento;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public TipoUnidade getTipounidade() {
		return tipoUnidade;
	}

	public void setTipounidade(TipoUnidade tipounidade) {
		this.tipoUnidade = tipounidade;
	}
	
	
	
	
}
