package br.com.ProjecJava.dto;

public class FornecedorDTO {
	/**
	 * Este são os atributos dos Fornecedores
	 */
	private Integer codigo;
	private String nome;
	private String cnpj;
	private Integer codigoEndereco;
	private String rua;
	private Integer codigoCidade;
	private String nomeCidade;
	private Integer codigoUF;
	private String nomeUF;
	private String siglaUF;
	private Integer codigoPais;
	private String nomePais;
	private String siglaPais;
	private String telefone;
	private String email;

	public FornecedorDTO() {
	}

	public FornecedorDTO(Integer codigo, String nome, String cnpj, Integer codigoEndereco, String rua,
			Integer codigoCidade, String telefone, String email) {
		this.codigo=codigo;
		this.nome=nome;
		this.cnpj=cnpj;
		this.codigoEndereco=codigoEndereco;
		this.rua=rua;
		this.codigoCidade=codigoCidade;
		this.telefone=telefone;
		this.email=email;
	}

	public FornecedorDTO(Integer codigo, String nome, String cnpj, Integer codigoEndereco, String rua,
			Integer codigoCidade, String nomeCidade, Integer codigoUF, String nomeUF, String siglaUF,
			Integer codigoPais, String nomePais, String siglaPais, String telefone, String email) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cnpj = cnpj;
		this.codigoEndereco = codigoEndereco;
		this.rua = rua;
		this.codigoCidade = codigoCidade;
		this.nomeCidade = nomeCidade;
		this.codigoUF = codigoUF;
		this.nomeUF = nomeUF;
		this.siglaUF = siglaUF;
		this.codigoPais = codigoPais;
		this.nomePais = nomePais;
		this.siglaPais = siglaPais;
		this.telefone = telefone;
		this.email = email;
	}

	public Integer getCodigo() {
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

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Integer getCodigoEndereco() {
		return codigoEndereco;
	}

	public void setCodigoEndereco(Integer codigoEndereco) {
		this.codigoEndereco = codigoEndereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getCodigoCidade() {
		return codigoCidade;
	}

	public void setCodigoCidade(Integer codigoCidade) {
		this.codigoCidade = codigoCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public Integer getCodigoUF() {
		return codigoUF;
	}

	public void setCodigoUF(Integer codigoUF) {
		this.codigoUF = codigoUF;
	}

	public String getNomeUF() {
		return nomeUF;
	}

	public void setNomeUF(String nomeUF) {
		this.nomeUF = nomeUF;
	}

	public String getSiglaUF() {
		return siglaUF;
	}

	public void setSiglaUF(String siglaUF) {
		this.siglaUF = siglaUF;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
