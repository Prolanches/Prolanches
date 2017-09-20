package br.com.ProjecJava.dto;

public class EstadoDTO {

	private Integer codigo;
	private String nome;
	private String uf;
	private Integer codigoPais;
	private String nomePais;
	private String siglaPais;

	public EstadoDTO(int codigo, String estado, String pais, String sigla) {
		this.codigo = codigo;
		this.nome = estado;
		this.uf = sigla;

	}

	public EstadoDTO(Integer codigo, String nome, String uf, int codigoPais, String nomePais, String siglaPais) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.uf = uf;
		this.codigoPais = codigoPais;
		this.nomePais = nomePais;
		this.siglaPais = siglaPais;
	}

	public int getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(Integer codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public String getSiglaPais() {
		return siglaPais;
	}

	public void setSiglaPais(String siglaPais) {
		this.siglaPais = siglaPais;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
}
