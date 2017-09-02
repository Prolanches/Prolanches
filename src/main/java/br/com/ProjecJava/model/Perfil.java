/**
 * Este é o pacote resposanvel pelas Classes Model
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe resposanvel pelo Perfil do Usuário relacionado ao Nivel de Acesso
 * @author Noturno
 *
 */

public class Perfil {
/**
 * Este são os atributos do Perfil
 */
	private int codigo;
	private String nivel;
	/**
	 * Este é o construtor do Perfil, abaixo está os parametros
	 * @param codigo id do Banco de Dados
	 * @param nivel nivel de acesso ao sistema de acordo com o usuário
	 */
	public Perfil(int codigo, String nivel) {
		super();
		this.codigo = codigo;
		this.nivel = nivel;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
}
