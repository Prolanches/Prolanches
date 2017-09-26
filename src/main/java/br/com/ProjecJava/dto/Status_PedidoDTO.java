package br.com.ProjecJava.dto;

public class Status_PedidoDTO {

	private Integer codigoStatusPedido;
	private String nomeStatusPedido;

	public Status_PedidoDTO() {
	}

	public Status_PedidoDTO(Integer codigoStatusPedido, String nomeStatusPedido) {
		super();
		this.codigoStatusPedido = codigoStatusPedido;
		this.nomeStatusPedido = nomeStatusPedido;
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