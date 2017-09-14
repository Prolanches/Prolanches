package br.com.ProjecJava.dto;

public class EnderecoDTO {

	private int codigo;
	private String rua;
	private String cidade;
	
	public EnderecoDTO() {
	}
	public EnderecoDTO(String rua, String cidade) {
		this.rua = rua;
		this.cidade = cidade;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNomeCidade() {
		return cidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.cidade = nomeCidade;
	}
}
