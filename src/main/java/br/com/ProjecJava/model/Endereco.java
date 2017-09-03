/**
 * Este é o pacote responsavel pelas classes model
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pelos Endereços
 * 
 * @author Noturno
 *
 */

public class Endereco {
	/**
	 * Estes são os atributos do Endereço
	 */

	private int codigo;
	private String rua;
	private Cidade cidade;

	/**
	 * Este é o construtor dos Endereços, abaixo são os parametros
	 * 
	 * @param rua
	 *            nome da rua
	 * @param cidade
	 *            implementação da classe Cidades
	 */

	public Endereco(String rua, Cidade cidade) {
		super();
		this.rua = rua;
		this.cidade = cidade;
	}

	/**
	 * Este é o construtor ??
	 * 
	 * @param codigo
	 *            - registro do endereço
	 * @param rua
	 *            - nome da rua
	 * @param cidade-
	 *            implementação da classe Cidades
	 */
	public Endereco(int codigo, String rua, Cidade cidade) {
		super();
		this.codigo = codigo;
		this.rua = rua;
		this.cidade = cidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Cidade getNomeCidade() {
		return cidade;
	}

	public void setNomeCidade(Cidade nomeCidade) {
		this.cidade = nomeCidade;
	}
}
