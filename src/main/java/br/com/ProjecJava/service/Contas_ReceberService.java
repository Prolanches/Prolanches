/**
 * este pacote é responsável pelas classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;


import br.com.ProjecJava.DAO.Contas_ReceberDAO;
import br.com.ProjecJava.dto.Contas_ReceberDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Contas_Receber;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Tipo_Operacao;

/**
 * Esta classe é responsável pela service do contas Receber
 * 
 * @author Lucas Braz
 *
 */
public class Contas_ReceberService {

	/**
	 * Método responsável por inserir as contas a receber
	 * 
	 * @param contasPagar construtor para inserir os dados da contas a receber
	 *            
	 * @throws SQLException
	 */
	public void inserir(Contas_ReceberDTO contas_receberDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			
			Tipo_Operacao tipo_operacao = new Tipo_Operacao();
			tipo_operacao.setCodigo(contas_receberDTO.getCodigoTipoOP());
			
			Pedido pedido = new Pedido();
			pedido.setCodigo(contas_receberDTO.getCodigoPedido());
			pedido.setTipoOperacao(tipo_operacao);
			
			Contas_Receber contas_receber = new Contas_Receber();
			contas_receber.setData(contas_receberDTO.getDataContasReceber());
			contas_receber.setPedido(pedido);
			contas_receber.setValor(contas_receberDTO.getValorContasReceber());
			
			new Contas_ReceberDAO(conex).inserir(contas_receber);
		}
	}

	/**
	 * Método para listar as contas a receber
	 * 
	 * @return - retornara todas as contas inseridas no banco
	 * @throws SQLException
	 */
	public static List<Contas_ReceberDTO> listarContas_Receber() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Contas_ReceberDAO(conex).lista();
		}
	}
}
