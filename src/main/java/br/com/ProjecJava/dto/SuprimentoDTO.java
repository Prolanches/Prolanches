package br.com.ProjecJava.dto;

public class SuprimentoDTO {

	private Integer codigo;
	private String nome;
	private Integer codigoTipo_Unidade;
	private String nomeTipo_Unidade;
	private double unidadeTipo_Unidade;
	private int quantidade;
	private int quantidadeutilizada;
	private double custo;
	private Integer codigoMarca;
	private String nomeMarca;

	public SuprimentoDTO() {
	}

	public SuprimentoDTO(Integer codigo, String nome, Integer codigoTipo_Unidade, int quantidade,int quantidadeutilizada, double custo,
			Integer codigoMarca) {
		this.codigo = codigo;
		this.nome = nome;
		this.codigoTipo_Unidade = codigoTipo_Unidade;
		this.quantidade = quantidade;
		this.quantidadeutilizada=quantidadeutilizada;
		this.custo = custo;
		this.codigoMarca = codigoMarca;
	}

	public SuprimentoDTO(Integer codigo, String nome, Integer codigoTipo_Unidade, String nomeTipo_Unidade,
			double unidadeTipo_Unidade, int quantidade, int quantidadeutilizada, double custo, Integer codigoMarca,
			String nomeMarca) {
		this.codigo = codigo;
		this.nome = nome;
		this.codigoTipo_Unidade = codigoTipo_Unidade;
		this.nomeTipo_Unidade = nomeTipo_Unidade;
		this.unidadeTipo_Unidade = unidadeTipo_Unidade;
		this.quantidade = quantidade;
		this.quantidadeutilizada = quantidadeutilizada;
		this.custo = custo;
		this.codigoMarca = codigoMarca;
		this.nomeMarca = nomeMarca;
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

	public Integer getCodigoTipo_Unidade() {
		return codigoTipo_Unidade;
	}

	public void setCodigoTipo_Unidade(Integer codigoTipo_Unidade) {
		this.codigoTipo_Unidade = codigoTipo_Unidade;
	}

	public String getNomeTipo_Unidade() {
		return nomeTipo_Unidade;
	}

	public void setNomeTipo_Unidade(String nomeTipo_Unidade) {
		this.nomeTipo_Unidade = nomeTipo_Unidade;
	}

	public double getUnidadeTipo_Unidade() {
		return unidadeTipo_Unidade;
	}

	public void setUnidadeTipo_Unidade(double unidadeTipo_Unidade) {
		this.unidadeTipo_Unidade = unidadeTipo_Unidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeutilizada() {
		return quantidadeutilizada;
	}

	public void setQuantidadeutilizada(int quantidadeutilizada) {
		this.quantidadeutilizada = quantidadeutilizada;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public Integer getCodigoMarca() {
		return codigoMarca;
	}

	public void setCodigoMarca(Integer codigoMarca) {
		this.codigoMarca = codigoMarca;
	}

	public String getNomeMarca() {
		return nomeMarca;
	}

	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

}
