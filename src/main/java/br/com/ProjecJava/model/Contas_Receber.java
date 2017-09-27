/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

import java.util.Date;

import br.com.ProjecJava.dto.Contas_ReceberDTO;
import br.com.ProjecJava.utils.DateUtils;

/**
 * Esta é a classe responsavel pelo Contas à Receber aonde será gerado
 * relatórios
 * 
 * @author Noturno
 *
 */
public class Contas_Receber {
	/**
	 * Este são os atributos de Contas à Receber
	 */
	private Integer codigo;
	private Pedido pedido;
	private Date data;
	private double valor;
	
	

	/**
	 * Este é o construtor Contas_Receber, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            ID do Bando de Dados
	 * @param pedido
	 *            implementação da Classe Pedido
	 * @param data
	 *            registro de data para filtro de relatórios
	 * @param valor
	 *            agrupamento de valores dos relatórios
	 */

	public Contas_Receber() {

	}

	public Contas_Receber(Integer codigo, Pedido pedido, Date data, double valor) {
		super();
		this.codigo = codigo;
		this.pedido = pedido;
		this.data = data;
		this.valor = valor;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Contas_ReceberDTO toDTO() {
		return new Contas_ReceberDTO(this.getCodigo(), this.getPedido().getCodigo(), DateUtils.formatData(this.getPedido().getDataPedido(), DateUtils.PATTERN_DATA_PADRAO),
				this.getPedido().getTipoOperacao().getCodigo(), this.getPedido().getTipoOperacao().getNomeOPeracao(),
				this.getPedido().getValor(), DateUtils.formatData(this.getData(), DateUtils.PATTERN_DATA_PADRAO),
				this.getValor());
	}
}
