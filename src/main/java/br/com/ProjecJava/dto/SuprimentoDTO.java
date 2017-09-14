package br.com.ProjecJava.dto;

public class SuprimentoDTO {

	private int codigo;
	private String nome;
	private String tipoUnidade;
	private int quantidade;
	private double custo;
	private String marca;

	public SuprimentoDTO() {
	}

	public SuprimentoDTO(int codigo, String nome, String tipoUnidade, int quantidade, double custo, String marca) {

		this.codigo = codigo;
		this.nome = nome;
		this.tipoUnidade = tipoUnidade;
		this.quantidade = quantidade;
		this.custo = custo;
		this.marca = marca;
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

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}

