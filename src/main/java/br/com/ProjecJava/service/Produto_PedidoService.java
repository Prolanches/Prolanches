/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Produto_PedidoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Produto_Pedido;


/**
 * 
 * Esta classe é responsavel pela Classe Produto_PedidoService
 * @author Lucas Braz
 *
 */
public class Produto_PedidoService {
	/**
	 * Este é o metodo responsavel pela listagem do Produto_Pedido
	 * @return mostrará o Produto_Pedido
	 * @throws SQLException 
	 */
	public static List<Produto_Pedido> listarProduto_Pedido() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Produto_PedidoDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param Produto_Pedido
	 * @throws SQLException
	 */
	public void inserir(Produto_Pedido produto_pedido) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_PedidoDAO(conex).inserir(produto_pedido);
		}
	}
	/**
	 * Metodo alterar
	 * @param Produto_Pedido
	 * @throws SQLException
	 */
	public void alterar(Produto_Pedido produto_pedido)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_PedidoDAO(conex).alterar(produto_pedido);
		}
	}
	/**
	 * Metodo excluir 
	 * @param Produto_Pedido
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_PedidoDAO(conex).excluir(codigo);
	}
	}
}
