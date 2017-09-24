package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.utils.DateUtils;

public class PedidoDTO {

	private Integer codigoPedido;
	private String dataPedido;
	private Integer codigoTipoOP;
	private String nomeTipoOP;
	private double valorPedido;
	
	public PedidoDTO() {
	}

		public PedidoDTO(Integer codigoPedido, String dataPedido, Integer codigoTipoOP, double valorPedido) {
		super();
		this.codigoPedido = codigoPedido;
		this.dataPedido = dataPedido;
		this.codigoTipoOP = codigoTipoOP;
		this.valorPedido = valorPedido;
	}

		public PedidoDTO(Integer codigoPedido, String dataPedido, Integer codigoTipoOP, String nomeTipoOP,
			double valorPedido) {
		this.codigoPedido = codigoPedido;
		this.dataPedido = dataPedido;
		this.codigoTipoOP = codigoTipoOP;
		this.nomeTipoOP = nomeTipoOP;
		this.valorPedido = valorPedido;
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

		public Pedido toPedido() {
			return new Pedido(this.codigoPedido,DateUtils.parseData(this.dataPedido, DateUtils.PATTERN_DATA_PADRAO),null,this.valorPedido );
			
		}
	}