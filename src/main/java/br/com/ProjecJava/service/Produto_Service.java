/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.ProdutoDAO;
import br.com.ProjecJava.dto.ProdutoDTO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Produto;


/**
 * 
 * Esta classe é responsavel pela Classe ProdutoService
 * @author Lucas Braz
 *
 */
public class Produto_Service {
	/**
	 * Este é o metodo responsavel pela listagem do Produto
	 * @return mostrará o Produto
	 * @throws SQLException 
	 */
	public List<ProdutoDTO> listarProduto() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new ProdutoDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param produto
	 * @throws SQLException
	 */
	public void inserir(Produto produto) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new ProdutoDAO(conex).inserir(produto);
		}
	}
	/**
	 * Metodo alterar
	 * @param produto
	 * @throws SQLException
	 */
	public void alterar(Produto produto)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new ProdutoDAO(conex).alterar(produto);
		}
	}
	/**
	 * Metodo excluir 
	 * @param produto
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new ProdutoDAO(conex).excluir(codigo);
		}
	}
}
