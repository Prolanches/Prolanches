/**
 * Este é o pacote responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pelo Produto
 * 
 * @author Noturno
 *
 */
public class Produto {
	/**
	 * Este são os atributos do Produto
	 */

	private int codigo;
	private String nome;
	private double margemLucro;
	private double preco;

	/**
	 * Este é o construtor de Produtos, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            id do Bando de Dados
	 * @param nome
	 *            nome do Produto
	 * @param margemLucro
	 *            margem de lucro do produto para fazer o calculo do preço
	 * @param preco
	 *            preco gerado automaticamento pelo agrupamento da soma de
	 *            custo*margem de lucro
	 */

	public Produto(int codigo, String nome, double margemLucro, double preco) {
		super();
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
}
