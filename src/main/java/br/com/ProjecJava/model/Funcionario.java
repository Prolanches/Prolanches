package br.com.ProjecJava.model;

public class Funcionario {

	private int codigo;
	private String nomeFuncionario;
	private Empresa empresa;
	private Funcao funcao;
	private Usuario usuario;
	
	public Funcionario(int codigo, String nomeFuncionario, Empresa empresa, Funcao funcao, Usuario usuario) {
		this.codigo = codigo;
		this.nomeFuncionario = nomeFuncionario;
		this.empresa = empresa;
		this.funcao = funcao;
		this.usuario = usuario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
