/**
 * Este pacote é responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;
/**
 * Esta classe é responsavel pela criação de Funções do Funcionários
 * @author Noturno
 *
 */
public class Funcao {
/**
 * Este são os atributos das Funções 
 */
	private int codigo;
	private String nome;
	/**
	 * Este é o construtor da Função, abaixo segue parametros
	 * @param codigo id do Bando de Dados 
	 * @param nome nome da Função
	 */
	public Funcao(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
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
	
	
	
	
}
