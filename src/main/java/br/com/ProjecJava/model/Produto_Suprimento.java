/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pela ligação das tabelas entre Produto e
 * Suprimento
 * 
 * @author Noturno
 *
 */
public class Produto_Suprimento {
	/**
	 * Este são os atributos do Produto_Suprimento
	 */
	private Integer codigo;
	private Suprimento suprimento;
	private Produto produto;
	private double quantidade;
	private double custo;

	/**
	 * Este é o construtor da classe Produto_Suprimento, abaixo estão seus
	 * parametros
	 * 
	 * @param codigo
	 *            id do Banco de Dados
	 * @param suprimento
	 *            implementação da Classe Suprimento
	 * @param produto
	 *            implementação da Classe Produto
	 * @param quantidade
	 *            quantidade em relação à criação do Produto
	 * @param custo
	 *            custo agrupado a soma automaticamente pelo rateio de suprimentos
	 */

	public Produto_Suprimento() {
		
	}
	public Produto_Suprimento(Integer codigo, Suprimento suprimento, Produto produto, double quantidade, double custo) {
		super();
		this.codigo = codigo;
		this.suprimento = suprimento;
		this.produto = produto;
		this.quantidade = quantidade;
		this.custo = custo;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Suprimento getSuprimento() {
		return suprimento;
	}

	public void setSuprimento(Suprimento suprimento) {
		this.suprimento = suprimento;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
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
