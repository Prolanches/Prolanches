package br.com.ProjecJava.dto;

import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.utils.DateUtils;

public class PedidoDTO {

	private int codigo;
	private String dataPedido;
	private String tipoOperacao;
	private double valor;
	
	public PedidoDTO() {
	}



	public PedidoDTO(int codigo, String dataPedido, String tipoOperacao, double valor) {

		this.codigo = codigo;
		this.dataPedido = dataPedido;
		this.tipoOperacao = tipoOperacao;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(String dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
		public Pedido toPedido() {
			return new Pedido(this.codigo,DateUtils.parseData(this.dataPedido, DateUtils.PATTERN_DATA_PADRAO),null,this.valor );
			
		}
	}