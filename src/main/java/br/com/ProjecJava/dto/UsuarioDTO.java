package br.com.ProjecJava.dto;


public class UsuarioDTO {

	private Integer codigoUsuario;
	private String loginUsuario;
	private Integer codigoFuncionario;
	private String nomeFuncionario;
	private Integer codigoFuncao;
	private String nomeFuncao;
	private Integer codigoEmpresa;
	private String nomeEmpresa;
	private Integer codigoEndereco;
	private String ruaEmpresa;
	private Integer codigoCidade;
	private String nomeCidade;
	private Integer codigoUF;
	private String nomeUF;
	private String siglaUF;
	private Integer codigoPais;
	private String nomePais;
	private String siglaPais;
	private String cnpjEmpresa;
	private String telefoneEmpresa;
	private String emailEmpresa;
	private String senhaUsuario;
	private Integer codigoPerfil;
	private String nivelPerfil;
	
	public UsuarioDTO(Integer codigoUsuario,String loginUsuario,Integer codigoFuncionario,String senhaUsuario,Integer codigoPerfil) {
		this.codigoUsuario=codigoUsuario;
		this.loginUsuario=loginUsuario;
		this.codigoFuncionario=codigoFuncionario;
		this.senhaUsuario=senhaUsuario;
		this.codigoPerfil=codigoPerfil;
	}

	
	public UsuarioDTO() {
	}

	public UsuarioDTO(Integer codigoUsuario, String loginUsuario, Integer codigoFuncionario, String nomeFuncionario,
			Integer codigoFuncao, String nomeFuncao, Integer codigoEmpresa, String nomeEmpresa, Integer codigoEndereco,
			String ruaEmpresa, Integer codigoCidade, String nomeCidade, Integer codigoUF, String nomeUF, String siglaUF,
			Integer codigoPais, String nomePais, String siglaPais, String cnpjEmpresa, String telefoneEmpresa,
			String emailEmpresa, String senhaUsuario, Integer codigoPerfil, String nivelPerfil) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.loginUsuario = loginUsuario;
		this.codigoFuncionario = codigoFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.codigoFuncao = codigoFuncao;
		this.nomeFuncao = nomeFuncao;
		this.codigoEmpresa = codigoEmpresa;
		this.nomeEmpresa = nomeEmpresa;
		this.codigoEndereco = codigoEndereco;
		this.ruaEmpresa = ruaEmpresa;
		this.codigoCidade = codigoCidade;
		this.nomeCidade = nomeCidade;
		this.codigoUF = codigoUF;
		this.nomeUF = nomeUF;
		this.siglaUF = siglaUF;
		this.codigoPais = codigoPais;
		this.nomePais = nomePais;
		this.siglaPais = siglaPais;
		this.cnpjEmpresa = cnpjEmpresa;
		this.telefoneEmpresa = telefoneEmpresa;
		this.emailEmpresa = emailEmpresa;
		this.senhaUsuario = senhaUsuario;
		this.codigoPerfil = codigoPerfil;
		this.nivelPerfil = nivelPerfil;
	}

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public Integer getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(Integer codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public Integer getCodigoFuncao() {
		return codigoFuncao;
	}

	public void setCodigoFuncao(Integer codigoFuncao) {
		this.codigoFuncao = codigoFuncao;
	}

	public String getNomeFuncao() {
		return nomeFuncao;
	}

	public void setNomeFuncao(String nomeFuncao) {
		this.nomeFuncao = nomeFuncao;
	}

	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Integer getCodigoEndereco() {
		return codigoEndereco;
	}

	public void setCodigoEndereco(Integer codigoEndereco) {
		this.codigoEndereco = codigoEndereco;
	}

	public String getRuaEmpresa() {
		return ruaEmpresa;
	}

	public void setRuaEmpresa(String ruaEmpresa) {
		this.ruaEmpresa = ruaEmpresa;
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

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	public String getTelefoneEmpresa() {
		return telefoneEmpresa;
	}

	public void setTelefoneEmpresa(String telefoneEmpresa) {
		this.telefoneEmpresa = telefoneEmpresa;
	}

	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Integer getCodigoPerfil() {
		return codigoPerfil;
	}

	public void setCodigoPerfil(Integer codigoPerfil) {
		this.codigoPerfil = codigoPerfil;
	}

	public String getNivelPerfil() {
		return nivelPerfil;
	}

	public void setNivelPerfil(String nivelPerfil) {
		this.nivelPerfil = nivelPerfil;
	}
}