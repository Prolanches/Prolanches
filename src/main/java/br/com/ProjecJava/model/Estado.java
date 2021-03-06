/**
 * Este é pacote responsavel pelas classe model
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.EstadoDTO;

/**
 * Esta é a classe responsavel pela criação de Estados
 * @author Noturno
 *
 */

public class Estado {
/**
 * Estes são os atributos do Estado
 */
	private Integer codigo;
	private String nome;
	private String uf;
	private Pais pais;
	/**
	 * Este é o construtor dos Estados, abaixo são os parametros
	 * @param codigo id banco de dados 
	 * @param nome nome do estado
	 * @param uf sigla do estado
	 * @param pais implementação da classe pais 
	 */
	public Estado() {
	}
	public Estado(Integer codigo, String nome, String uf, Pais pais) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.uf = uf;
		this.pais = pais;
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

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}


	public EstadoDTO toDTO() {
		return new EstadoDTO(this.getCodigo(),this.getNome(),this.getUf(),this.getPais().getCodigo(),this.getPais().getNome(),this.getPais().getSigla());
	}
}
