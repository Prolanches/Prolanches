/**
 * Este é o pacote responsavel pelas classes model
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.EnderecoDTO;


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

	private Integer codigo;
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
	public Endereco() {
	}

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
	public Endereco(Integer codigo, String rua, Cidade cidade) {
		super();
		this.codigo = codigo;
		this.rua = rua;
		this.cidade = cidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade Cidade) {
		this.cidade = Cidade;
	}

	public EnderecoDTO toDTO() {
		return new EnderecoDTO(this.getCodigo(), this.getRua(), this.getCidade().getCodigo(),
				this.getCidade().getNome(), this.getCidade().getEstado().getCodigo(),
				this.getCidade().getEstado().getNome(), this.getCidade().getEstado().getUf(),
				this.getCidade().getEstado().getPais().getCodigo(), this.getCidade().getEstado().getPais().getNome(),
				this.getCidade().getEstado().getPais().getSigla());

	}
}
