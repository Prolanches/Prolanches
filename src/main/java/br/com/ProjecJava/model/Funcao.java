/**
 * Este pacote é responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.FuncaoDTO;


/**
 * Esta classe é responsavel pela criação de Funções do Funcionários
 * @author Noturno
 *
 */
public class Funcao {
/**
 * Este são os atributos das Funções 
 */
	private Integer codigo;
	private String nome;
	/**
	 * Este é o construtor da Função, abaixo segue parametros
	 * @param codigo id do Bando de Dados 
	 * @param nome nome da Função
	 */
	public Funcao() {
	}
	public Funcao(Integer codigo, String nome) {
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
	
	
	public FuncaoDTO toDTO() {
		return new FuncaoDTO(this.getCodigo(),this.getNome());
		
	}
	
}
