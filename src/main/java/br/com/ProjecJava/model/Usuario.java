/**
 * Este é o pacote responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;

/**
 * Esta é a classe responsavel pelo Usuário do sistema
 * 
 * @author Noturno
 *
 */

public class Usuario {
	/**
	 * Este são os atributos do Usuário
	 */

	private int codigo;
	private String login;
	private Funcionario funcionario;
	private String senha;
	private Perfil perfil;

	/**
	 * Este é o construtor da classe Usuário, abaixo estão os parametros
	 * 
	 * @param codigo
	 *            id do Bando de Dados
	 * @param login
	 *            login do Usuário
	 * @param funcionario
	 *            implementação da classe Funcionários
	 * @param senha
	 *            senha do Usuário
	 * @param perfil
	 *            implementação da classe Perfil em relação aos niveis de acesso do
	 *            sistema
	 */
	public Usuario(int codigo, String login, Funcionario funcionario, String senha, Perfil perfil) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.funcionario = funcionario;
		this.senha = senha;
		this.perfil = perfil;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
}
