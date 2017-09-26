/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

import br.com.ProjecJava.dto.Historico_PedidoDTO;
import br.com.ProjecJava.utils.DateUtils;

/**
 * Esta é a classe resposanvel pelo Histórico do Pedido
 * 
 * @author Noturno
 *
 */

public class Historico_Pedido {

	/**
	 * Este são os atributos do Histórico do Pedido
	 */

	private Integer codigo;
	private Pedido pedido;
	private Funcionario funcionario;
	private Status_Pedido statusPedido;

	/**
	 * Este é o construtor do Histórico do Pedido, abaixo estão seus parametros
	 * 
	 * @param codigo
	 *            Id do Banco de Dados
	 * @param pedido
	 *            implementação da Classe Pedido para registrar os pedidos
	 * @param funcionario
	 *            implementação da Classe Funcionário para registrar o
	 *            funcionário que executou o pedido
	 * @param statusPedido
	 *            implementação da Classe Status_Pedido para registrar o status
	 *            do pedido
	 */
	public Historico_Pedido() {

	}

	public Historico_Pedido(Integer codigo, Pedido pedido, Funcionario funcionario, Status_Pedido statusPedido) {
		this.codigo = codigo;
		this.pedido = pedido;
		this.funcionario = funcionario;
		this.statusPedido = statusPedido;
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

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Status_Pedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(Status_Pedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Historico_PedidoDTO toDTO() {
		return new Historico_PedidoDTO(this.getCodigo(), this.getPedido().getCodigo(), DateUtils.formatData(this.getPedido().getDataPedido(), DateUtils.PATTERN_DATA_PADRAO),
				this.getPedido().getTipoOperacao().getCodigo(), this.getPedido().getTipoOperacao().getNomeOPeracao(),
				this.getPedido().getValor(), this.getFuncionario().getCodigo(), this.getFuncionario().getNome(),
				this.getFuncionario().getFuncao().getCodigo(), this.getFuncionario().getFuncao().getNome(),
				this.getStatusPedido().getCodigo(), this.getStatusPedido().getNome());
	}
}
