/**
 * Este é o pacote responsavel pelas Classes Model
 *
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pelo Suprimento
 * 
 * @author Noturno
 *
 */
public class Suprimento {
	/**
	 * Este são os atributos do Suprimento
	 */
	private int codigo;
	private String nome;
	private Tipo_Unidade tipoUnidade;
	private int quantidade;
	private double custo;
	private Fornecedor fornecedor;
	private Marca marca;

	/**
	 * Este é o construtor da classe Suprimento, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            id do Bando de Dados
	 * @param nome
	 *            nome do Suprimento
	 * @param tipoUnidade
	 *            implementação do Tipo de Unidade (Kg, Litro, Gramas)
	 * @param quantidade
	 *            quantidade do estoque do Suprimento comprado
	 * @param custo
	 *            custo total do Suprimento comprado
	 * @param fornecedor
	 *            implementação da classe Fornecedor
	 * @param marca
	 *            implementação da classe Marca
	 */
	public Suprimento(int codigo, String nome, Tipo_Unidade tipoUnidade, int quantidade, double custo,
			Fornecedor fornecedor, Marca marca) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.tipoUnidade = tipoUnidade;
		this.quantidade = quantidade;
		this.custo = custo;
		this.fornecedor = fornecedor;
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

	public Tipo_Unidade getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(Tipo_Unidade tipoUnidade) {
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

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
