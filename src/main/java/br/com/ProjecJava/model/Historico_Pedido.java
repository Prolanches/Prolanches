/**
 * Este é o pacote responsavel pelas Classes Model 
 */
package br.com.ProjecJava.model;

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

	private int codigo;
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
	 *            implementação da Classe Funcionário para registrar o funcionário
	 *            que executou o pedido
	 * @param statusPedido
	 *            implementação da Classe Status_Pedido para registrar o status do
	 *            pedido
	 */
	public Historico_Pedido(int codigo, Pedido pedido, Funcionario funcionario, Status_Pedido statusPedido) {
		this.codigo = codigo;
		this.pedido = pedido;
		this.funcionario = funcionario;
		this.statusPedido = statusPedido;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
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

}
