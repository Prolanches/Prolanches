package br.com.ProjecJava.model;

public class Suprimento {

	private int codigo;
	private String nomeSurpimento;
	private FornecedorSuprimento fornecedor;
	private Marca marca;
	private TipoUnidade tipoUnidade;
	private int quantidade;
	private double custo;
	
	public Suprimento(int codigo, String nomeSurpimento, FornecedorSuprimento fornecedor, Marca marca,
			TipoUnidade tipoUnidade, int quantidade, double custo) {
		this.codigo = codigo;
		this.nomeSurpimento = nomeSurpimento;
		this.fornecedor = fornecedor;
		this.marca = marca;
		this.tipoUnidade = tipoUnidade;
		this.quantidade = quantidade;
		this.custo = custo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeSurpimento() {
		return nomeSurpimento;
	}

	public void setNomeSurpimento(String nomeSurpimento) {
		this.nomeSurpimento = nomeSurpimento;
	}

	public FornecedorSuprimento getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(FornecedorSuprimento fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public TipoUnidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(TipoUnidade tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
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
	
	
	
}
