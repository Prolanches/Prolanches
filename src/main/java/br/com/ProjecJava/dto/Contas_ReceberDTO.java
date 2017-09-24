package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Contas_Receber;
import br.com.ProjecJava.utils.DateUtils;

public class Contas_ReceberDTO {

	private Integer codigoContasReceber;
	private Integer codigoPedido;
	private String dataPedido;
	private Integer codigoTipoOP;
	private String nomeTipoOP;
	private double valorPedido;
	private String dataContasReceber;
	private double valorContasReceber;

	public Contas_ReceberDTO() {
	}
	
	public Contas_ReceberDTO(Integer codigoContasReceber, Integer codigoPedido, Integer codigoTipoOP,
			String dataContasReceber, double valorContasReceber) {
		this.codigoContasReceber = codigoContasReceber;
		this.codigoPedido = codigoPedido;
		this.codigoTipoOP = codigoTipoOP;
		this.dataContasReceber = dataContasReceber;
		this.valorContasReceber = valorContasReceber;
	}

	public Contas_ReceberDTO(Integer codigoContasReceber, Integer codigoPedido, String dataPedido, Integer codigoTipoOP,
			String nomeTipoOP, double valorPedido, String dataContasReceber, double valorContasReceber) {
		this.codigoContasReceber = codigoContasReceber;
		this.codigoPedido = codigoPedido;
		this.dataPedido = dataPedido;
		this.codigoTipoOP = codigoTipoOP;
		this.nomeTipoOP = nomeTipoOP;
		this.valorPedido = valorPedido;
		this.dataContasReceber = dataContasReceber;
		this.valorContasReceber = valorContasReceber;
	}

	public Integer getCodigoContasReceber() {
		return codigoContasReceber;
	}

	public void setCodigoContasReceber(Integer codigoContasReceber) {
		this.codigoContasReceber = codigoContasReceber;
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

	public String getDataContasReceber() {
		return dataContasReceber;
	}

	public void setDataContasReceber(String dataContasReceber) {
		this.dataContasReceber = dataContasReceber;
	}

	public double getValorContasReceber() {
		return valorContasReceber;
	}

	public void setValorContasReceber(double valorContasReceber) {
		this.valorContasReceber = valorContasReceber;
	}

	public Contas_Receber toContas_Receber() {
		return new Contas_Receber(this.codigoContasReceber, null,
				DateUtils.parseData(this.dataContasReceber, DateUtils.PATTERN_DATA_PADRAO), this.valorContasReceber);

	}
}