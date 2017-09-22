/**
 * Este é o pacote resposanvel pelas Classes Model
 */
package br.com.ProjecJava.model;


import br.com.ProjecJava.dto.PerfilDTO;

/**
 * Esta é a classe resposanvel pelo Perfil do Usuário relacionado ao Nivel de Acesso
 * @author Noturno
 *
 */

public class Perfil {
/**
 * Este são os atributos do Perfil
 */
	private Integer codigo;
	private String nivel;
	/**
	 * Este é o construtor do Perfil, abaixo está os parametros
	 * @param codigo id do Banco de Dados
	 * @param nivel nivel de acesso ao sistema de acordo com o usuário
	 */
	public Perfil() {
		
	}
	
	public Perfil(Integer codigo, String nivel) {
		super();
		this.codigo = codigo;
		this.nivel = nivel;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public PerfilDTO toDTO() {
		return new PerfilDTO(this.getCodigo(),this.getNivel());
		
	}
}
