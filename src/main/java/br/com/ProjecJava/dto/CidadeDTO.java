package br.com.ProjecJava.dto;

public class CidadeDTO {

	private Integer codigo;
	private String nome;
	private String nomeEst;
	private Integer codigoEst;
	private String ufEst;
	private Integer codigoPais;
	private String nomePais;
	private String siglaPais;
	

	

	public CidadeDTO(Integer codigo, String nome, String nomeEst, Integer codigoEst) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.nomeEst = nomeEst;
		
	}

	public String getNomeEst() {
		return nomeEst;
	}

	public void setNomeEst(String nomeEst) {
		this.nomeEst = nomeEst;
	}

	public Integer getCodigoEst() {
		return codigoEst;
	}

	public void setCodigoEst(Integer codigoEst) {
		this.codigoEst = codigoEst;
	}

	public String getUfEst() {
		return ufEst;
	}

	public void setUfEst(String ufEst) {
		this.ufEst = ufEst;
	}

	public Integer getCodigoPais() {
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

}
