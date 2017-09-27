package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Contas_Pagar;
import br.com.ProjecJava.utils.DateUtils;

public class Contas_PagarDTO {

	private Integer codigoContas_Pagar;
	private double custoContas_Pagar;
	private String nomeFornecedor;
	private String cnpjFornecedor;
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
	private String telefoneFornecedor;
	private String emailFornecedor;
	private Integer codigo;
	private String nomeSuprimento;
	private Integer codigoTipo_Unidade;
	private String nomeTipo_Unidade;
	private double unidadeTipo_Unidade;
	private int quantidadeSuprimento;
	private int quantidadeutilizadaSuprimento;
	private double custoSuprimento;
	private Integer codigoMarca;
	private String nomeMarca;
	private String dataContas_Pagar;
	
	public Contas_PagarDTO() {
	}


	public Contas_PagarDTO(Integer codigoContas_Pagar, double custoContas_Pagar, String nomeFornecedor,
			String cnpjFornecedor, Integer codigoEndereco, String rua, Integer codigoCidade, String nomeCidade,
			Integer codigoUF, String nomeUF, String siglaUF, Integer codigoPais, String nomePais, String siglaPais,
			String telefoneFornecedor, String emailFornecedor, Integer codigo, String nomeSuprimento,
			Integer codigoTipo_Unidade, String nomeTipo_Unidade, double unidadeTipo_Unidade, int quantidadeSuprimento,
			int quantidadeutilizadaSuprimento, double custoSuprimento, Integer codigoMarca, String nomeMarca,
			String dataContas_Pagar) {
		super();
		this.codigoContas_Pagar = codigoContas_Pagar;
		this.custoContas_Pagar = custoContas_Pagar;
		this.nomeFornecedor = nomeFornecedor;
		this.cnpjFornecedor = cnpjFornecedor;
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
		this.telefoneFornecedor = telefoneFornecedor;
		this.emailFornecedor = emailFornecedor;
		this.codigo = codigo;
		this.nomeSuprimento = nomeSuprimento;
		this.codigoTipo_Unidade = codigoTipo_Unidade;
		this.nomeTipo_Unidade = nomeTipo_Unidade;
		this.unidadeTipo_Unidade = unidadeTipo_Unidade;
		this.quantidadeSuprimento = quantidadeSuprimento;
		this.quantidadeutilizadaSuprimento = quantidadeutilizadaSuprimento;
		this.custoSuprimento = custoSuprimento;
		this.codigoMarca = codigoMarca;
		this.nomeMarca = nomeMarca;
		this.dataContas_Pagar = dataContas_Pagar;
	}


	public Integer getCodigoContas_Pagar() {
		return codigoContas_Pagar;
	}


	public void setCodigoContas_Pagar(Integer codigoContas_Pagar) {
		this.codigoContas_Pagar = codigoContas_Pagar;
	}


	public double getCustoContas_Pagar() {
		return custoContas_Pagar;
	}


	public void setCustoContas_Pagar(double custoContas_Pagar) {
		this.custoContas_Pagar = custoContas_Pagar;
	}


	public String getNomeFornecedor() {
		return nomeFornecedor;
	}


	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}


	public String getCnpjFornecedor() {
		return cnpjFornecedor;
	}


	public void setCnpjFornecedor(String cnpjFornecedor) {
		this.cnpjFornecedor = cnpjFornecedor;
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


	public String getTelefoneFornecedor() {
		return telefoneFornecedor;
	}


	public void setTelefoneFornecedor(String telefoneFornecedor) {
		this.telefoneFornecedor = telefoneFornecedor;
	}


	public String getEmailFornecedor() {
		return emailFornecedor;
	}


	public void setEmailFornecedor(String emailFornecedor) {
		this.emailFornecedor = emailFornecedor;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNomeSuprimento() {
		return nomeSuprimento;
	}


	public void setNomeSuprimento(String nomeSuprimento) {
		this.nomeSuprimento = nomeSuprimento;
	}


	public Integer getCodigoTipo_Unidade() {
		return codigoTipo_Unidade;
	}


	public void setCodigoTipo_Unidade(Integer codigoTipo_Unidade) {
		this.codigoTipo_Unidade = codigoTipo_Unidade;
	}


	public String getNomeTipo_Unidade() {
		return nomeTipo_Unidade;
	}


	public void setNomeTipo_Unidade(String nomeTipo_Unidade) {
		this.nomeTipo_Unidade = nomeTipo_Unidade;
	}


	public double getUnidadeTipo_Unidade() {
		return unidadeTipo_Unidade;
	}


	public void setUnidadeTipo_Unidade(double unidadeTipo_Unidade) {
		this.unidadeTipo_Unidade = unidadeTipo_Unidade;
	}


	public int getQuantidadeSuprimento() {
		return quantidadeSuprimento;
	}


	public void setQuantidadeSuprimento(int quantidadeSuprimento) {
		this.quantidadeSuprimento = quantidadeSuprimento;
	}


	public int getQuantidadeutilizadaSuprimento() {
		return quantidadeutilizadaSuprimento;
	}


	public void setQuantidadeutilizadaSuprimento(int quantidadeutilizadaSuprimento) {
		this.quantidadeutilizadaSuprimento = quantidadeutilizadaSuprimento;
	}


	public double getCustoSuprimento() {
		return custoSuprimento;
	}


	public void setCustoSuprimento(double custoSuprimento) {
		this.custoSuprimento = custoSuprimento;
	}


	public Integer getCodigoMarca() {
		return codigoMarca;
	}


	public void setCodigoMarca(Integer codigoMarca) {
		this.codigoMarca = codigoMarca;
	}


	public String getNomeMarca() {
		return nomeMarca;
	}


	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}


	public String getDataContas_Pagar() {
		return dataContas_Pagar;
	}


	public void setDataContas_Pagar(String dataContas_Pagar) {
		this.dataContas_Pagar = dataContas_Pagar;
	}


	public Contas_Pagar toContas_Pagar() {
		return new Contas_Pagar(this.codigoContas_Pagar, this.custoContas_Pagar,null, DateUtils.parseData(this.dataContas_Pagar, DateUtils.PATTERN_DATA_PADRAO));
		
	}
}