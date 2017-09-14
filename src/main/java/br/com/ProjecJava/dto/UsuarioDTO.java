package br.com.ProjecJava.dto;


public class UsuarioDTO {

	private int codigo;
	private String login;
	private String funcionario;
	private String senha;
	private String perfil;
	
	public UsuarioDTO() {
	}

	public UsuarioDTO(int codigo, String login, String funcionario, String senha, String perfil) {
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

	public String getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}