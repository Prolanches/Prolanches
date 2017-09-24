package br.com.ProjecJava.dto;


public class Historico_PedidoDTO {

	private Integer codigoHistoricoPedido;
	private Integer codigoPedido;
	private String dataPedido;
	private Integer codigoTipoOP;
	private String nomeTipoOP;
	private double valorPedido;
	private Integer codigoFuncionario;
	private String nomeFuncionario;
	private Integer codigoFuncao;
	private String nomeFuncao;
	private Integer codigoStatusPedido;
	private String nomeStatusPedido;

	public Historico_PedidoDTO() {
	}
	

	public Historico_PedidoDTO(Integer codigoHistoricoPedido, Integer codigoPedido, Integer codigoFuncionario,
			Integer codigoStatusPedido) {
		super();
		this.codigoHistoricoPedido = codigoHistoricoPedido;
		this.codigoPedido = codigoPedido;
		this.codigoFuncionario = codigoFuncionario;
		this.codigoStatusPedido = codigoStatusPedido;
	}


	public Historico_PedidoDTO(Integer codigoHistoricoPedido, Integer codigoPedido, String dataPedido, Integer codigoTipoOP,
			String nomeTipoOP, double valorPedido, Integer codigoFuncionario, String nomeFuncionario,
			Integer codigoFuncao, String nomeFuncao, Integer codigoStatusPedido, String nomeStatusPedido) {
		super();
		this.codigoHistoricoPedido = codigoHistoricoPedido;
		this.codigoPedido = codigoPedido;
		this.dataPedido = dataPedido;
		this.codigoTipoOP = codigoTipoOP;
		this.nomeTipoOP = nomeTipoOP;
		this.valorPedido = valorPedido;
		this.codigoFuncionario = codigoFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.codigoFuncao = codigoFuncao;
		this.nomeFuncao = nomeFuncao;
		this.codigoStatusPedido = codigoStatusPedido;
		this.nomeStatusPedido = nomeStatusPedido;
	}

	public Integer getCodigoHistoricoPedido() {
		return codigoHistoricoPedido;
	}

	public void setCodigoHistoricoPedido(Integer codigoHistoricoPedido) {
		this.codigoHistoricoPedido = codigoHistoricoPedido;
	}

	public Integer getCodigoPedido() {
		return codigoPedido;
	}

	public void setCodigoPedido(Integer codigoPedido) {
		this.codigoPedido = codigoPedido;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Integer getCodigoTipoOP() {
		return codigoTipoOP;
	}

	public void setCodigoTipoOP(Integer codigoTipoOP) {
		this.codigoTipoOP = codigoTipoOP;
	}

	public String getNomeTipoOP() {
		return nomeTipoOP;
	}

	public void setNomeTipoOP(String nomeTipoOP) {
		this.nomeTipoOP = nomeTipoOP;
	}

	public double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
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

	public Integer getCodigoStatusPedido() {
		return codigoStatusPedido;
	}

	public void setCodigoStatusPedido(Integer codigoStatusPedido) {
		this.codigoStatusPedido = codigoStatusPedido;
	}

	public String getNomeStatusPedido() {
		return nomeStatusPedido;
	}

	public void setNomeStatusPedido(String nomeStatusPedido) {
		this.nomeStatusPedido = nomeStatusPedido;
	}

}