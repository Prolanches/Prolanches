package br.com.ProjecJava.dto;

public class Status_PedidoDTO {

	private int codigo;
	private String nome;

	public Status_PedidoDTO() {
	}

	public Status_PedidoDTO(int codigo, String nome) {
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