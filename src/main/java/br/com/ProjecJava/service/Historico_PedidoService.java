/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Historico_PedidoDAO;
import br.com.ProjecJava.dto.Historico_PedidoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Funcionario;
import br.com.ProjecJava.model.Historico_Pedido;
import br.com.ProjecJava.model.Pedido;
import br.com.ProjecJava.model.Status_Pedido;
/**
 * 
 * Esta classe é responsavel pela Classe Historico_PedidoService
 * @author Lucas Braz
 *
 */
public class Historico_PedidoService {
	/**
	 * Metodo para inserir 
	 * @param Historico_Pedido
	 * @throws SQLException
	 */
	public void inserir(Historico_PedidoDTO historico_pedidoDTO) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()){
			
			Pedido pedido = new Pedido();
			pedido.setCodigo(historico_pedidoDTO.getCodigoPedido());
			
			Funcionario funcionario = new Funcionario();
			funcionario.setCodigo(historico_pedidoDTO.getCodigoFuncionario());
			
			Status_Pedido status_pedido = new Status_Pedido();
			status_pedido.setCodigo(historico_pedidoDTO.getCodigoStatusPedido());
			
			Historico_Pedido historico_pedido = new Historico_Pedido();
			historico_pedido.setPedido(pedido);
			historico_pedido.setFuncionario(funcionario);
			historico_pedido.setStatusPedido(status_pedido);
			
			
			new Historico_PedidoDAO(conex).inserir(historico_pedido);
		}
	}
	/**
	 * Este é o metodo responsavel pela listagem do Historico_Pedido
	 * @return mostrará o Historico_Pedido
	 * @throws SQLException 
	 */
	public static List<Historico_PedidoDTO> listarHistorico_Pedido() throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			return new Historico_PedidoDAO(conex).lista();
		}
	}
}
