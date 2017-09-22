/**
 * Este é o pacote responsavel pelas classe model
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.MarcaDTO;


/**
 * Esta é a classe resposanvel pelas Marcas do Fornecedor
 * 
 * @author Noturno
 *
 */

public class Marca {
	/**
	 * Estes são os atributos da Marca
	 */

	private Integer codigo;
	private String nome;

	/**
	 * Este é o construtor da Marca, abaixo estão os paramentros
	 * 
	 * @param codigo
	 *            id do Banco de Dados
	 * @param nome
	 *            nome da Marca
	 */
	public Marca() {
	}
	public Marca(Integer codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}

	/**
	 * Este é o construtor da marca sem o parametro codigo
	 * 
	 * @param nome
	 *            - parametro a ser adicionado
	 */

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
	public MarcaDTO toDTO() {
		return new MarcaDTO(this.getCodigo(),this.getNome());
}
}