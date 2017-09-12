/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Historico_PedidoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Historico_Pedido;
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
	public void inserir(Historico_Pedido historico_pedido) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()){
			new Historico_PedidoDAO(conex).inserir(historico_pedido);
		}
	}
	/**
	 * Este é o metodo responsavel pela listagem do Historico_Pedido
	 * @return mostrará o Historico_Pedido
	 * @throws SQLException 
	 */
	public static List<Historico_Pedido> listarHistorico_Pedido() throws SQLException {
		try(Connection conex = new ConnectionPoolOracle().getConnection()){
			return new Historico_PedidoDAO(conex).lista();
		}
	}
}
