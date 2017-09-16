/**
 * Este pacote é responsavel pelas classes model
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.CidadeDTO;

/**
 * Esta classe é responsavel pela criação das Cidades 
 * @author Noturno
 *
 */

public class Cidade {
/**
 * Estes são os atributos das cidades 
 */
	private int codigo;
	private String nome;
	private Estado estado;
	/**
	 * Este é o construtor de cidades, abaixo são os parametros
	 * @param codigo id codigo banco de dados
	 * @param nome nome das cidades
	 * @param estado implementação classe Estados
	 */
	public Cidade() {	
	}
	public Cidade(int codigo, String nome, Estado estado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.estado = estado;
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
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
		
	
	
}
