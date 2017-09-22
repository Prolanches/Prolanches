/**
 * Este é o pacote responsavel pelas classes model
 */
package br.com.ProjecJava.model;


import br.com.ProjecJava.dto.Tipo_UnidadeDTO;

/**
 * Esta é a classe responsavel pela criação dos Tipos de Unidades (Kg, Litro, Gramas)
 * @author Noturno
 *
 */

public class Tipo_Unidade {
/**
 * Este são os atributos do Tipo de Unidade
 */
	private Integer codigo;
	private String nome;
	private double unidade;
	/**
	 * Este é o construtor do Tipo de Unidade, abaixo estão os parametros
	 * @param codigo id do banco de dados 
	 * @param nome nome da unidade (Kg, Litro, Gramas)
	 * @param unidade valores das unidades (Kg, Litro, Gramas)
	 */
	
	public Tipo_Unidade() {
	}
	
	public Tipo_Unidade(Integer codigo, String nome, double unidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.unidade = unidade;
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

	public double getUnidade() {
		return unidade;
	}

	public void setUnidade(double unidade) {
		this.unidade = unidade;
	}
	public Tipo_UnidadeDTO toDTO() {
		return new Tipo_UnidadeDTO(this.getCodigo(),this.getNome(),this.getUnidade());
		
	}
	
}

	
