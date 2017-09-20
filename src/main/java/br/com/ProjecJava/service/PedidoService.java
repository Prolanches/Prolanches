/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.PedidoDAO;
import br.com.ProjecJava.DAO.Produto_PedidoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Pedido;

/**
 * 
 * Esta classe é responsavel pela Classe PedidoService
 * @author Lucas Braz
 *
 */
public class PedidoService {
	/**
	 * Este é o metodo responsavel pela listagem dos Pedidos
	 * @return mostrará o Pedido
	 * @throws SQLException 
	 */
	public static List<Pedido> listarPedido() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new PedidoDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param pedido
	 * @throws SQLException
	 */
	public void inserir(Pedido pedido) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new PedidoDAO(conex).inserir(pedido);
		}
	}
	/**
	 * Metodo alterar
	 * @param pedido
	 * @throws SQLException
	 */
	public void alterar(Pedido pedido)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new PedidoDAO(conex).alterar(pedido);
		}
	}
	/**
	 * Metodo excluir 
	 * @param pedido
	 * @throws SQLException
	 */
	public void excluir(int codigo1,int codigo2) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_PedidoDAO(conex).excluirporpedido(codigo1);
			new PedidoDAO(conex).excluir(codigo2);
		}
	}
}
