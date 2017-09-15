package br.com.ProjecJava.dto;

public class EnderecoDTO {

	private Integer codigo;
	private String rua;
	private String cidade;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
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
