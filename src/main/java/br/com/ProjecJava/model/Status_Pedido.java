/*
 * Este é o pacote responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.Status_PedidoDTO;

/**
 * Esta é a classe do Status_Pedido
 * 
 * @author Noturno
 *
 */

public class Status_Pedido {
	/**
	 * Este são os atributos do Status do Pedido
	 */

	private Integer codigo;
	private String nome;

	/**
	 * Este é o construtor do Status_Pedido, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            Id do Bando de Dados
	 * @param nome
	 *            nome do Status do Pedido
	 */
	public Status_Pedido() {

	}

	public Status_Pedido(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
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

	public Status_PedidoDTO toDTO() {
		return new Status_PedidoDTO(this.getCodigo(), this.getNome());
	}
}