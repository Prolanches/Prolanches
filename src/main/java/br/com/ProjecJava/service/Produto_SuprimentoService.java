/**
 * Este pacote é responsável pelas Classes services
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.Produto_SuprimentoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Produto_Suprimento;

/**
 * Esta classe é responsável pela service do Produto suprimento
 * 
 * @author Itamar Havenstein
 *
 */
public class Produto_SuprimentoService {

	/**
	 * Método para inserir os produtos suprimentos
	 * 
	 * @param produSupri
	 * @throws SQLException
	 */
	public void inserir(Produto_Suprimento produSupri) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_SuprimentoDAO(conex).inserir(produSupri);
		}
	}

	/**
	 * Método para alterar os produtos suprimentos
	 * 
	 * @param produSupri
	 * @throws SQLException
	 */
	public void alterar(Produto_Suprimento produSupri) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_SuprimentoDAO(conex).alterar(produSupri);
		}
	}

	/**
	 * Método responsável por fazer a exclusão do item
	 * 
	 * @param codigo
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new Produto_SuprimentoDAO(conex).excluir(codigo);
		}
	}

	/**
	 * Método para listar os produtos suprimentos que estão inseridos no bancoR
	 * 
	 * @return
	 * @throws SQLException
	 */
	public static List<Produto_Suprimento> listarProdutoSuprimento() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new Produto_SuprimentoDAO(conex).listarProdutoSuprimento();
		}
	}
}
