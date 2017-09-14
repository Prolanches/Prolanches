package br.com.ProjecJava.dto;


import br.com.ProjecJava.model.Contas_Receber;
import br.com.ProjecJava.utils.DateUtils;

public class Contas_ReceberDTO {

	private int codigo;
	private int pedido;
	private String data;
	private double valor;
	
	public Contas_ReceberDTO() {
	}
	public Contas_ReceberDTO(int codigo, int pedido, String data, double valor) {
		super();
		this.codigo = codigo;
		this.pedido = pedido;
		this.data = data;
		this.valor = valor;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
		public Contas_Receber toContas_Receber() {
			return new Contas_Receber(this.codigo, null, DateUtils.parseData(this.data, DateUtils.PATTERN_DATA_PADRAO), this.valor);
			
		}
	}