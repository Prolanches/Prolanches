/**
 * Este pacote é responsavel pelas classes Service
 */
package br.com.ProjecJava.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.ProjecJava.DAO.FuncaoDAO;
import br.com.ProjecJava.jdbc.ConnectionPoolOracle;
import br.com.ProjecJava.model.Funcao;
/**
 * 
 * Esta classe é responsavel pela Classe FuncaoService
 * @author Lucas Braz
 *
 */

public class FuncaoService {
	/**
	 * Este é o metodo responsavel pela listagem da Função
	 * @return mostrará a funcao
	 * @throws SQLException 
	 */
	public static List<Funcao> listarFuncao() throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			return new FuncaoDAO(conex).lista();
		}
	}
	/**
	 * Metodo para inserir 
	 * @param funcao
	 * @throws SQLException
	 */
	public void inserir(Funcao funcao) throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FuncaoDAO(conex).inserir(funcao);
		}
	}
	/**
	 * Metodo alterar
	 * @param funcao
	 * @throws SQLException
	 */
	public void alterar(Funcao funcao)throws SQLException{
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FuncaoDAO(conex).alterar(funcao);
		}
	}
	/**
	 * Metodo excluir 
	 * @param funcao
	 * @throws SQLException
	 */
	public void excluir(int codigo) throws SQLException {
		try (Connection conex = new ConnectionPoolOracle().getConnection()) {
			new FuncaoDAO(conex).excluir(codigo);
		}
	}
}
