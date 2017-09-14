package br.com.ProjecJava.dto;



public class FuncionarioDTO {

	private int codigo;
	private String nome;
	private String funcao;
	private String empresa;
	
	public FuncionarioDTO() {
	}
	public FuncionarioDTO(int codigo, String nome, String funcao, String empresa) {
		this.codigo = codigo;
		this.nome = nome;
		this.funcao = funcao;
		this.empresa = empresa;
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

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
