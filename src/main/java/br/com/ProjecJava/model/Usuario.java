package br.com.ProjecJava.model;

public class Usuario {

	private int codigo;
	private Funcionario nomeFuncionario;
	private String senha;
	private NivelAcesso nivelAcesso;
	
	public Usuario(int codigo, Funcionario nomeFuncionario, String senha, NivelAcesso nivelAcesso) {
		this.codigo = codigo;
		this.nomeFuncionario = nomeFuncionario;
		this.senha = senha;
		this.nivelAcesso = nivelAcesso;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Funcionario getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(Funcionario nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public NivelAcesso getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(NivelAcesso nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}
	
	
	
}
