/**
 * Este é pacote responsavel pelo pacote model
 */
package br.com.ProjecJava.model;


import br.com.ProjecJava.dto.PaisDTO;

/**
 * Esta é a classe responsavel pela criação de paises
 * @author Noturno
 *
 */

public class Pais {
 /**
  * Este são os atributos do Pais
  */
	private Integer codigo;
	private String nome;
	private String sigla;
/**
 * Este é o construtor da Classe Pais, abaixo são os parametros
 * @param codigo pelo cod id do pais 
 * @param nome pelo nome do pais
 * @param sigla pela sigla do pais
 */
	
	public Pais(Integer codigo, String nome, String sigla) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
	}
	public Pais() {
		
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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public PaisDTO toDTO() {
		return new PaisDTO(this.getCodigo(),this.getNome(),this.getSigla());
		
	}
}

