/**
 * Este é o pacote responsavel pelas Classes Model
 */
package br.com.ProjecJava.model;


import br.com.ProjecJava.dto.UsuarioDTO;

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

	private Integer codigo;
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
	public Usuario() {
	}

	public Usuario(Integer codigo, String login, Funcionario funcionario, String senha, Perfil perfil) {
		super();
		this.codigo = codigo;
		this.login = login;
		this.funcionario = funcionario;
		this.senha = senha;
		this.perfil = perfil;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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

	public UsuarioDTO toDTO() {
		return new UsuarioDTO(this.getCodigo(), this.getLogin(), this.getFuncionario().getCodigo(),
				this.getFuncionario().getNome(), this.getFuncionario().getFuncao().getCodigo(),
				this.getFuncionario().getFuncao().getNome(), this.getFuncionario().getEmpresa().getCodigo(),
				this.getFuncionario().getEmpresa().getNome(),
				this.getFuncionario().getEmpresa().getEndereco().getCodigo(),
				this.getFuncionario().getEmpresa().getEndereco().getRua(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getCodigo(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getNome(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getEstado().getCodigo(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getEstado().getNome(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getEstado().getUf(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getEstado().getPais().getCodigo(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getEstado().getPais().getNome(),
				this.getFuncionario().getEmpresa().getEndereco().getCidade().getEstado().getPais().getSigla(),
				this.getFuncionario().getEmpresa().getCnpj(), this.getFuncionario().getEmpresa().getTelefone(),
				this.getFuncionario().getEmpresa().getEmail(), this.getSenha(), this.getPerfil().getCodigo(),
				this.getPerfil().getNivel());
	}
}
